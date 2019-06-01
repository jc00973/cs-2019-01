/**
 *
 * Implementação em JavaScript dos 21 algoritmos propostos na
 * aula 01.
 *
 */

/**
 * A função valida o parâmetro informado em outra função. Essa função verifica se o parâmetro é nulo, se
 * está dentro do intervalo válido de valores, se o valor é um número e se esse número é inteiro.
 *
 * @param {number} parametro O parâmetro que será validado.
 * @param {number} valorMinimo O valor mínimo válido para o parâmetro.
 * @param {number} valorMaximo O valor máximo válido para o parâmetro.
 *
 * @throws {TypeError} Caso o parâmetro seja nulo.
 * @throws {TypeError} Caso o parâmetro não seja um número.
 * @throws {TypeError} Caso o parâmetro não seja um número inteiro.
 * @throws {RangeError} Caso o parâmetro esteja fora do intervalo válido definido.
 */

function validarParametro(parametro, valorMinimo, valorMaximo) {
    if (parametro == null) {
        throw new TypeError("Parâmetro inválido. O valor é nulo.");
    }

    if (isNaN(parametro)) {
        throw new TypeError("Parâmetro inválido. O valor não é um número.");
    }

    if (!Number.isInteger(parametro)) {
        throw new TypeError("Parâmetro inválido. O valor não é um número inteiro.");
    }

    if (parametro < valorMinimo || parametro > valorMaximo) {
        throw new RangeError("Parâmetro inválido. O valor está fora do intervalo válido.");
    }

}

/**
 * A função valida o parâmetro informado como cpf. Essa função verifica se o parâmetro é nulo, se
 * está dentro do intervalo válido de valores, se o valor é um número, se esse número é inteiro e se
 * o cpf tem 11 dígitos.
 *
 * @param {number} cpf O parâmetro cpf que será validado.
 *
 * @throws {TypeError} Caso o parâmetro seja nulo.
 * @throws {TypeError} Caso o parâmetro não tenha 11 dígitos.
 * @throws {TypeError} Caso o parâmetro não seja um número.
 * @throws {TypeError} Caso o parâmetro não seja um número inteiro.
 * @throws {RangeError} Caso o parâmetro esteja fora do intervalo válido definido.
 */

function validarCpf(cpf) {
    if (cpf == null) {
        throw new TypeError("Parâmetro inválido. O valor é nulo.");
    }

    if (cpf.length != 12) {
        throw new TypeError("Parâmetro inválido. O valor não tem 11 dígitos.");
    }

    var i = 0;

    while(i < 11){
        if (isNaN(cpf[i])) {
            throw new TypeError("Parâmetro inválido. O valor não é um número.");
        }

        if (!Number.isInteger(cpf[i])) {
            throw new TypeError("Parâmetro inválido. O valor não é um número inteiro.");
        }

        if (cpf[i] < 0 || cpf[i] > 9) {
            throw new RangeError("Parâmetro inválido. O valor está fora do intervalo válido.");
        }

        i++;
    }
}

/**
 * A função valida o parâmetro informado como vetor para a função crivoEratostenes(). Essa função verifica
 * se os valores do vetor são iguais a zero para qualquer i que esteja no intervalo 2 ≤ i ≤ n.
 *
 * @param {number} vetor O parâmetro vetor que será validado.
 * @param {number} n Refere-se ao parâmetro n, que indica o tamanho mínimo que o vetor deve ter.
 *
 * @throws {TypeError} Caso o vetor não atenda aos requisitos definidos.
 */

function validarVetorCrivo(vetor, n){

    var i = 2;

    while(i <= n){
        if(vetor[i] == 0){
            i++;
        }else{
            throw new TypeError("Parâmetro inválido. O vetor informado não atende aos requisitos exigidos.");
        }
    }
}

/**
 * Verifica se o parâmetro é um número que apresenta a
 * propriedade 3025.
 *
 * @param {number} n O número que será verificado.
 *
 * @returns {boolean} O resultado da verificação.
 */

function propriedade3025(n) {

    validarParametro(n, 0, 9999);

    var i = Math.floor(n / 100);
    var j = Math.floor(n % 100);

    return Math.pow((i + j), 2) == n;
}

/**
 * Verifica se o parâmetro é um número que apresenta a
 * propriedade 153.
 *
 * @param {number} n O número que será verificado.
 *
 * @returns {boolean} O resultado da verificação.
 */

function propriedade153(n) {

    validarParametro(n, 100, 999);

    var c = Math.floor(n / 100);
    var du = n % 100;
    var d = Math.floor(du / 10);
    var u = du % 10;

    return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == n;
}

/**
 * Verifica o dia da semana referente a data informada.
 *
 * @param {number} d Dia da data.
 * @param {number} m Mês da data.
 * @param {number} a Ano da data.
 *
 * @returns {number} O número correspondente ao dia
 * da semana da data, entre 0 e 6. O valor retornado é 0 para
 * segunda-feira, 1 para terça-feira e assim sucessivamente.
 */

