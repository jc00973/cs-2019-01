const funcoes = require("../AlgoritmosVetor");

test("teste 1", () => {
    expect(funcoes.somaNumerosImpares([0, 4, 5, 13, 17, 21, 6, 1, 9])).toBe(66);
});

