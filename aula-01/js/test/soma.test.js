const funcoes = require("../AlgoritmosEmJs");

test("n = 1", () => {
    expect(funcoes.soma(1)).toBe(1);
});

test("n = 2", () => {
    expect(funcoes.soma(2)).toBe(3);
});

test("n = 3", () => {
    expect(funcoes.soma(3)).toBe(6);
});

test("n = 4", () => {
    expect(funcoes.soma(4)).toBe(10);
});

test("n = 5", () => {
    expect(funcoes.soma(5)).toBe(15);
});

test("n = 6", () => {
    expect(funcoes.soma(6)).toBe(21);
});

test("n = 7", () => {
    expect(funcoes.soma(7)).toBe(28);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.soma(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.soma("abcd"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.soma(-17); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.soma(10.3)).toThrow();
});
