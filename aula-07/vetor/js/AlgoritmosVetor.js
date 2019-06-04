/**
 * Implementação em JavaScript dos 6 algoritmos propostos na aula 07.
 */

/**
 * A função encontra a menor temperatura em um vetor de valores recebido como argumento.
 *
 * @param {number} temperaturas Vetor de valores de temperaturas.
 * @return {number} A menor temperatura encontrada no vetor.
 */

function encontrarMenorTemperatura(temperaturas) {

    var menorTemperatura = temperaturas[0];

    for (var i = 0 ; i < temperaturas.length ; i++) {
        if (temperaturas[i] < menorTemperatura) {
            menorTemperatura = temperaturas[i];
        }
    }

    return menorTemperatura;
}

/**
 * A função realiza a soma de números ímpares contidos em um vetor de inteiros.
 *
 * @param {number} vetor Vetor de números inteiros.
 * @return {number} A soma dos números ímpares do vetor.
 */

function somaNumerosImpares(vetor) {

    var soma = 0;

    for (var i = 0 ; i < vetor.length ; i++) {
        if (vetor[i] % 2 != 0) {
            soma = soma + vetor[i];
        }
    }

    return soma;
}

/**
 * A função retorna a quantidade de elementos do vetor recebido como primeiro argumento cujos valores são
 * iguais ao valor do segundo argumento fornecido.
 *
 * @param {number} vetor    Vetor que será analisado.
 * @param {number} elemento Valor que será buscado no vetor e contabilizado.
 * @return {number} A quantidade de valores no vetor iguais ao elemento.
 */

function quantidadeElementosIguais(vetor, elemento) {

    var qtdElementosIguais = 0;

    for (var i = 0 ; i < vetor.length ; i++) {
        if (vetor[i] == elemento) {
            qtdElementosIguais++;
        }
    }

    return qtdElementosIguais;
}

/**
 * A função conta a quantidade de cada uma das letras presentes em uma sequência de caracteres.
 *
 * @param {String} palavra A sequência de caracteres.
 * @return {number} Vetor com a quantidade de repetições de cada letra na string.
 */

function contarLetra(palavra) {

    var palavraVetor = palavra.split('');
    var qtdLetra = [];

    for (var h = 0; h < palavraVetor.length; h++){
        qtdLetra[h] = 0;
    }

    for (var i = 0; i < palavraVetor.length; i++) {
        for (var j = 0; j < palavraVetor.length; j++) {
            if (palavraVetor[i] == palavraVetor[j]) {
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
 * @param {String} frase A sequência de caracteres.
 * @return {String} A palavra que mais aparece na sequência de caracteres.
 */

function localizarPalavraFrequente(frase) {

    var palavras = frase.split(" ");
    var qtdPalavra = [];

    for (var i = 0; i < palavras.length; i++) {
        qtdPalavra[i] = 0;

        for (var j = 0; j < palavras.length; j++) {
            var p1 = palavras[i].toString();
            var p2 = palavras[j].toString();

            if (p1 == p2) {
                qtdPalavra[i]++;
            }
        }
    }

    var maiorQtd = 0;
    var maiorQtdPosicao = 0;

    for (var k = 0; k < palavras.length; k++) {
        if (qtdPalavra[k] > maiorQtd) {
            maiorQtd = qtdPalavra[k];
            maiorQtdPosicao = k;
        }
    }

    return palavras[maiorQtdPosicao];

}

module.exports = {
    encontrarMenorTemperatura: encontrarMenorTemperatura,
    somaNumerosImpares: somaNumerosImpares,
    quantidadeElementosIguais: quantidadeElementosIguais,
    contarLetra: contarLetra,
    localizarPalavraFrequente: localizarPalavraFrequente
};