/**
 * Implementação em Java dos 21 algoritmos propostos na aula 01.
 *
 * @author jc00973 - João Carlos Fonseca
 */

package com.github.jc00973.ufg.cs.aula01;

public final class AlgoritmosEmJava {

    private AlgoritmosEmJava() { };

    /**
     * A função valida o parâmetro informado em outra função. Essa função verifica se o parâmetro é menor que o valor
     * mínimo do intervalo válido.
     *
     * @param parametro O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
     *
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarParametroMin(final int parametro, final int valorMinimo) {

        if (parametro < valorMinimo) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
        }

    }

    /**
     * A função valida o parâmetro informado em outra função. Essa função verifica se o parâmetro é menor que o valor
     * mínimo do intervalo válido. Diferente da função anterior, essa é voltada para parâmetros do tipo double.
     *
     * @param parametro O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
     *
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarParametroMinDouble(final double parametro, final double valorMinimo) {

        if (parametro < valorMinimo) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
        }

    }

    /**
     * A função valida o parâmetro informado em outra função. Essa função verifica se o parâmetro está
     * dentro do intervalo válido de valores.
     *
     * @param parametro O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
     * @param valorMaximo O valor máximo válido para o parâmetro.
     *
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
     * @param n Refere-se ao parâmetro n, que indica o tamanho mínimo que o vetor deve ter.
     *
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
     *
     * @throws {IllegalArgumentException} Caso o parâmetro seja nulo.
     * @throws {IllegalArgumentException} Caso o parâmetro não tenha 11 dígitos.
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarCpf(final int[] cpf) {

        if (cpf == null) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor é nulo.");
        }

        if (cpf.length != 12) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor não tem 11 dígitos.");
        }

        int i = 0;

        while (i < 12) {
            if (cpf[i] < 0 || cpf[i] > 9) {
                throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
            }

            i++;
        }
    }

    /**
     * Verifica se o parâmetro é um número que apresenta a
     * propriedade 3025.
     *
     * @param n O número que será verificado.
     *
     * @returns O resultado da verificação.
     */

    public static boolean propriedade3025(final int n) {

        validarParametro(n, 0, 9999);

        final int i = n / 100;
        final int j = n % 100;

        return Math.pow((i + j), 2) == n;
    }

    /**
     * Verifica se o parâmetro é um número que apresenta a
     * propriedade 153.
     *
     * @param n O número que será verificado.
     *
     * @returns O resultado da verificação.
     */

    public static boolean propriedade153(final int n) {

        validarParametro(n, 100, 999);

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        final double x = Math.pow(c, 3);
        final double y = Math.pow(d, 3);
        final double z = Math.pow(u, 3);

        return (x + y + z) == n;
    }

    /**
     * Verifica o dia da semana referente a data informada.
     *
     * @param d Dia da data.
     * @param m Mês da data.
     * @param a Ano da data.
     *
     * @returns O número correspondente ao dia
     * da semana da data, entre 0 e 6. O valor retornado é 0 para
     * segunda-feira, 1 para terça-feira e assim sucessivamente.
     */

    public static double diaDaSemana(final int d, int m, int a) {

        validarParametro(d, 1, 31);
        validarParametro(m, 1, 12);
        validarParametroMin(a, 1753);

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        final int s = (d + 2 * m + (3 * (m + 1)) / 5 + a + a / 4 - a / 100 + a / 400);

        return s % 7;
    }

    /**
     * A função calcula o resto inteiro da divisão (mod) entre os parâmetros.
     *
     * @param x Numerador da divisão.
     * @param y Denominador da divisão.
     *
     * @returns O valor do mod.
     */

    public static int mod(final int x, final int y) {

        validarParametroMin(x, 0);
        validarParametroMin(y, 0);

        int s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
    }

    /**
     * A função realiza a soma de todos os inteiros naturais até o valor inteiro
     * informado no parâmetro.
     *
     * @param n Valor final para a soma.
     *
     * @returns O valor do somatório.
     */

