const funcoes = require("../algoritmosEmJs");

test("meu cpf válido: 056874881-62", () => {
    expect(funcoes.cpf2([0, 0, 5, 6, 8, 7, 4, 8, 8, 1, 6, 2])).toBe(true);
});

test("cpf da minha mãe válido: 222715382-20", () => {
    expect(funcoes.cpf2([0, 2, 2, 2, 7, 1, 5, 3, 8, 2, 2, 0])).toBe(true);
});

test("cpf do meu irmão válido: 00175506299", () => {
    expect(funcoes.cpf2([0, 0, 0, 1, 7, 5, 5, 0, 6, 2, 9, 9])).toBe(true);
});

test("cpf falso", () => {
    expect(funcoes.cpf2([0, 3, 0, 5, 4, 0, 0, 4, 0, 0, 4, 0])).toBe(false);
});

test("outro cpf falso", () => {
    expect(funcoes.cpf2([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2])).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcoes.cpf2(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcoes.cpf2([0, "a", 5, 4, 3, 2, 1, 5, 6, 8, 6, 5]); }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcoes.cpf2([0, -1, 5, 4, 3, 2, 1, 5, 6, 8, 6, 5]); }).toThrow();
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.cpf2([0, 5.5, 5, 4, 3, 2, 1, 5, 6, 8, 6, 5])).toThrow();
});
