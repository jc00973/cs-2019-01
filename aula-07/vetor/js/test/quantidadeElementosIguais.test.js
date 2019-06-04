const funcoes = require("../AlgoritmosVetor");

test("teste 1", () => {
    expect(funcoes.quantidadeElementosIguais([0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0], 1)).toBe(4);
});

