const funcoes = require("../AlgoritmosEmJs");

test("satisfaz: 2", () => {
    expect(funcoes.primo(2)).toBe(true);
});

test("satisfaz: 3", () => {
    expect(funcoes.primo(3)).toBe(true);
});

test("satisfaz: 5", () => {
    expect(funcoes.primo(5)).toBe(true);
});

test("não satisfaz: 4", () => {
    expect(funcoes.primo(4)).toBe(false);
});

test("não satisfaz: 6", () => {
    expect(funcoes.primo(6)).toBe(false);
});

test("não satisfaz: 8", () => {
    expect(funcoes.primo(8)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.primo(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.primo("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.primo(-1); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.primo(10.3)).toThrow();
});
