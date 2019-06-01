const funcoes = require("../algoritmosEmJs");

test("25 mod 5", () => {
    expect(funcoes.mod(25, 5)).toBe(0);
});

test("25 mod 4", () => {
    expect(funcoes.mod(25, 4)).toBe(1);
});

test("100 mod 99", () => {
    expect(funcoes.mod(100, 99)).toBe(1);
});

test("20 mod 3", () => {
    expect(funcoes.mod(20, 3)).toBe(2);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.mod(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.mod("abcd", 4); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.mod(-1, 5); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.mod(10.3, 5.4, 2010)).toThrow();
});
