const funcoes = require("../AlgoritmosEmJs");

test("n = 0", () => {
    expect(() => { funcoes.fatorial(); }).toThrow();
});

test("n = 1", () => {
    expect(funcoes.fatorial(1)).toBe(1);
});

test("n = 2", () => {
    expect(funcoes.fatorial(2)).toBe(2);
});

test("n = 3", () => {
    expect(funcoes.fatorial(3)).toBe(6);
});

test("n = 4", () => {
    expect(funcoes.fatorial(4)).toBe(24);
});

test("n = 5", () => {
    expect(funcoes.fatorial(5)).toBe(120);
});

test("n = 6", () => {
    expect(funcoes.fatorial(6)).toBe(720);
});

test("n = 7", () => {
    expect(funcoes.fatorial(7)).toBe(5040);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.fatorial(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.fatorial("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.fatorial(-17); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.fatorial(10.3)).toThrow();
});
