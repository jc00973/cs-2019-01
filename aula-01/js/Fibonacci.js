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