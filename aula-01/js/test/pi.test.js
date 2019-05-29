const funcoes = require("../AlgoritmosEmJs");

test("argumento null/undefined", () => {
    expect(() => { funcoes.pi(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.pi("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.pi(-17); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.pi(10.3)).toThrow();
});
