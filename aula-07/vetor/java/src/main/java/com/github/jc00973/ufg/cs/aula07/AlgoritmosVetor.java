package com.github.jc00973.ufg.cs.aula07;

public final class AlgoritmosVetor {

    private AlgoritmosVetor() { };

    public static float encontrarMenorTemperatura(final float[] temperaturas) {

        float menorTemperatura = temperaturas[0];

        for (final float temp : temperaturas) {
            if (temp < menorTemperatura) {
                menorTemperatura = temp;
            }
        }

        return menorTemperatura;
    }

    public static int somaNumerosImpares(final int[] vetor) {

        int soma = 0;

        for(final int num : vetor){
            if(num % 2 != 0){
                soma = soma + num;
            }
        }

        return soma;
    }

    public static int quantidadeElementosIguais(final int[] vetor, int elemento) {

        int qtdElementosIguais = 0;

        for(final int num : vetor){
            if(num == elemento){
                qtdElementosIguais++;
            }
        }

        return qtdElementosIguais;
    }

}

