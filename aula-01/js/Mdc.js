function mdc(a, b){

    while (b != 0){
        var m = a % b;
        var a = b;
        var b = m;
    }

    return a;

}