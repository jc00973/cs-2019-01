package com.github.jc00973.cs.aula10.domain;

/**
 * Classe de validação das entradas.
 */
public final class ExceptionUtils {

    /**
     * Construtor privado para evitar instanciação indevida.
     */
    private ExceptionUtils() { };

    /**
     * A função verifica se a data informada é válida.
     *
     * @param data Data que será validada.
     * @param anoBissexto Ano bissexto de referência.
     * @throws {IllegalArgumentException} Caso a data seja inválida.
     */
    public static void validarData(final String data, final int anoBissexto) {

        validarTamanho(data);

        verificarDigito(data);

        final int finalAnoStr = 4;
        final int finalMesStr = 6;
        final int finalDiaStr = 8;

        final int mes = Integer.parseInt(data.substring(finalAnoStr, finalMesStr));

        validarMes(mes);

        final int dia = Integer.parseInt(data.substring(finalMesStr, finalDiaStr));

        validarDia(dia);

        final int ano = Integer.parseInt(data.substring(0, finalAnoStr));

        validarDiaFevereiro(dia, mes, ano, anoBissexto);

        validarQtdDias(dia, mes, ano, Mes.ABRIL, Mes.MES30);
        validarQtdDias(dia, mes, ano, Mes.JUNHO, Mes.MES30);
        validarQtdDias(dia, mes, ano, Mes.SETEMBRO, Mes.MES30);
        validarQtdDias(dia, mes, ano, Mes.NOVEMBRO, Mes.MES30);
    }

    /**
     * A função valida se a data tem 8 dígitos.
     *
     * @param data A data que será validada.
     * @throws {IllegalArgumentException} Caso a data não tenha 8 dígitos.
     */
    public static void validarTamanho(final String data) {

        final int tamanhoStrData = 8;

        if (data.length() != tamanhoStrData) {
            throw new IllegalArgumentException("Data com tamanho inválido!");
        }
    }

    /**
     * A função verifica se o primeiro dígito é zero.
     *
     * @param data A data que será validada.
     * @throws {IllegalArgumentException} Caso o primeiro dígito seja zero.
     */
    public static void verificarDigito(final String data) {

        final int finalPrimeiroStr = 1;
        final int primeiroDigito = Integer.parseInt(data.substring(0, finalPrimeiroStr));

        if (primeiroDigito == 0) {
            throw new IllegalArgumentException("O primeiro dígito deve ser diferente de zero!");
        }

    }

    /**
     * A função valida se o mês é um valor de 1 a 12.
     * @param mes O mês que será validado.
     * @throws {IllegalArgumentException} Caso o mês não seja um valor de 1 a 12.
     */
    public static void validarMes(final int mes) {

        final int primeiroMes = 1;
        final int ultimoMes = 12;

        if (mes < primeiroMes || mes > ultimoMes) {
            throw new IllegalArgumentException("Mês inválido!");
        }
    }

    /**
     * A função valida se o dia é um valor de 1 a 31.
      * @param dia O dia que será validado.
     *  @throws {IllegalArgumentException} Caso o dia não seja um valor de 1 a 31.
     */
    public static void validarDia(final int dia) {

        final int primeiroDia = 1;
        final int ultimoDia = 31;

        if (dia < primeiroDia || dia > ultimoDia) {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }

    /**
     * A função valida a quantidade de dias caso o mês seja fevereiro.
     *
     * @param dia O dia que se quer validar.
     * @param mes O mês referente ao dia que se quer validar.
     * @param ano O ano referente ao dia que se quer validar.
     * @param anoBissexto O ano bissexto de referência.
     */
    public static void validarDiaFevereiro(final int dia, final int mes, final int ano, final int anoBissexto) {

        if (mes == Mes.FEVEREIRO) {
            if (Data.ehAnoBissexto(ano, anoBissexto)) {
                if (dia > Mes.MES29) {
                    throw new IllegalArgumentException("Dia inválido para o mês informado!");
                }
            } else if (dia > Mes.MES28) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }
        }
    }

    /**
     * A função valida a quantidade de dias para meses com menos de 31 dias, exceto fevereiro.
     *
     * @param dia O dia que se quer validar.
     * @param mes O mês referente ao dia que se quer validar.
     * @param ano O ano referente ao dia que se quer validar.
     * @param mesRef O mês que será usado como referência.
     * @param tamanhoMes A quantidade de dias do mês de referência.
     */
    public static void validarQtdDias(final int dia, final int mes, final int ano,
                                      final int mesRef, final int tamanhoMes) {

        if (mes == mesRef && dia > tamanhoMes) {
            throw new IllegalArgumentException("Dia inválido para o mês informado!");
        }
    }

    /**
     * A função verifica se o valor referente à um dia da semana é válido.
     *
     * @param diaSemana Dia que será validado.
     * @throws {IllegalArgumentException} Caso o dia seja inválido.
     */
    public static void validarDiaSemana(final int diaSemana) {

        final int ultimoDiaSemana = 6;

        if (diaSemana < 0 || diaSemana > ultimoDiaSemana) {
            throw new IllegalArgumentException("Dia da semana inválido!");
        }
    }
}
