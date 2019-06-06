const funcoes = require("../algoritmosEmJs");

var vetorTeste1 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

var vetorTeste2 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

test("satisfaz: 2", () => {
    expect(funcoes.crivoEratostenes([0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 2)).toBe(true);
});

test("satisfaz: 3", () => {
    expect(funcoes.crivoEratostenes([0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 3)).toBe(true);
});

test("satisfaz: 5", () => {
    expect(funcoes.crivoEratostenes([0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 5)).toBe(true);
});

test("satisfaz: 59", () => {
    expect(funcoes.crivoEratostenes(vetorTeste1, 59)).toBe(true);
});

test("não satisfaz: 4", () => {
    expect(funcoes.crivoEratostenes([0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 4)).toBe(false);
});

test("não satisfaz: 6", () => {
    expect(funcoes.crivoEratostenes([0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 6)).toBe(false);
});

test("não satisfaz: 8", () => {
    expect(funcoes.crivoEratostenes([0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 8)).toBe(false);
});

test("não satisfaz: 36", () => {
    expect(funcoes.crivoEratostenes(vetorTeste2, 36)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcoes.crivoEratostenes();
    }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => {
        funcoes.crivoEratostenes("abcd");
    }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcoes.crivoEratostenes(-1);
    }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.crivoEratostenes(10.3)).toThrow();
});
