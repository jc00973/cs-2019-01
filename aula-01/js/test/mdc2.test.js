const funcoes = require("../algoritmosEmJs");

test("mdc2 de 81 e 54", () => {
    expect(funcoes.mdc2(81, 54)).toBe(27);
});

test("mdc2 de 54 e 27", () => {
    expect(funcoes.mdc2(54, 27)).toBe(27);
});

test("mdc2 de 12 e 30", () => {
    expect(funcoes.mdc2(30, 12)).toBe(6);
});

test("mdc2 de 15 e 25", () => {
    expect(funcoes.mdc2(25, 15)).toBe(5);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.mdc2(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.mdc2("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.mdc2(-1); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.mdc2(10.3)).toThrow();
});
