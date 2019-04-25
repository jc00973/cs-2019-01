function propriedade3025(n) {
    if (typeof n != "number") {
        throw new TypeError("numero esperado");
    }

    if (n < 0 || n > 9999) {
        throw new RangeError("numero fora da faixa");
    }

    if (n != Math.floor(n)) {
        throw new TypeError("apenas valor inteiro");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;

    return ((i + j) ** 2) == n;
}



