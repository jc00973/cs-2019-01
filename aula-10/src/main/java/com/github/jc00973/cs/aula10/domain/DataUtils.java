package com.github.jc00973.cs.aula10.domain;

/**
 * Classe utilitária de data que verifica o dia da semana de uma data usando outra data como referência.
 */
public final class DataUtils {

    /**
     * Construtor privado para evitar instanciação indevida.
     */
    private DataUtils() { };

    /**
     * A função verifica se a data interessada é posterior à data de referência.
     *
     * @param dataInteresse A data na qual se quer saber se é ou não posterior à referência.
     * @param dataReferencia A data de referência para a verificação de posterioridade.
     * @return Retorna se a data interessada é futura ou não em relação à data de referência.
     */
    public static boolean ehDataFutura(final Data dataInteresse, final Data dataReferencia) {

        if (dataInteresse.getAno() > dataReferencia.getAno()) {
            return true;
        } else if (dataInteresse.getAno() < dataReferencia.getAno()) {
            return false;
        } else if (dataInteresse.getMes() > dataReferencia.getMes()) {
            return true;
        } else if (dataInteresse.getMes() < dataReferencia.getMes()) {
            return false;
        } else if (dataInteresse.getDia() > dataReferencia.getDia()) {
            return true;
        }

        return false;
    }

    /**
     * A função caminha da data de referência até a data interessada, visando calcular o dia da semana da
     * data interessada.
     *
     * @param dataInteresseStr Entrada de texto referente à data interessada.
     * @param anoBissexto O ano bissexto de referência.
     * @param dataReferenciaStr Entrada de texto referente à data de referência.
     * @param diaSemanaRef O dia da semana da data de referência.
     * @return Retorna o número do dia da semana corespondente a data interessada (0 para segunda, 1 para terça,
     * 2 para quarta, 3, para quinta, 4 para sexta, 5 para sábado e 6 para domingo) ou -1 caso algum para os dados
     * de entrada não sejam atendidos.
     */
    public static int calcularData(final String dataInteresseStr, final int anoBissexto,
                                   final String dataReferenciaStr, final int diaSemanaRef) {

        try {

            ExceptionUtils.validarData(dataInteresseStr, anoBissexto);
            ExceptionUtils.validarData(dataReferenciaStr, anoBissexto);
            ExceptionUtils.validarDiaSemana(diaSemanaRef);

            final int finalAnoStr = 4;
            final int finalMesStr = 6;
            final int tamanhoData = 8;

            final int anoInteresse = Integer.parseInt(dataInteresseStr.substring(0, finalAnoStr));
            final int mesInteresse = Integer.parseInt(dataInteresseStr.substring(finalAnoStr, finalMesStr));
            final int diaInteresse = Integer.parseInt(dataInteresseStr.substring(finalMesStr, tamanhoData));

            final int anoReferencia = Integer.parseInt(dataReferenciaStr.substring(0, finalAnoStr));
            final int mesReferencia = Integer.parseInt(dataReferenciaStr.substring(finalAnoStr, finalMesStr));
            final int diaReferencia = Integer.parseInt(dataReferenciaStr.substring(finalMesStr, tamanhoData));

            final Data dataInteresse = new Data(anoInteresse, mesInteresse, diaInteresse, 0);
            final Data dataReferencia = new Data(anoReferencia, mesReferencia, diaReferencia, diaSemanaRef);

            if (ehDataIgual(dataInteresse, dataReferencia)) {
                return diaSemanaRef;
            }

            if (ehDataFutura(dataInteresse, dataReferencia)) {

                while (!ehDataIgual(dataInteresse, dataReferencia)) {

                    dataReferencia.avancarDia(anoBissexto);
                }

                return dataReferencia.getDiaDaSemana();

            } else {

                while (!ehDataIgual(dataInteresse, dataReferencia)) {

                    dataReferencia.voltarDia(anoBissexto);
                }

                return dataReferencia.getDiaDaSemana();
            }


        } catch (IllegalArgumentException e) {

            return -1;

        }
    }

    /**
     * Método que verifica se as duas datas informadas são iguais.
     *
     * @param dataInteresse Data que será comparada.
     * @param dataReferencia Data referência que será comparada.
     * @return Retorna se as datas são iguais ou não.
     */
    public static boolean ehDataIgual(final Data dataInteresse, final Data dataReferencia) {

        return dataInteresse.getDia() == dataReferencia.getDia()
                && dataInteresse.getMes() == dataReferencia.getMes()
                && dataInteresse.getAno() == dataReferencia.getAno();

    }


    /**
     * Função que recebe a entrada como args, própria para utilização na função main do programa.
     *
     * @param args String contendo os dados da consulta (dataInteresse, anoBissexto, dataReferência e dia Referência).
     * @return Retorna o dia da semana da data interessada com base na data de referência.
     */

    public static int receberEntrada(final String args) {

        final int tamanhoDataStr = 8;
        final int inicioBissextoStr = 9;
        final int fimBissextoStr = 13;
        final int inicioReferencia = 14;
        final int fimReferencia = 22;
        final int posicaoDia = 23;

        final String dataInteresse = args.substring(0, tamanhoDataStr);
        final int anoBissexto = Integer.parseInt(args.substring(inicioBissextoStr, fimBissextoStr));
        final String dataReferencia = args.substring(inicioReferencia, fimReferencia);
        final int diaReferencia = Integer.parseInt(args.substring(posicaoDia));

        return calcularData(dataInteresse, anoBissexto, dataReferencia, diaReferencia);

    }
}