    public static int soma(final int n) {

        validarParametroMin(n, 1);

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    /**
     * A função calcula o fatorial do número natural informado no parâmetro.
     *
     * @param n Número natural que terá o fatorial calculado.
     *
     * @returns O fatorial do parâmetro.
     */

    public static int fatorial(final int n) {

        validarParametroMin(n, 1);

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    /**
     * A função calcula o produto de dois inteiros usando apenas somas.
     *
     * @param a Primeiro inteiro da operação de multiplicação.
     * @param b Segundo inteiro da operação de multiplicação.
     *
     * @returns O produto da operação.
     */

    public static int produto(final int a, final int b) {

        validarParametroMin(a, 0);
        validarParametroMin(b, 0);

        int totalParcelas = a;
        int parcela = b;

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }

        int i = 1;
        int s = 0;

        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }

        return s;
    }

    /**
     * A função calcula a potência de um número (base) usando apenas somas.
     * Ela reutiliza a função anterior, produto().
     *
     * @param x Base.
     * @param y Expoente.
     *
     * @returns Potência.
     */

    public static int potencia(final int x, final int y) {

        validarParametroMin(x, 0);
        validarParametroMin(y, 0);

        int potencia = 1;
        int i = 1;

        while (i <= y) {
            potencia = produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    /**
     * A função estima o valor de pi, sendo a precisão do resultado proporcional ao tamanho
     * do parâmetro.
     *
     * @param n Quantidade de termos do somatório.
     *
     * @returns Estimativa do valor de pi.
     */

    public static double pi(final  int n) {

        validarParametroMin(n, 1);

        double i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }

        return p;
    }

    /**
     * A função realiza o somatório que estima o valor do logaritmo natural dado um
     * expoente n qualquer (desde que seja um número natural e positivo). A precisão do
     * resultado é proporcional ao tamanho do parâmetro k.
     *
     * @param n Expoente natural positivo.
     * @param k Quantidade de termos do somatório.
     *
     * @returns Valor aproximado do logaritmo natural por n.
     */

    public static double logaritmoNatural(final double n, final double k) {

        validarParametroMinDouble(n, 1);
        validarParametroMinDouble(k, 2);

        double i = 2;
        double e = 1 + n;
        double numerador = n;
        double denominador = 1;

        while (i <= k) {
            numerador = numerador * numerador;
            denominador = denominador + i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;

    }

    /**
     * A função estima a razão áurea dado dois números inteiros positivos.
     * A precisão do resultado é proporcional ao tamanho do parâmetro k.
     *
     * @param x Primeiro inteiro positivo.
     * @param y Segundo inteiro positivo.
     * @param k O número de repetições.
     *
     * @returns A estimativa do valor da razão áurea.
     */

    public static double razaoAurea(final int x, final int y, final int k) {

        validarParametroMin(x, 0);
        validarParametroMin(y, x + 1);
        validarParametroMin(k, 1);

        double c = y;
        double a = x;
        double i = 1;

        while (i <= k) {
            double t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c / a;
    }

    /**
     * A função retorna verdadeiro se o número fornecido for um quadrado perfeito.
     *
     * @param n Número que será verificado.
     *
     * @returns Resposta para se o número é ou não um quadrado perfeito.
     */

    public static boolean quadradoPerfeito(final int n) {

        validarParametroMin(n, 1);

        int i = 1;
        int s = 1;

        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return (s == n);
    }

    /**
     * A função é para extração da raiz quadrada. Quanto maior o valor de i mais preciso
     * é o valor da raiz desejada.
     *
     * @param n Número o qual deseja-se extrair a raíz quadrada.
     * @param i Quantidade de repetições para definição da precisão desejada.
     *
     * @returns Raíz quadrada de n.
     */

    public static double raiz(final double n, double i) {

        validarParametroMinDouble(n, 1);

        double r = 1;

        while (0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    /**
     * A função verifica de n é um número primo.
     *
     * @param n Número que deseja-se saber se é primo.
     *
     * @returns Resultado da verificação sobre o n ser ou não um número primo.
     */

    public static boolean primo(final int n) {

        validarParametroMin(n, 2);

        double i = 2;

        while (i < n) {
            if (n % i == 0) {
                return false;
            }

            i = i + 1;
        }

        return true;
    }

    /**
     * A função implementa um método de determinação de números primos.
     *
     * @param a Array contendo apenas zeros, devendo a quantidade de elementos
     * ser maior ou igual ao parâmetro n.
     * @param n Número o qual deseja-se saber se é primo ou não.
     *
     * @returns Resultado da verificação sobre o n ser ou não um número primo.
     */

    public static boolean crivoEratostenes(int a[], final int n) {

        validarParametroMin(n, 2);
        validarVetorCrivo(a, n);

        int i = 2;
        final double limite = Math.floor(Math.sqrt(n));

        while (i <= limite) {
            if (a[i] == 0) {

                int multiplo = i + i;

                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }

            i = i + 1;
        }

        return a[n] == 0;
    }

    /**
     * Função para identificar o maior divisor comum entre dois inteiros.
     *
     * @param a Primeiro inteiro.
     * @param b Segundo inteiro.
     *
     * @returns O maior divisor comum entre os dois inteiros informados.
     */

    public static double mdc(double a, double b) {

        validarParametroMinDouble(b, 1);
        validarParametroMinDouble(a, b);

        double m = 0;

        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

    /**
     * Função para identificar o maior divisor comum entre dois inteiros, assim como a
     * função anterior. No entanto, este algoritmo limita-se ao uso de subtrações para
     * calcular o resultado.
     *
     * @param a Primeiro inteiro.
     * @param b Segundo inteiro.
     *
     * @returns O maior divisor comum entre os dois inteiros informados.
     */

    public static double mdc2(int a, int b) {

        validarParametroMin(b, 1);
        validarParametroMin(a, b);

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    /**
     * A função realiza a avaliação de um polinômio para um valor especifco de x.
     *
     * @param x Valor x do polinômio.
     * @param g Quantidade de elementos a do polinômio.
     * @param a Array com os elementos a do polinômio.
     *
     * @returns O resultado do polinômio.
     */

    public static double horner(final int x, final int g, final int a[]) {

        validarParametroMin(g, 1);

        double p = a[g];
        int i = g - 1;

        while (0 <= i) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    /**
     * A função é uma proposta de obtenção do n-ésimo número de Fibonacci
     * (versão não recursiva).
     *
     * @param n Valor correspondente à posição que deseja-se saber o valor na
     * sequência de Fibonacci.
     *
     * @returns O n-ésimo número de Fibonacci.
     */

    public static int fibonacci(int n) {

        validarParametroMin(n, 0);

        int a = 0;
        int c = 1;

        if ((n == 0) || (n == 1)) {
            return n;
        }

        n++;

        int i = 2;

        while (i <= n) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }

    /**
     * Função validadora de número de cpf.
     *
     * @param d Array de inteiros correspondentes aos dígitos do cpf.
     *
     * @returns Resultado da verificação de se cpf é ou não válido.
     */

    public static boolean cpf(final int d[]) {

        validarCpf(d);

        final int j = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
        final int k = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6] + 6 * d[7] + 7 * d[8] + 8 * d[9] + 9 * d[10];

        final int dj = ((j % 11) % 10);
        final int dk = ((k % 11) % 10);

        return dj == d[10];
    }

    /**
     * Função validadora de número de cpf. No entando, diferente da anterior, já que
     * utiliza uma estratégia similar a empregada na função horner().
     *
     * @param d Array de inteiros correspondentes aos dígitos do cpf.
     *
     * @returns Resultado da verificação de se cpf é ou não válido.
     */

    public static boolean cpf2(final int d[]) {

        validarCpf(d);

        int c = 8;
        int p = d[9];
        int s = d[9];

        while (1 <= c) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        final int j = ((s % 11) % 10);
        final int k = (((s - p + 9 * d[10]) % 11) % 10);

        return j == d[10];
    }
}
