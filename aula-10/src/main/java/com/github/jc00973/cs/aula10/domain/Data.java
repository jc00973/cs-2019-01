package com.github.jc00973.cs.aula10.domain;

/**
 * Entidade data e suas funções de operação para verificar se um ano é bissexto, avançar ou recuar dia.
 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public final class Data {

    public Data(int ano, int mes, int dia, int diaDaSemana) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.diaDaSemana = diaDaSemana;
    }

    private int ano;
    private int mes;
    private int dia;
    private int diaDaSemana;

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getDiaDaSemana() {
        return diaDaSemana;
    }

    /**
     * A função volta um dia na semana.
     */
    public void voltarDiaDaSemana() {
        if (diaDaSemana == Dia.SEGUNDA) {
            diaDaSemana = Dia.DOMINGO;
        } else {
            diaDaSemana--;
        }
    }

    /**
     * A função avança um dia na semana.
     */
    public void avancarDiaDaSemana() {
        if (diaDaSemana == Dia.DOMINGO) {
            diaDaSemana = Dia.SEGUNDA;
        } else {
            diaDaSemana++;
        }
    }

    /**
     * A função verifica se o ano interessado é ou não bissexto com base no ano bissexto de referência.
     *
     * @param anoInteressado O ano que se quer saber se é bissexto ou não.
     * @param anoReferencia O ano bissexto de referência.
     * @return Retorna verdadeiro ou falso para a verificação de se o ano é ou não bissexto.
     */
    public static boolean ehAnoBissexto(int anoInteressado, int anoReferencia) {

        if ((anoInteressado - anoReferencia) % 4 == 0) {
            if (anoInteressado % 100 == 0) {

                return anoInteressado % 400 == 0;

            } else {

                return true;

            }

        } else {

            return false;
        }
    }

    /**
     * A função volta um dia na data de referência em direção à data interessada.
     *
     * @param anoReferencia O ano bissexto de referência.
     */
    public void voltarDia(int anoReferencia) {

        if (dia > 1) {

            dia--;
            voltarDiaDaSemana();
            return;

        } else if (mes == Mes.JANEIRO) {
            dia = Mes.MES31;
            mes = Mes.DEZEMBRO;
            ano--;
            voltarDiaDaSemana();
            return;

        } else if (mes == Mes.FEVEREIRO) {
            dia = Mes.MES31;
        } else if (mes == Mes.MARCO) {

            if (ehAnoBissexto(ano, anoReferencia)) {
                dia = Mes.MES29;
            } else {
                dia = Mes.MES28;
            }

        } else if (mes == Mes.ABRIL) {
            dia = Mes.MES31;
        } else if (mes == Mes.MAIO) {
            dia = Mes.MES30;
        } else if (mes == Mes.JUNHO) {
            dia = Mes.MES31;
        } else if (mes == Mes.JULHO) {
            dia = Mes.MES30;
        } else if (mes == Mes.AGOSTO) {
            dia = Mes.MES31;
        } else if (mes == Mes.SETEMBRO) {
            dia = Mes.MES31;
        } else if (mes == Mes.OUTUBRO) {
            dia = Mes.MES30;
        } else if (mes == Mes.NOVEMBRO) {
            dia = Mes.MES31;
        } else {
            dia = Mes.MES30;
        }

        mes--;
        voltarDiaDaSemana();

    }

    /**
     * A função avança um dia na data de referência em direção à data interessada.
     *
     * @param anoReferencia O ano bissexto de referência.
     */
    public void avancarDia(int anoReferencia) {

        if (dia < 28) {

            dia++;

            avancarDiaDaSemana();

            return;

        } else if (mes == Mes.JANEIRO) {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.FEVEREIRO) {

            if (ehAnoBissexto(ano, anoReferencia)) {

                if (dia == Mes.MES28) {
                    dia++;
                } else {
                    dia = 1;
                    mes++;
                }

            } else {

                dia = 1;
                mes++;
            }

        } else if (mes == Mes.MARCO) {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.ABRIL) {

            if (dia < Mes.MES30) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.MAIO) {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.JUNHO) {

            if (dia < Mes.MES30) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.JULHO) {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.AGOSTO) {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.SETEMBRO) {

            if (dia < Mes.MES30) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.OUTUBRO) {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.NOVEMBRO) {

            if (dia < Mes.MES30) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes = Mes.JANEIRO;
                ano++;
            }
        }

        avancarDiaDaSemana();
    }
}