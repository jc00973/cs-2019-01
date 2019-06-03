package com.github.jc00973.ufg.cs.aula07;

/**
 * Implementação em Java dos 6 algoritmos propostos na aula 07.
 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public final class AlgoritmosVetor {

    private AlgoritmosVetor() { };

    /**
     * A função encontra a menor temperatura em um vetor de valores recebido como argumento.
     *
     * @param temperaturas Vetor de valores de temperaturas.
     *
     * @return A menor temperatura encontrada no vetor.
     */

    public static float encontrarMenorTemperatura(final float[] temperaturas) {

        float menorTemperatura = temperaturas[0];

        for (final float temp : temperaturas) {
            if (temp < menorTemperatura) {
                menorTemperatura = temp;
            }
        }

        return menorTemperatura;
    }

    /**
     * A função realiza a soma de números ímpares contidos em um vetor de inteiros.
     *
     * @param vetor Vetor de números inteiros.
     *
     * @return A soma dos números ímpares do vetor.
     */

    public static int somaNumerosImpares(final int[] vetor) {

        int soma = 0;

        for(final int num : vetor){
            if(num % 2 != 0){
                soma = soma + num;
            }
        }

        return soma;
    }

    /**
     * A função retorna a quantidade de elementos do vetor recebido como primeiro argumento cujos valores são
     * iguais ao valor do segundo argumento fornecido.
     *
     * @param vetor Vetor que será analisado.
     * @param elemento Valor que será buscado no vetor e contabilizado.
     *
     * @return A quantidade de valores no vetor iguais ao elemento.
     */

    public static int quantidadeElementosIguais(final int[] vetor, int elemento){

        int qtdElementosIguais = 0;

        for(final int num : vetor){
            if(num == elemento){
                qtdElementosIguais++;
            }
        }

        return qtdElementosIguais;
    }

    /**
     * A função conta a quantidade de cada uma das letras presentes em uma sequência de caracteres.
     *
     * @param palavra A sequência de caracteres.
     *
     * @return Vetor com a quantidade de repetições de cada letra na string.
     */

    public static int[] contarLetra(final String palavra){

        char[] palavraVetor = palavra.toCharArray();
        int[] qtdLetra = new int[palavraVetor.length];

        for(int i = 0 ; i < palavraVetor.length ; i++){
            for(int j = 0 ; j < palavraVetor.length ; j++){
                if(palavraVetor[i] == palavraVetor[j]){
                    qtdLetra[i]++;
                }
            }
        }

        return qtdLetra;
    }

    /**
     * A função localiza a palavra mais frequente em uma sequência de caracteres, semelhante a
     * função anterior. Uma palavra é considerada aquela delimitada por um espaço em branco.
     *
     * @param frase A sequência de caracteres.
     *
     * @return A palavra que mais aparece na sequência de caracteres.
     */

    public static String localizarPalavraFrequente(final String frase){

        final String[] palavras = frase.split(" ");
        int[] qtdPalavra = new int[palavras.length];

        for(int i = 0 ; i < palavras.length ; i++){
            for(int j = 0 ; j < palavras.length ; j++){
                if(palavras[i].equals(palavras[j])){
                    qtdPalavra[i]++;
                }
            }
        }

        int maiorQtd = 0;
        int maiorQtdPosicao = 0;

        for(int k = 0 ; k < palavras.length ; k++) {
            if(qtdPalavra[k] > maiorQtd){
                maiorQtd = qtdPalavra[k];
                maiorQtdPosicao = k;
            }
        }

        return palavras[maiorQtdPosicao];

    }

    /**
     * A função sorteia aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e identifica o
     * número que mais foi sorteado. Se mais de um número foi o “mais frequente”, então todos eles
     * são retornados (em uma coleção) juntamente com a quantidade de vezes em que ocorrerão.
     *
     * @return Coleção de strings contendo os números mais sorteados juntamente com a quantidade
     * de vezes que foram sorteados.
     *
     */

    public static Collection<String> verificarMaisSorteado(){

        Random gerador = new Random();
        int[] qtdSorteada = new int[1000];
        int maiorQtdSorteio = 0;
        Collection<String> maisSorteados = new ArrayList();

        for(int i = 0 ; i < 1000000 ; i++) {
            qtdSorteada[gerador.nextInt(1000)]++;
        }

        for(int j = 0 ; j < 1000 ; j++){
            if(qtdSorteada[j] > maiorQtdSorteio){
                maiorQtdSorteio = qtdSorteada[j];
            }
        }

        for(int k = 0 ; k < 1000 ; k++){
            if(qtdSorteada[k] == maiorQtdSorteio){
                maisSorteados.add(k + " foi sorteado " + maiorQtdSorteio + " vezes.");
            }
        }

        return maisSorteados;
    }
}

