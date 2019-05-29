const funcoes = require("../AlgoritmosEmJs");

test("potencia de 5 por 7", () => {
    expect(funcoes.potencia(5, 7)).toBe(78125);
});

test("potencia de 3 por 10", () => {
    expect(funcoes.potencia(3, 10)).toBe(59049);
});

test("potencia de 2 por 6", () => {
    expect(funcoes.potencia(2, 6)).toBe(64);
});

test("potencia de 40 por 5", () => {
    expect(funcoes.potencia(40, 5)).toBe(102400000);
});

test("potencia de 11 por 3", () => {
    expect(funcoes.potencia(11, 3)).toBe(1331);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.potencia(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.potencia("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.potencia(-17); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.potencia(10.3)).toThrow();
});
