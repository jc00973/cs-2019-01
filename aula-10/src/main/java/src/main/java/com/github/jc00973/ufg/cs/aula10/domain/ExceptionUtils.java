package com.github.jc00973.ufg.cs.aula10;

/**
 * Implementação em Java da ordem de serviço proposta na aula 10.
 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public final class ExceptionUtils {

    private ExceptionUtils() {
    }

    ;

    public static void validarData(String data, int anoBissexto) {

        if (data.length() != 8) {
            throw new IllegalArgumentException("Data com tamanho inválido!");
        }

        if (data.substring(0) == "0") {
            throw new IllegalArgumentException("O primeiro dígito deve ser diferente de zero!");
        }

        int ano = Integer.parseInt(data.substring(0, 3));
        int mes = Integer.parseInt(data.substring(4, 5));
        int dia = Integer.parseInt(data.substring(6, 7));

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido!");
        }

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido!");
        }

        if (mes == Mes.JANEIRO) {
            if (dia > 31) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.FEVEREIRO) {
            if (Data.ehAnoBissexto(ano, anoBissexto)) {
                if (dia > 29) {
                    throw new IllegalArgumentException("Dia inválido para o mês informado!");
                }
            } else if (dia > 28) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }
        } else if (mes == Mes.MARCO) {
            if (dia > 31) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.ABRIL) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.MAIO) {
            if (dia > 31) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.JUNHO) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.JULHO) {
            if (dia > 31) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.AGOSTO) {
            if (dia > 31) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.SETEMBRO) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.OUTUBRO) {
            if (dia > 31) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.NOVEMBRO) {
            if (dia > 30) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }

        } else if (mes == Mes.DEZEMBRO) {
            if (dia > 31) {
                throw new IllegalArgumentException("Dia inválido para o mês informado!");
            }
        }


    }

    public static void validarDiaSemana(int diaSemana) {
        if (diaSemana < 0 || diaSemana > 6) {
            throw new IllegalArgumentException("Dia da semana inválido!");
        }
    }


}