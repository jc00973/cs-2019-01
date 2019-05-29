const funcoes = require("../AlgoritmosEmJs");

test("sábado, 25 de maio de 2019", () => {
    expect(funcoes.diaDaSemana(25, 5, 2019)).toBe(5);
});

test("terça, 25 de junho de 2020", () => {
    expect(funcoes.diaDaSemana(25, 6, 2019)).toBe(1);
});

test("segunda, 1 de julho de 2019", () => {
    expect(funcoes.diaDaSemana(1, 7, 2019)).toBe(0);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.diaDaSemana(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.diaDaSemana("abcd", 4, 5); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.diaDaSemana(-1, 5, 2019); }).toThrow();
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcoes.diaDaSemana(10000, 5000, 500000)).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.diaDaSemana(10.3, 5.4, 2010)).toThrow();
});
