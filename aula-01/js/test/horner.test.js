const funcoes = require("../AlgoritmosEmJs");

test("x = 1, g = 5, a = [1, 1, 1, 1, 1, 0], logo p = 5", () => {
    expect(funcoes.horner(1, 5, [1, 1, 1, 1, 1, 0])).toBe(5);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.horner(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.horner("abcd", 1, [1, 2, 3]); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.horner(-1, -5, [1, 2, 3]); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.horner(10.3, 5.4, [1.2, 3, 4])).toThrow();
});
