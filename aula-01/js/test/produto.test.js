const funcoes = require("../algoritmosEmJs");

test("produto de 5 por 7", () => {
    expect(funcoes.produto(5, 7)).toBe(35);
});

test("produto de 13 por 10", () => {
    expect(funcoes.produto(13, 10)).toBe(130);
});

test("produto de 2 por 86", () => {
    expect(funcoes.produto(2, 86)).toBe(172);
});

test("produto de 40 por 5", () => {
    expect(funcoes.produto(40, 5)).toBe(200);
});

test("produto de 1001 por 6", () => {
    expect(funcoes.produto(1001, 6)).toBe(6006);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.produto(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.produto("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.produto(-17); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.produto(10.3)).toThrow();
});
