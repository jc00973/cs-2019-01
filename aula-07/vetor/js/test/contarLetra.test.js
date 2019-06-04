const funcoes = require("../AlgoritmosVetor");

test("teste 1", () => {

    resultado1 = [3, 2, 3, 2, 3];
    resultado2 = [1, 1, 1];
    resultado3 = [2, 2, 1, 2, 2, 1, 2, 1, 1, 2];

    expect(funcoes.contarLetra("arara")).toMatchObject(resultado1);
    expect(funcoes.contarLetra("ufg")).toMatchObject(resultado2);
    expect(funcoes.contarLetra("engenharia")).toMatchObject(resultado3);
});

