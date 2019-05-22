function propriedade3025(n) {

    var i = Math.floor(n / 100);
    var j = Math.floor(n % 100);

    return Math.pow((i + j), 2) == n;
}

function propriedade153(n) {

    var c = n / 100;
    var du = n % 100;
    var d = du / 10;
    var u = du % 10;

    var x = Math.pow(c, 3);
    var y = Math.pow(d, 3);
    var z = Math.pow(u, 3);

    return (x + y + z) == n;
}

function diaDaSemana(d, m, a) {

    if ((m == 1) || (m == 2)) {
        m = m + 12;
        a = a - 1;
    }

    var s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;

    return Math.floor(s % 7);
}

function mod(x, y){

    var s = x;

    while(y<=s) s = s-y;

    return s;
}

function soma(n) {

    var i = 2;
    var s = 1;

    while (i <= n) {
        s = s + i;
        i = i + 1;
    }

    return s;
}

function fatorial(n){

    var i = 2;
    var f = 1;

    while(i<=n){
        f = f*i;
        i = i+1;
    }

    return f;
}

function produto(a, b){

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

function potencia(x, y){

    var potencia = 1;
    var i = 1;

    while(i<=y){
        potencia = produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}

function pi(n){

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

function logaritmoNatural(n, k){

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

function razaoAurea(x, y, k){

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

function quadradoPerfeito(n){

    var i = 1;
    var s = 1;

    while(s<n){
        i = i+2;
        s = s+i;
    }

    return s == n;
}

function raiz(n, i){

    var r = 1;

    while(0<=i){
        r = (r+n/r)/2;
        i = i - 1;
    }

    return r;
}

function primo(n){

    var i = 2;

    while(i<n){
        if(n%i == 0) return false;
        i = i + 1;
    }

    return true;
}

function crivoEratostenes(a, n){

    var i = 2;
    var limite = Math.floor(Math.sqrt(n));

    while (i <= limite) {
        if (a[i] == 0) {

            document.write("q");
            var multiplo = i + i;

            while (multiplo <= n) {
                a[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }

        i = i + 1;
    }
}

function mdc(a, b){

    while (b != 0){
        var m = a % b;
        var a = b;
        var b = m;
    }

    return a;

}

function mdc2(a, b){

    while (a != b){
        if (a > b){
            a = a - b;
        }else{
            b = b - a;
        }
    }

    return a;
}

function horner(x, g, a) {

    var p = a[g];
    var i = g - 1;

    while (0 <= i) {
        p = p * x + a[i];
        i = i - 1;
    }

    return p;
}

function fibonacci(n) {

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



