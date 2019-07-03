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

        final int tamanhoStrData = 8;
        final int finalPrimeiroStr = 1;

        if (data.length() != tamanhoStrData) {
            throw new IllegalArgumentException("Data com tamanho inválido!");
        }

        int primeiroDigito = Integer.parseInt(data.substring(0, finalPrimeiroStr));

        if (primeiroDigito == 0) {
            throw new IllegalArgumentException("O primeiro dígito deve ser diferente de zero!");
        }

        final int finalAnoStr = 4;
        final int finalMesStr = 6;

        int ano = Integer.parseInt(data.substring(0, finalAnoStr));
        int mes = Integer.parseInt(data.substring(finalAnoStr, finalMesStr));
        int dia = Integer.parseInt(data.substring(finalMesStr, tamanhoStrData));

        final int primeiroMes = 1;
        final int ultimoMes = 12;
        final int primeiroDia = 1;
        final int ultimoDia = 31;


        if (mes < primeiroMes || mes > ultimoMes) {
            throw new IllegalArgumentException("Mês inválido!");
        }

        if (dia < primeiroDia || dia > ultimoDia) {
            throw new IllegalArgumentException("Dia inválido!");
        }

        if (mes == Mes.FEVEREIRO) {
            if (Data.ehAnoBissexto(ano, anoBissexto)) {
                if (dia > Mes.MES29) {
                    throw new IllegalArgumentException("Dia inválido para o mês informado!");
                }
            } else if (dia > Mes.MES28) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.ABRIL) {
            if (dia > Mes.MES30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.JUNHO) {
            if (dia > Mes.MES30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.SETEMBRO) {
            if (dia > Mes.MES30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.NOVEMBRO) {
            if (dia > Mes.MES30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

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
