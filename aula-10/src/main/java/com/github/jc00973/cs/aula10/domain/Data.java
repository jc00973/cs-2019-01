package com.github.jc00973.cs.aula10.domain;

/**
 * Entidade data e suas funções de operação para verificar se um ano é bissexto, avançar ou recuar dia.
 */
public final class Data {

    /**
     * Variável ano de uma data.
     */
    private int ano;

    /**
     * Variável mês de uma data.
     */
    private int mes;

    /**
     * Variável dia de uma data.
     */
    private int dia;

    /**
     * Variável dia da semana de uma data.
     */
    private int diaDaSemana;

    /**
     * Construtor do objeto data.
     *
     * @param ano Variável ano de uma data.
     * @param mes Variável mes de uma data.
     * @param dia Variável dia de uma data.
     * @param diaDaSemana Variável dia da semana de uma data.
     */
    public Data(final int ano, final int mes, final int dia, final int diaDaSemana) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.diaDaSemana = diaDaSemana;
    }

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
     * @param anoReferencia  O ano bissexto de referência.
     * @return Retorna verdadeiro ou falso para a verificação de se o ano é ou não bissexto.
     */
    public static boolean ehAnoBissexto(final int anoInteressado, final int anoReferencia) {

        final int intervaloBissexto = 4;
        final int valorCem = 100;
        final int valorQuatrocentos = 400;

        if ((anoInteressado - anoReferencia) % intervaloBissexto == 0) {
            if (anoInteressado % valorCem == 0) {

                return anoInteressado % valorQuatrocentos == 0;

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
    public void voltarDia(final int anoReferencia) {

        final int menorDiaMes = 1;

        if (dia > menorDiaMes) {

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

        } else {
            mesAnterior();
        }

        mes--;
        voltarDiaDaSemana();

    }

    /**
     * O método retorna o dia para o último dia do mês anterior.
     */
    public void mesAnterior() {

        if (mes == Mes.ABRIL) {
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
    }


    /**
     * A função avança um dia na data de referência em direção à data interessada.
     *
     * @param anoReferencia O ano bissexto de referência.
     */
    public void avancarDia(final int anoReferencia) {

        if (mes == Mes.FEVEREIRO) {

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

        } else if (mes == Mes.DEZEMBRO) {

            if (dia < Mes.MES31) {
                dia++;
            } else {
                dia = 1;
                mes = Mes.JANEIRO;
                ano++;
            }
        } else if (temTrintaDias(mes)) {
            incrementarDia(Mes.MES30);
        } else {
            incrementarDia(Mes.MES31);
        }

        avancarDiaDaSemana();
    }

    /**
     * A função incrementa um dia na data, observando se o próximo dia está no mesmo mês ou no mês seguinte.
     * @param tamanhoMes O tamanho do mês atual que o dia será incrementado.
     */
    public void incrementarDia(final int tamanhoMes) {

        if (dia < tamanhoMes) {
            dia++;
        } else {
            dia = 1;
            mes++;
        }
    }

    /**
     * A função verifica se o mês tem 30 dias.
     * @param mes Mês que será analisado.
     * @return Verdadeiro caso o mês tenha 30 dias.
     */
    public boolean temTrintaDias(final int mes) {

        return mes == Mes.ABRIL || mes == Mes.JUNHO || mes == Mes.SETEMBRO || mes == Mes.NOVEMBRO;

    }
}


