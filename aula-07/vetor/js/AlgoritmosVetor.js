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

    for (var i = 0; i < temperaturas.length; i++) {
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

    for (var i = 0; i < vetor.length; i++) {
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

    for (var i = 0; i < vetor.length; i++) {
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

    for (var h = 0; h < palavraVetor.length; h++) {
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

/**
 * A função gera um número inteiro aleatório entre dois valores.
 *
 * @param {number} min Valor mínimo do intervalo.
 * @param {number} max Valor máximo do intervalo.
 *
 * @returns {number} Valor aleatório dentro do intervalo especificado no parâmetro.
 */

function getRandomIntInclusive(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

/**
 * A função sorteia aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e identifica o
 * número que mais foi sorteado. Se mais de um número foi o “mais frequente”, então todos eles
 * são retornados (em uma coleção) juntamente com a quantidade de vezes em que ocorrerão.
 *
 * @return {String} Array de strings contendo os números mais sorteados juntamente com a quantidade
 * de vezes que foram sorteados.
 */

function verificarMaisSorteado() {

    var qtdSorteada = [1000];
    var maiorQtdSorteio = 0;
    var maisSorteados = [];

    for (var h = 0; h < 1000; h++) {
        qtdSorteada[h] = 0;
    }

    for (var i = 0; i < 1000000; i++) {
        qtdSorteada[getRandomIntInclusive(0, 1000)]++;
    }

    for (var j = 0; j < 1000; j++) {
        if (qtdSorteada[j] > maiorQtdSorteio) {
            maiorQtdSorteio = qtdSorteada[j];
        }
    }

    for (var k = 0; k < 1000; k++) {
        if (qtdSorteada[k] == maiorQtdSorteio) {
            maisSorteados.push(k + " foi sorteado " + maiorQtdSorteio + " vezes.");
        }
    }

    return maisSorteados;
}

module.exports = {
    encontrarMenorTemperatura: encontrarMenorTemperatura,
    somaNumerosImpares: somaNumerosImpares,
    quantidadeElementosIguais: quantidadeElementosIguais,
    contarLetra: contarLetra,
    localizarPalavraFrequente: localizarPalavraFrequente,
    verificarMaisSorteado: verificarMaisSorteado
};