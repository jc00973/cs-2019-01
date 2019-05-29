const funcoes = require("../AlgoritmosEmJs");

test("mdc de 81 e 54", () => {
    expect(funcoes.mdc(81, 54)).toBe(27);
});

test("mdc de 54 e 27", () => {
    expect(funcoes.mdc(54, 27)).toBe(27);
});

test("mdc de 12 e 30", () => {
    expect(funcoes.mdc(30, 12)).toBe(6);
});

test("mdc de 15 e 25", () => {
    expect(funcoes.mdc(25, 15)).toBe(5);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.mdc(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.mdc("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.mdc(-1); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.mdc(10.3)).toThrow();
});
