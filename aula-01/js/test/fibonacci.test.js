const funcoes = require("../AlgoritmosEmJs");

test("2º termo da sequência fibonacci", () => {
    expect(funcoes.fibonacci(2)).toBe(2);
});

test("3º termo da sequência fibonacci", () => {
    expect(funcoes.fibonacci(3)).toBe(3);
});

test("5º termo da sequência fibonacci", () => {
    expect(funcoes.fibonacci(5)).toBe(8);
});

test("8º termo da sequência fibonacci", () => {
    expect(funcoes.fibonacci(8)).toBe(34);
});

test("11º termo da sequência fibonacci", () => {
    expect(funcoes.fibonacci(11)).toBe(144);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.fibonacci(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.fibonacci("abcd"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.fibonacci(-1); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.fibonacci(10.3)).toThrow();
});
