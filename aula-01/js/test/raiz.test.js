const funcoes = require("../algoritmosEmJs");

test("raiz de 1", () => {
    expect(funcoes.raiz(1, 100)).toBe(1);
});

test("raiz de 4", () => {
    expect(funcoes.raiz(4, 100)).toBe(2);
});

test("raiz de 9", () => {
    expect(funcoes.raiz(9, 100)).toBe(3);
});

test("raiz de 16", () => {
    expect(funcoes.raiz(16, 100)).toBe(4);
});

test("raiz de 25", () => {
    expect(funcoes.raiz(25, 100)).toBe(5);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.raiz(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.raiz("abcd", 4); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.raiz(-1, 5); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.raiz(10.3, 5.4, 2010)).toThrow();
});