function diaDaSemana(dia, mes, ano) {

    validarParametro(dia, 1, 31);
    validarParametro(mes, 1, 12);
    validarParametro(ano, 1753);

    if ((mes == 1) || (mes == 2)) {
        mes = mes + 12;
        ano = ano - 1;
    }

    var s = dia + 2 * mes + Math.floor(3 * (mes + 1) / 5) + ano
        + Math.floor(ano / 4) - Math.floor(ano / 100) + Math.floor(ano / 400);

    return Math.floor(s % 7);
}

/**
 * A função calcula o resto inteiro da divisão (mod) entre os parâmetros.
 *
 * @param {number} x Numerador da divisão.
 * @param {number} y Denominador da divisão.
 *
 * @returns {number} O valor do mod.
 */

function mod(x, y) {

    validarParametro(x, 0);
    validarParametro(y, 0);

    var s = x;

    while (y <= s){
        s = s - y;
    }

    return s;
}

/**
 * A função realiza a soma de todos os inteiros naturais até o valor inteiro
 * informado no parâmetro.
 *
 * @param {number} n Valor final para a soma.
 *
 * @returns {number} O valor do somatório.
 */

function soma(n) {

    validarParametro(n, 1);

    var i = 2;
    var s = 1;

    while (i <= n) {
        s = s + i;
        i = i + 1;
    }

    return s;
}

/**
 * A função calcula o fatorial do número natural informado no parâmetro.
 *
 * @param {number} n Número natural que terá o fatorial calculado.
 *
 * @returns {number} O fatorial do parâmetro.
 */

function fatorial(n) {

    validarParametro(n, 1);

    var i = 2;
    var f = 1;

    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}

/**
 * A função calcula o produto de dois inteiros usando apenas somas.
 *
 * @param {number} a Primeiro inteiro da operação de multiplicação.
 * @param {number} b Segundo inteiro da operação de multiplicação.
 *
 * @returns {number} O produto da operação.
 */
function produto(a, b) {

    validarParametro(a, 0);
    validarParametro(b, 0);

    var totalParcelas = a;
    var parcela = b;

    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }

    var i = 1;
    var s = 0;

    while (i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }

    return s;
}

/**
 * A função calcula a potência de um número (base) usando apenas somas.
 * Ela reutiliza a função anterior, produto().
 *
 * @param {number} x Base.
 * @param {number} y Expoente.
 *
 * @returns {number} Potência.
 */

function potencia(x, y) {

    validarParametro(x, 0);
    validarParametro(y, 0);

    var potencia = 1;
    var i = 1;

    while (i <= y) {
        potencia = produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}

/**
 * A função estima o valor de pi, sendo a precisão do resultado proporcional ao tamanho
 * do parâmetro.
 *
 * @param {number} n Quantidade de termos do somatório.
 *
 * @returns {number} Estimativa do valor de pi.
 */

function pi(n) {

    validarParametro(n, 1);

    var i = 1;
    var s = -1;
    var d = -1;
    var p = 0;

    while (i <= n) {
        d = d + 2;
        s = -1 * s;
        p = p + 4 * s / d;
        i = i + 1;
    }

    return p;
}

/**
 * A função realiza o somatório que estima o valor do logaritmo natural dado um
 * expoente n qualquer (desde que seja um número natural e positivo). A precisão do
 * resultado é proporcional ao tamanho do parâmetro k.
 *
 * @param n Expoente natural positivo.
 * @param k Quantidade de termos do somatório.
 *
 * @returns {*}
 */

function logaritmoNatural(n, k) {

    validarParametro(n, 1);
    validarParametro(k, 2);

    var i = 2;
    var e = 1 + n;
    var numerador = n;
    var denominador = 1;

    while (i <= k) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e + numerador / denominador;
        i = i + 1;
    }

    return e;
}

/**
 * A função estima a razão áurea dado dois números inteiros positivos.
 * A precisão do resultado é proporcional ao tamanho do parâmetro k.
 *
 * @param {number} x Primeiro inteiro positivo.
 * @param {number} y Segundo inteiro positivo.
 * @param {number} k O número de repetições.
 *
 * @returns {number} A estimativa do valor da razão áurea.
 */

