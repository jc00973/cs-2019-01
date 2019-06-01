const funcoes = require("../algoritmosEmJs");

test("razão áurea", () => {
    expect(funcoes.razaoAurea(1, 2, 1000)).toBe(1.6180339887498947);
});

test("razão áurea", () => {
    expect(funcoes.razaoAurea(3, 7, 1000)).toBe(1.618033988749895);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.razaoAurea(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.razaoAurea("abcd", 4, 6); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.razaoAurea(-1, 5, -3); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.razaoAurea(10.3, 5.4, 2010)).toThrow();
});
