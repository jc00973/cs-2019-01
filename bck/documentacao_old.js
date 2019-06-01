/**
 *
 * Implementação em JavaScript dos 21 algoritmos propostos na
 * primeira aula.
 *
 */

class AlgoritmosEmJS{

    /**
     * Verifica se o parâmetro é um número que apresenta a
     * propriedade 3025.
     *
     * @param {number} n O número que será verificado.
     *
     * @returns {boolean} O resultado da verificação.
     */

    propriedade3025(n) {

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

    propriedade153(n) {

        var c = n / 100;
        var du = n % 100;
        var d = du / 10;
        var u = du % 10;

        var x = Math.pow(c, 3);
        var y = Math.pow(d, 3);
        var z = Math.pow(u, 3);

        return (x + y + z) == n;
    }

    /**
     * Verifica o dia da semana referente a data informada.
     *
     * @param {number} d Dia da data.
     * @param {number} m Mês da data.
     * @param {number} a Ano da data.
     *
     * @returns {number} Retorna o número correspondente ao dia
     * da semana da data, entre 0 e 6. O valor retornado é 0 para
     * segunda-feira, 1 para terça-feira e assim sucessivamente.
     */

    diaDaSemana(d, m, a) {

        if ((m == 1) || (m == 2)) {
            m = m + 12;
            a = a - 1;
        }

        var s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;

        return Math.floor(s % 7);
    }

    /**
     * Informa o resto da divisão do número no primeiro parâmetro
     * pelo número do segundo parâmetro.
     *
     * @param {number} x
     * @param {number} y
     * @returns {*}
     */

    mod(x, y){

        var s = x;

        while(y<=s) s = s-y;

        return s;
    }

    /**
     *
     * @param {number} n
     * @returns {number}
     */

    soma(n) {

        var i = 2;
        var s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    /**
     *
     * @param {number} n
     * @returns {number}
     */

    fatorial(n){

        var i = 2;
        var f = 1;

        while(i<=n){
            f = f*i;
            i = i+1;
        }

        return f;
    }

    /**
     *
     * @param {number} a
     * @param {number} b
     * @returns {number}
     */

    produto(a, b){

        var totalParcelas = a;
        var parcela = b;

        if(b<a){
            totalParcelas = b;
            parcela = a;
        }

        var i = 1;
        var s = 0;

        while(i<=totalParcelas){
            s = s + parcela;
            i = i + 1;
        }

        return s;
    }

    /**
     *
     * @param {number} x
     * @param {number} y
     * @returns {number}
     */

    potencia(x, y){

        var potencia = 1;
        var i = 1;

        while(i<=y){
            potencia = produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    /**
     *
     * @param {number} n
     * @returns {number}
     */

    pi(n){

        var i = 1;
        var s = -1;
        var d = -1;
        var p = 0;

        while(i<=n){
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }

        return p;
    }

    /**
     *
     * @param {number} n
     * @param {number} k
     * @returns {*}
     */

    logaritmoNatural(n, k){

        var i = 2;
        var e = 1 + n;
        var numerador = n;
        var denominador = 1;

        while(i<=k){
            numerador = numerador*numerador;
            denominador = denominador*i;
            e = e + numerador/denominador;
            i = i + 1;
        }

        return e;
    }

    /**
     *
     * @param {number} x
     * @param {number} y
     * @param {number} k
     * @returns {number}
     */

    razaoAurea(x, y, k){

        var c = y;
        var a = x;
        var i = 1;

        while(i<=k){
            var t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c/a;
    }

    /**
     *
     * @param {number} n
     * @returns {boolean}
     */

    quadradoPerfeito(n){

        var i = 1;
        var s = 1;

        while(s<n){
            i = i+2;
            s = s+i;
        }

        return s == n;
    }

    /**
     *
     * @param {number} n
     * @param {number} i
     * @returns {number}
     */

    raiz(n, i){

        var r = 1;

        while(0<=i){
            r = (r+n/r)/2;
            i = i - 1;
        }

        return r;
    }

    /**
     *
     * @param {number} n
     * @returns {boolean}
     */

    primo(n){

        var i = 2;

        while(i<n){
            if(n%i == 0) return false;
            i = i + 1;
        }

        return true;
    }

    /**
     *
     * @param {number} a
     * @param {number} n
     */

    crivoEratostenes(a, n){

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

            i = i + 1;
        }
    }

    /**
     *
     * @param {number} a
     * @param {number} b
     * @returns {number}
     */

    mdc(a, b){

        while (b != 0){
            var m = a % b;
            a = b;
            b = m;
        }

        return a;

    }

    /**
     *
     * @param {number} a
     * @param {number} b
     * @returns {number}
     */

    mdc2(a, b){

        while (a != b){
            if (a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }

        return a;
    }

    /**
     *
     * @param {number} x
     * @param {number} g
     * @param {number} a
     * @returns {number}
     */

    horner(x, g, a) {

        var p = a[g];
        var i = g - 1;

        while (0 <= i) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    /**
     *
     * @param {number} n
     * @returns {number}
     */

    fibonacci(n) {

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
     *
     * @param {number} d
     * @returns {boolean}
     */

    cpf(d) {
        var j = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
        var k = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6] + 6 * d[7] + 7 * d[8] + 8 * d[9] + 9 * d[10];

        var dj = ((j % 11) % 10);
        var dk = ((k % 11) % 10);

        return (dj == d[10] && dk == d[11]);
    }

    /**
     * 
     * @param d
     * @returns {boolean}
     */

    cpf2(d) {

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

}








