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
        throw new RangeError("Parâmetro inválido. O valor está fora do intervalo válido.")
    }

}

function validarCpf(cpf) {
    if (cpf == null) {
        throw new TypeError("Parâmetro inválido. O valor é nulo.");
    }

    if (cpf.length != 12) {
        throw new TypeError("Parâmetro inválido. O valor não tem 11 dígitos.")
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
            throw new RangeError("Parâmetro inválido. O valor está fora do intervalo válido.")
        }

        i++;
    }
}

function validarVetorCrivo(vetor, n){

    var i = 2;

    while(i <= n){
        if(vetor[i] == 0){
            i++;
        }else{
            throw new TypeError("Parâmetro inválido. O vetor informado não atende aos requisitos exigidos.")
        }
    }
}

function propriedade3025(n) {

    validarParametro(n, 0, 9999);

    var i = Math.floor(n / 100);
    var j = Math.floor(n % 100);

    return Math.pow((i + j), 2) == n;
}

function propriedade153(n) {

    validarParametro(n, 100, 999);

    var c = Math.floor(n / 100);
    var du = n % 100;
    var d = Math.floor(du / 10);
    var u = du % 10;

    return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == n;
}

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

function mod(x, y) {

    validarParametro(x, 0);
    validarParametro(y, 0);

    var s = x;

    while (y <= s){
        s = s - y;
    }

    return s;
}

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

function raiz(n, i) {

    validarParametro(n, 1);

    var r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;
}

function primo(n) {

    validarParametro(n, 2);

    var i = 2;

    while (i < n) {
        if (n % i == 0) return false;
        i = i + 1;
    }

    return true;
}

function crivoEratostenes(a, n) {

    validarParametro(n, 2);
    validarVetorCrivo(a);

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

function cpf(d) {

    validarCpf(d);

    var j = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
    var k = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6] + 6 * d[7] + 7 * d[8] + 8 * d[9] + 9 * d[10];

    var dj = ((j % 11) % 10);
    var dk = ((k % 11) % 10);

    return (dj == d[10] && dk == d[11]);
}

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





