package com.github.jc00973.ufg.cs.aula10;

/**
 * Implementação em Java da ordem de serviço proposta na aula 10.
 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public final class DataUtils {

    private DataUtils() {
    }

    ;

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

    public static int calcularData(String dataInteresseStr, int anoBissexto, String dataReferenciaStr, int diaSemanaReferencia) {

        try {

            ExceptionUtils.validarData(dataInteresseStr, anoBissexto);
            ExceptionUtils.validarData(dataReferenciaStr, anoBissexto);
            ExceptionUtils.validarDiaSemana(diaSemanaReferencia);

            int anoInteresse = Integer.parseInt(dataInteresseStr.substring(0, 3));
            int mesInteresse = Integer.parseInt(dataInteresseStr.substring(4, 5));
            int diaInteresse = Integer.parseInt(dataInteresseStr.substring(6, 7));

            int anoReferencia = Integer.parseInt(dataReferenciaStr.substring(0, 3));
            int mesReferencia = Integer.parseInt(dataReferenciaStr.substring(4, 5));
            int diaReferencia = Integer.parseInt(dataReferenciaStr.substring(6, 7));

            Data dataInteresse = new Data(anoInteresse, mesInteresse, diaInteresse, 0);
            Data dataReferencia = new Data(anoReferencia, mesReferencia, diaReferencia, diaSemanaReferencia);

            if (ehDataFutura(dataInteresse, dataReferencia)) {

                while (diaInteresse != dataReferencia.getDia() && mesInteresse != dataReferencia.getMes()
                        && anoInteresse != dataReferencia.getAno()) {

                    dataReferencia.avancarDia(anoBissexto);

                }

            } else if (diaInteresse == diaReferencia && mesInteresse == mesReferencia
                    && anoInteresse == anoReferencia) {

                return diaSemanaReferencia;

            } else {

                while (diaInteresse != dataReferencia.getDia() && mesInteresse != dataReferencia.getMes()
                        && anoInteresse != dataReferencia.getAno()) {

                    dataReferencia.voltarDia(anoBissexto);

                }

            }

            return dataReferencia.getDiaDaSemana();

        } catch (IllegalArgumentException e) {

            return -1;

        }
    }
}