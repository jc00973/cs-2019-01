function propriedade3025(n) {
	if (typeof n != "number") {
		throw new TypeError("numero esperado");
	}

	if (n < 0 || n > 9999) {
		throw new RangeError("numero fora da faixa");
	}

	const i = Math.floor(n/100);
    const j = Math.floor(n%100);
    
  	return (((i+j)**2) == n);
}