function razaoAurea(x, y, k) {

    validarParametro(x, 0);
    validarParametro(y, x + 1);
    validarParametro(k, 1);


    var c = y;
    var a = x;
    var i = 1;

    while (i <= k) {
        var t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c / a;
}

/**
 * A função retorna verdadeiro se o número fornecido for um quadrado perfeito.
 *
 * @param {number} n Número que será verificado.
 *
 * @returns {boolean} Resposta para se o número é ou não um quadrado perfeito.
 */

function quadradoPerfeito(n) {

    validarParametro(n, 1);

    var i = 1;
    var s = 1;

    while (s < n) {
        i = i + 2;
        s = s + i;
    }

    return s == n;
}

/**
 * A função é para extração da raiz quadrada. Quanto maior o valor de i mais preciso
 * é o valor da raiz desejada.
 *
 * @param {number} n Número o qual deseja-se extrair a raíz quadrada.
 * @param {number} i Quantidade de repetições para definição da precisão desejada.
 *
 * @returns {number} Raíz quadrada de n.
 */

function raiz(n, i) {

    validarParametro(n, 1);

    var r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;
}

/**
 * A função verifica de n é um número primo.
 *
 * @param {number} n Número que deseja-se saber se é primo.
 *
 * @returns {boolean} Resultado da verificação sobre o n ser ou não um número primo.
 */

function primo(n) {

    validarParametro(n, 2);

    var i = 2;

    while (i < n) {
        if (n % i == 0) return false;
        i = i + 1;
    }

    return true;
}

/**
 * A função implementa um método de determinação de números primos.
 *
 * @param {number} a Array contendo apenas zeros, devendo a quantidade de elementos
 * ser maior ou igual ao parâmetro n.
 * @param {number} n Número o qual deseja-se saber se é primo ou não.
 *
 * @returns {boolean} Resultado da verificação sobre o n ser ou não um número primo.
 */

function crivoEratostenes(a, n) {

    validarParametro(n, 2);
    validarVetorCrivo(a, n);

    var i = 2;
    var limite = Math.floor(Math.sqrt(n));

    while (i <= limite) {
        if (a[i] == 0) {

            var multiplo = i + i;

            while (multiplo <= n) {
                a[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }

        i++;
    }

    return a[n] == 0;
}

/**
 * Função para identificar o maior divisor comum entre dois inteiros.
 *
 * @param {number} a Primeiro inteiro.
 * @param {number} b Segundo inteiro.
 *
 * @returns {number} O maior divisor comum entre os dois inteiros informados.
 */

function mdc(a, b) {

    validarParametro(b, 1);
    validarParametro(a, b);

    while (b != 0) {
        var m = a % b;
        a = b;
        b = m;
    }

    return a;
}

/**
 * Função para identificar o maior divisor comum entre dois inteiros, assim como a
 * função anterior. No entanto, este algoritmo limita-se ao uso de subtrações para
 * calcular o resultado.
 *
 * @param {number} a Primeiro inteiro.
 * @param {number} b Segundo inteiro.
 *
 * @returns {number} O maior divisor comum entre os dois inteiros informados.
 */

function mdc2(a, b) {

    validarParametro(b, 1);
    validarParametro(a, b);

    while (a != b) {
        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }

    return a;
}

/**
 * A função realiza a avaliação de um polinômio para um valor especifco de x.
 *
 * @param {number} x Valor x do polinômio.
 * @param {number} g Quantidade de elementos a do polinômio.
 * @param {number} a Array com os elementos a do polinômio.
 *
 * @returns {number} O resultado do polinômio.
 */

function horner(x, g, a) {

    validarParametro(x);
    validarParametro(g, 1);

    var p = a[g];
    var i = g - 1;

    while (0 <= i) {
        p = p * x + a[i];
        i = i - 1;
    }

    return p;
}

/**
 * A função é uma proposta de obtenção do n-ésimo número de Fibonacci
 * (versão não recursiva).
 *
 * @param {number} n Valor correspondente à posição que deseja-se saber o valor na
 * sequência de Fibonacci.
 *
 * @returns {number} O n-ésimo número de Fibonacci.
 */

function fibonacci(n) {

    validarParametro(n, 0);

    n++;
    var a = 0;
    var c = 1;

    if ((n == 0) || (n == 1)) {
        return n;
    }

    var i = 2;

    while (i <= n) {
        var t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;
}

/**
 * Função validadora de número de cpf.
 *
 * @param {number} d Array de inteiros correspondentes aos dígitos do cpf.
 *
 * @returns {boolean} Resultado da verificação de se cpf é ou não válido.
 */

function cpf(d) {

    validarCpf(d);

    var j = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
    var k = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6] + 6 * d[7] + 7 * d[8] + 8 * d[9] + 9 * d[10];

    var dj = ((j % 11) % 10);
    var dk = ((k % 11) % 10);

    return (dj == d[10] && dk == d[11]);
}

/**
 * Função validadora de número de cpf. No entando, diferente da anterior, já que
 * utiliza uma estratégia similar a empregada na função horner().
 *
 * @param {number} d Array de inteiros correspondentes aos dígitos do cpf.
 *
 * @returns {boolean} Resultado da verificação de se cpf é ou não válido.
 */

function cpf2(d) {

    validarCpf(d);

    var c = 8;
    var p = d[9];
    var s = d[9];

    while (1 <= c) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }

    var j = ((s % 11) % 10);
    var k = (((s - p + 9 * d[10]) % 11) % 10);

    return j == d[10] && k == d[11];
}

module.exports = {
    propriedade3025: propriedade3025,
    propriedade153: propriedade153,
    diaDaSemana: diaDaSemana,
    mod: mod,
    produto: produto,
    potencia: potencia,
    pi: pi,
    soma: soma,
    fatorial: fatorial,
    primo: primo,
    logaritmoNatural: logaritmoNatural,
    razaoAurea: razaoAurea,
    quadradoPerfeito: quadradoPerfeito,
    raiz: raiz,
    crivoEratostenes: crivoEratostenes,
    mdc: mdc,
    mdc2: mdc2,
    fibonacci: fibonacci,
    horner: horner,
    cpf: cpf,
    cpf2: cpf2
};





