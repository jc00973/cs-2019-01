const funcoes = require("../AlgoritmosVetor");

test("teste 1", () => {
    expect(funcoes.localizarPalavraFrequente("Joao Jose Joao Joao Joao Jose Marilda")).toBe("Joao");
    expect(funcoes.localizarPalavraFrequente("Terca Quarta Sexta Quinta Sexta Sexta Quarta")).toBe("Sexta");
});

