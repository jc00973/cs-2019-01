/**
 * Implementação em Java da validação dos parâmetros dos 21 algoritmos.
 *
 * @author jc00973 - João Carlos Fonseca
 */

package com.github.jc00973.ufg.cs.aula01;

public final class ExceptionUtils {

    private ExceptionUtils() { };

    /**
     * A função valida o parâmetro informado em outra função. Essa função verifica se o parâmetro é menor que o valor
     * mínimo do intervalo válido.
     *
     * @param parametro   O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarParametroMin(final int parametro, final int valorMinimo) {

        if (parametro < valorMinimo) {
            throw new IllegalArgumentException("Parâmetro menor que o valor mínimo. O valor está fora do "
                    + "intervalo válido.");
        }

    }

    /**
     * A função valida o parâmetro informado em outra função. Essa função verifica se o parâmetro é menor que o valor
     * mínimo do intervalo válido. Diferente da função anterior, essa é voltada para parâmetros do tipo double.
     *
     * @param parametro   O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarParametroMinDouble(final double parametro, final double valorMinimo) {

        if (parametro < valorMinimo) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor é menor que o permitido para o intervalo"
                    + "válido.");
        }

    }

    /**
     * A função valida o parâmetro informado em outra função. Essa função verifica se o parâmetro está
     * dentro do intervalo válido de valores.
     *
     * @param parametro   O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
     * @param valorMaximo O valor máximo válido para o parâmetro.
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarParametro(final int parametro, final int valorMinimo, final int valorMaximo) {

        if (parametro < valorMinimo || parametro > valorMaximo) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
        }

    }

    /**
     * A função valida o parâmetro informado como vetor para a função crivoEratostenes(). Essa função verifica
     * se os valores do vetor são iguais a zero para qualquer i que esteja no intervalo 2 ≤ i ≤ n.
     *
     * @param vetor O parâmetro vetor que será validado.
     * @param n     Refere-se ao parâmetro n, que indica o tamanho mínimo que o vetor deve ter.
     * @throws {IllegalArgumentException} Caso o vetor não atenda aos requisitos definidos.
     */


    public static void validarVetorCrivo(final int[] vetor, final int n) {

        int i = 2;

        while (i <= n) {
            if (vetor[i] == 0) {
                i++;
            } else {
                throw new IllegalArgumentException("Parâmetro inválido. O vetor informado não atende aos requisitos "
                        + "exigidos.");
            }
        }
    }

    /**
     * A função valida o parâmetro informado como cpf. Essa função verifica se o parâmetro é nulo, se
     * está dentro do intervalo válido de valores e se o cpf tem 11 dígitos.
     *
     * @param cpf O parâmetro cpf que será validado.
     * @throws {IllegalArgumentException} Caso o parâmetro seja nulo.
     * @throws {IllegalArgumentException} Caso o parâmetro não tenha 11 dígitos.
     */

    public static void validarCpf(final int[] cpf) {

        if (cpf == null) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor é nulo.");
        }

        final int ultimaPosicaoCpf = 12;

        if (cpf.length != ultimaPosicaoCpf) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor não tem 11 dígitos.");
        }
    }

    /**
     * A função valida o parâmetro informado como cpf. Ela verifica se os dígitos são 0, 1, 2, 3, 4, 5, 6, 7, 8 ou 9.
     *
     * @param cpf O parâmetro cpf que será validado.
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarDigitosCpf(final int[] cpf) {

        int i = 0;
        final int digitoMaxCpf = 9;
        final int ultimaPosicaoCpf = 12;

        while (i < ultimaPosicaoCpf && digitoMaxCpf != 0) {
            if (cpf[i] < 0 || cpf[i] > digitoMaxCpf) {
                throw new IllegalArgumentException("Parâmetro inválido. O valor não é um dígito válido.");
            }

            i++;
        }
    }
}
