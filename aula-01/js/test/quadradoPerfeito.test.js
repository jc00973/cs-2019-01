const funcoes = require("../AlgoritmosEmJs");

test("satisfaz: 1", () => {
    expect(funcoes.quadradoPerfeito(1)).toBe(true);
});

test("satisfaz: 4", () => {
    expect(funcoes.quadradoPerfeito(4)).toBe(true);
});

test("satisfaz: 9", () => {
    expect(funcoes.quadradoPerfeito(9)).toBe(true);
});

test("satisfaz: 16", () => {
    expect(funcoes.quadradoPerfeito(16)).toBe(true);
});

test("satisfaz: 25", () => {
    expect(funcoes.quadradoPerfeito(25)).toBe(true);
});

test("não satisfaz: 2", () => {
    expect(funcoes.quadradoPerfeito(2)).toBe(false);
});

test("não satisfaz: 3", () => {
    expect(funcoes.quadradoPerfeito(3)).toBe(false);
});

test("não satisfaz: 5", () => {
    expect(funcoes.quadradoPerfeito(5)).toBe(false);
});

test("não satisfaz: 6", () => {
    expect(funcoes.quadradoPerfeito(6)).toBe(false);
});

test("não satisfaz: 7", () => {
    expect(funcoes.quadradoPerfeito(7)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.quadradoPerfeito(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.quadradoPerfeito("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.quadradoPerfeito(-1); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.quadradoPerfeito(10.3)).toThrow();
});
