const funcoes = require("../algoritmosEmJs");

test("153 satisfaz (caso classico)", () => {
    expect(funcoes.propriedade153(153)).toBe(true);
});

test("123 nao satisfaz", () => {
    expect(funcoes.propriedade153(998)).toBe(false);
});

test("376 nao satisfaz", () => {
    expect(funcoes.propriedade153(302)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.propriedade153(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.propriedade153("abcd"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.propriedade153(-17); }).toThrow();
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcoes.propriedade153(10000)).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.propriedade153(10.3)).toThrow();
});
