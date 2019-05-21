function horner(x, g, a) {

    var p = a[g];
    var i = g - 1;

    while (0 <= i) {
        p = p * x + a[i];
        i = i - 1;
    }

    return p;
}