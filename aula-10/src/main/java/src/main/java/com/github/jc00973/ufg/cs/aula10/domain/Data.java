package com.github.jc00973.ufg.cs.aula10;

/**
 * Implementação em Java da ordem de serviço proposta na aula 10.
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

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(int diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public void voltarDiaDaSemana() {
        if (diaDaSemana == Dia.SEGUNDA) {
            diaDaSemana = Dia.DOMINGO;
        } else {
            diaDaSemana--;
        }
    }

    public void avancarDiaDaSemana() {
        if (diaDaSemana == Dia.DOMINGO) {
            diaDaSemana = Dia.SEGUNDA;
        } else {
            diaDaSemana++;
        }
    }

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

    public void voltarDia(int anoReferencia) {

        if (dia > 1) {

            dia--;

            return;
        }

        if (mes == Mes.JANEIRO) {
            dia = Mes.MES31;
            ano--;

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
        } else if (mes == Mes.DEZEMBRO) {
            dia = Mes.MES30;
        }

        mes--;
        voltarDiaDaSemana();

    }

    public void avancarDia(int anoReferencia) {

        if (dia < 28) {

            dia++;

            return;
        }

        if (mes == Mes.JANEIRO) {
            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes++;
            }

        } else if (mes == Mes.FEVEREIRO) {

            if (dia < Mes.MES28) {
                dia++;
            } else if (ehAnoBissexto(ano, anoReferencia)) {

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

        } else if (mes == Mes.DEZEMBRO) {

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