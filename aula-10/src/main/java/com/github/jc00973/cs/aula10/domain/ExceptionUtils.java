package com.github.jc00973.cs.aula10.domain;

/**
 * Classe de validação das entradas.
 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public final class ExceptionUtils {

    private ExceptionUtils() { };

    /**
     * A função verifica se a data informada é válida.
     *
     * @param data Data que será validada.
     * @param anoBissexto Ano bissexto de referência.
     * @throws {IllegalArgumentException} Caso a data seja inválida.
     */
    public static void validarData(String data, int anoBissexto) {

        if (data.length() != 8) {
            throw new IllegalArgumentException("Data com tamanho inválido!");
        }

        int primeiroDigito = Integer.parseInt(data.substring(0, 1));

        if (primeiroDigito == 0) {
            throw new IllegalArgumentException("O primeiro dígito deve ser diferente de zero!");
        }

        int ano = Integer.parseInt(data.substring(0, 4));
        int mes = Integer.parseInt(data.substring(4, 6));
        int dia = Integer.parseInt(data.substring(6, 8));

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido!");
        }

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido!");
        }

        if (mes == Mes.FEVEREIRO) {
            if (Data.ehAnoBissexto(ano, anoBissexto)) {
                if (dia > 29) {
                    throw new IllegalArgumentException("Dia inválido para o mês informado!");
                }
            } else if (dia > 28) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.ABRIL) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.JUNHO) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.SETEMBRO) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.NOVEMBRO) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        }
    }

    /**
     * A função verifica se o valor referente à um dia da semana é válido.
     *
     * @param int Dia que será validado.
     * @throws {IllegalArgumentException} Caso o dia seja inválido.
     */
    public static void validarDiaSemana(int diaSemana) {
        if (diaSemana < 0 || diaSemana > 6) {
            throw new IllegalArgumentException("Dia da semana inválido!");
        }
    }
}