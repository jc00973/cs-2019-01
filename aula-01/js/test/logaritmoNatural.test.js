const funcoes = require("../algoritmosEmJs");

//test("3 e 3", () => {
//    expect(funcoes.logaritmoNatural(3, 100)).toBe(20.0855369);
//});

test("argumento null/undefined", () => {
    expect(() => { funcoes.logaritmoNatural(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.logaritmoNatural("abcd", 4); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.logaritmoNatural(-1, 5); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.logaritmoNatural(10.3, 2010)).toThrow();
});
