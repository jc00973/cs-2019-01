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
     * @param parametro   O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
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
     * @param parametro   O parâmetro que será validado.
     * @param valorMinimo O valor mínimo válido para o parâmetro.
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
     * @throws {IllegalArgumentException} Caso o parâmetro esteja fora do intervalo válido definido.
     */

    public static void validarCpf(final int[] cpf) {

        final int ultimaPosicaoCpf = 12;
        final int digitoMaxCpf = 9;

        if (cpf == null) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor é nulo.");
        }

        if (cpf.length != ultimaPosicaoCpf) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor não tem 11 dígitos.");
        }

        int i = 0;

        while (i < ultimaPosicaoCpf) {
            if (cpf[i] < 0 || cpf[i] > digitoMaxCpf) {
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
     * @return O resultado da verificação.
     */

    public static boolean propriedade3025(final int n) {

        final int valorMaxParam3025 = 9999;

        validarParametro(n, 0, valorMaxParam3025);

        final int i = n / 100;
        final int j = n % 100;

        return Math.pow((i + j), 2) == n;
    }

    /**
     * Verifica se o parâmetro é um número que apresenta a
     * propriedade 153.
     *
     * @param n O número que será verificado.
     * @return resultado da verificação.
     */

    public static boolean propriedade153(final int n) {

        final int valorMinParam153 = 100;
        final int valorMaxParam153 = 999;
        final int valorExpoente = 3;

        validarParametro(n, valorMinParam153, valorMaxParam153);

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        final double x = Math.pow(c, valorExpoente);
        final double y = Math.pow(d, valorExpoente);
        final double z = Math.pow(u, valorExpoente);

        return (x + y + z) == n;
    }

    /**
     * Verifica o dia da semana referente a data informada.
     *
     * @param d Dia da data.
     * @param m Mês da data.
     * @param a Ano da data.
     * @return número correspondente ao dia
     * da semana da data, entre 0 e 6. O valor retornado é 0 para
     * segunda-feira, 1 para terça-feira e assim sucessivamente.
     */

    public static double diaDaSemana(final int d, final int m, final int a) {

        final int valorMinDia = 1;
        final int valorMaxDia = 31;
        final int valorMinMes = 1;
        final int valorMaxMes = 12;
        final int valorMinAno = 1753;

        validarParametro(d, valorMinDia, valorMaxDia);
        validarParametro(m, valorMinMes, valorMaxMes);
        validarParametroMin(a, valorMinAno);

        int dia = d;
        int mes = m;
        int ano = a;

        if (mes == 1 || mes == 2) {
            mes = mes + valorMaxMes;
            ano = ano - 1;
        }

        final int aux1 = 1;
        final int aux2 = 2;
        final int aux3 = 3;
        final int aux4 = 4;
        final int aux5 = 5;
        final int aux6 = 6;
        final int aux7 = 7;
        final int aux8 = 100;
        final int aux9 = 400;

        final int s = (dia + aux2 * mes + (aux3 * (mes + aux1)) / aux5 + ano + ano / aux4 - ano / aux8 + ano / aux9);

        return s % aux7;
    }

    /**
     * A função calcula o resto inteiro da divisão (mod) entre os parâmetros.
     *
     * @param x Numerador da divisão.
     * @param y Denominador da divisão.
     * @return valor do mod.
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
     * @return valor do somatório.
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
     * @return fatorial do parâmetro.
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
     * @return produto da operação.
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
     * @return Potência.
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
     * @return Estimativa do valor de pi.
     */

    public static double pi(final int n) {

        validarParametroMin(n, 1);

        double i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        final int numLeibniz = 4;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + numLeibniz * s / d;
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
     * @return Valor aproximado do logaritmo natural por n.
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
     * @return A estimativa do valor da razão áurea.
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
     * @return Resposta para se o número é ou não um quadrado perfeito.
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
     * @return Raíz quadrada de n.
     */

    public static double raiz(final double n, final double i) {

        validarParametroMinDouble(n, 1);

        double r = 1;
        double qtdRepeticao = i;

        while (0 <= qtdRepeticao) {
            r = (r + n / r) / 2;
            qtdRepeticao = qtdRepeticao - 1;
        }

        return r;
    }

    /**
     * A função verifica de n é um número primo.
     *
     * @param n Número que deseja-se saber se é primo.
     * @return Resultado da verificação sobre o n ser ou não um número primo.
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
     *          ser maior ou igual ao parâmetro n.
     * @param n Número o qual deseja-se saber se é primo ou não.
     * @return Resultado da verificação sobre o n ser ou não um número primo.
     */

    public static boolean crivoEratostenes(final int[] a, final int n) {

        validarParametroMin(n, 2);
        validarVetorCrivo(a, n);

        int[] vetor = a;
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
     * @return maior divisor comum entre os dois inteiros informados.
     */

    public static double mdc(final double a, final double b) {

        validarParametroMinDouble(b, 1);
        validarParametroMinDouble(a, b);

        double numerador = a;
        double denominador = b;
        double m = 0;

        while (denominador != 0) {
            m = numerador % denominador;
            numerador = denominador;
            denominador = m;
        }

        return numerador;
    }

    /**
     * Função para identificar o maior divisor comum entre dois inteiros, assim como a
     * função anterior. No entanto, este algoritmo limita-se ao uso de subtrações para
     * calcular o resultado.
     *
     * @param a Primeiro inteiro.
     * @param b Segundo inteiro.
     * @return maior divisor comum entre os dois inteiros informados.
     */

    public static double mdc2(final int a, final int b) {

        validarParametroMin(b, 1);
        validarParametroMin(a, b);

        double numerador = a;
        double denominador = b;

        while (numerador != denominador) {
            if (numerador > denominador) {
                numerador = numerador - denominador;
            } else {
                denominador = denominador - numerador;
            }
        }

        return numerador;
    }

    /**
     * A função realiza a avaliação de um polinômio para um valor especifco de x.
     *
     * @param x Valor x do polinômio.
     * @param g Quantidade de elementos a do polinômio.
     * @param a Array com os elementos a do polinômio.
     * @return resultado do polinômio.
     */

    public static double horner(final int x, final int g, final int[] a) {

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
     *          sequência de Fibonacci.
     * @return n-ésimo número de Fibonacci.
     */

    public static int fibonacci(final int n) {

        validarParametroMin(n, 0);

        int posicaoDesejada = n;
        int a = 0;
        int c = 1;

        if ((posicaoDesejada == 0) || (posicaoDesejada == 1)) {
            return n;
        }

        posicaoDesejada++;

        int i = 2;
        int t = 0;

        while (i <= posicaoDesejada) {
            t = c;
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
     * @return Resultado da verificação de se cpf é ou não válido.
     */

    public static boolean cpf(final int[] d) {

        final int digito1 = 1;
        final int digito2 = 2;
        final int digito3 = 3;
        final int digito4 = 4;
        final int digito5 = 5;
        final int digito6 = 6;
        final int digito7 = 7;
        final int digito8 = 8;
        final int digito9 = 9;
        final int digito10 = 10;
        final int digito11 = 11;

        validarCpf(d);

        final int j = d[digito1] + digito2 * d[digito2] + digito3 * d[digito3] + digito4 * d[digito4] + digito5
                * d[digito5] + digito6 * d[digito6] + digito7 * d[digito7] + digito8 * d[digito8] + digito9
                * d[digito9];

        final int k = d[digito2] + digito2 * d[digito3] + digito3 * d[digito4] + digito4 * d[digito5] + digito5
                * d[digito6] + digito6 * d[digito7] + digito7 * d[digito8] + digito8 * d[digito9] + digito9
                * d[digito10];

        final int dj = ((j % digito11) % digito10);
        final int dk = ((k % digito11) % digito10);

        return dj == d[digito10];
    }

    /**
     * Função validadora de número de cpf. No entando, diferente da anterior, já que
     * utiliza uma estratégia similar a empregada na função horner().
     *
     * @param d Array de inteiros correspondentes aos dígitos do cpf.
     * @return Resultado da verificação de se cpf é ou não válido.
     */

    public static boolean cpf2(final int[] d) {

        final int digito8 = 8;
        final int digito9 = 9;
        final int digito10 = 10;
        final int digito11 = 11;

        validarCpf(d);

        int c = digito8;
        int p = d[digito9];
        int s = d[digito9];

        while (1 <= c) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        final int j = ((s % digito11) % digito10);
        final int k = (((s - p + digito9 * d[digito10]) % digito11) % digito10);

        return j == d[digito10];
    }
}
