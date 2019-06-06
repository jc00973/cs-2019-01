const funcoes = require("../algoritmosEmJs");

test("3025 satisfaz (caso classico)", () => {
    expect(funcoes.propriedade3025(3025)).toBe(true);
});

test("1 satisfaz", () => {
    expect(funcoes.propriedade3025(1)).toBe(true);
});

test("9988 nao satisfaz", () => {
    expect(funcoes.propriedade3025(9988)).toBe(false);
});

test("3024 nao satisfaz", () => {
    expect(funcoes.propriedade3025(3024)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcoes.propriedade3025();
    }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => {
        funcoes.propriedade3025("abcd");
    }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcoes.propriedade3025(-1);
    }).toThrow();
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcoes.propriedade3025(10000)).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.propriedade3025(10.3)).toThrow();
});
