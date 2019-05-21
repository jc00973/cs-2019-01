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