package com.github.jc00973.cs.aula10.domain;

/**
 * Classe utilitária de data que verifica o dia da semana de uma data usando outra data como referência.
 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public final class DataUtils {

    private DataUtils() { };

    /**
     * A função verifica se a data interessada é posterior à data de referência.
     *
     * @param dataInteresse A data na qual se quer saber se é ou não posterior à referência.
     * @param dataReferencia A data de referência para a verificação de posterioridade.
     */
    public static boolean ehDataFutura(Data dataInteresse, Data dataReferencia) {

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
        } else {
            return false;
        }

    }

    /**
     * A função caminha da data de referência até a data interessada, visando calcular o dia da semana da
     * data interessada.
     *
     * @param dataInteresseStr Entrada de texto referente à data interessada.
     * @param anoBissexto O ano bissexto de referência.
     * @param dataReferenciaStr Entrada de texto referente à data de referência.
     * @param diaSemanaReferencia O dia da semana da data de referência.
     * @return Retorna o número do dia da semana corespondente a data interessada (0 para segunda, 1 para terça,
     * 2 para quarta, 3, para quinta, 4 para sexta, 5 para sábado e 6 para domingo) ou -1 caso algum para os dados
     * de entrada não sejam atendidos.
     */
    public static int calcularData(String dataInteresseStr, int anoBissexto, String dataReferenciaStr, int diaSemanaReferencia) {

        try {

            ExceptionUtils.validarData(dataInteresseStr, anoBissexto);
            ExceptionUtils.validarData(dataReferenciaStr, anoBissexto);
            ExceptionUtils.validarDiaSemana(diaSemanaReferencia);

            int anoInteresse = Integer.parseInt(dataInteresseStr.substring(0, 4));
            int mesInteresse = Integer.parseInt(dataInteresseStr.substring(4, 6));
            int diaInteresse = Integer.parseInt(dataInteresseStr.substring(6, 8));

            int anoReferencia = Integer.parseInt(dataReferenciaStr.substring(0, 4));
            int mesReferencia = Integer.parseInt(dataReferenciaStr.substring(4, 6));
            int diaReferencia = Integer.parseInt(dataReferenciaStr.substring(6, 8));

            Data dataInteresse = new Data(anoInteresse, mesInteresse, diaInteresse, 0);
            Data dataReferencia = new Data(anoReferencia, mesReferencia, diaReferencia, diaSemanaReferencia);

            if (diaInteresse == diaReferencia
                    && mesInteresse == mesReferencia
                    && anoInteresse == anoReferencia) {

                return diaSemanaReferencia;

            }

            if (ehDataFutura(dataInteresse, dataReferencia)) {

                while (diaInteresse != dataReferencia.getDia()
                        || mesInteresse != dataReferencia.getMes()
                        || anoInteresse != dataReferencia.getAno()) {

                    dataReferencia.avancarDia(anoBissexto);
                }

                return dataReferencia.getDiaDaSemana();

            } else {

                while (diaInteresse != dataReferencia.getDia()
                        || mesInteresse != dataReferencia.getMes()
                        || anoInteresse != dataReferencia.getAno()) {

                    dataReferencia.voltarDia(anoBissexto);
                }

                return dataReferencia.getDiaDaSemana();
            }


        } catch (IllegalArgumentException e) {

            return -1;

        }
    }

    public static int receberEntrada(String args) {

        String dataInteresse = args.substring(0, 8);
        int anoBissexto = Integer.parseInt(args.substring(9, 13));
        String dataReferencia = args.substring(14, 22);
        int diaDaSemanaReferencia = Integer.parseInt(args.substring(23));

        return calcularData(dataInteresse, anoBissexto, dataReferencia, diaDaSemanaReferencia);

    }
}