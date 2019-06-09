/**
 * Implementação em Java dos 21 algoritmos propostos na aula 01.
 *
 * @author jc00973 - João Carlos Fonseca
 */

package com.github.jc00973.ufg.cs.aula01;

public final class AlgoritmosEmJava {

    private AlgoritmosEmJava() { };

    /**
     * Verifica se o parâmetro é um número que apresenta a
     * propriedade 3025.
     *
     * @param n O número que será verificado.
     * @return O resultado da verificação.
     */

    public static boolean propriedade3025(final int n) {

        final int valorMaxParam3025 = 9999;

        ExceptionUtils.validarParametro(n, 0, valorMaxParam3025);

        final int i = n / 100;
        final int j = n % 100;

        return Math.pow(i + j, 2) == n;
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
        final double epsilon = 0.01;

        ExceptionUtils.validarParametro(n, valorMinParam153, valorMaxParam153);

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        final double x = Math.pow(c, valorExpoente);
        final double y = Math.pow(d, valorExpoente);
        final double z = Math.pow(u, valorExpoente);

        return Math.abs(x + y + z - n) < epsilon;
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

        ExceptionUtils.validarParametro(d, valorMinDia, valorMaxDia);
        ExceptionUtils.validarParametro(m, valorMinMes, valorMaxMes);
        ExceptionUtils.validarParametroMin(a, valorMinAno);

        final int dia = d;
        int mes = m;
        int ano = a;

        if ((mes == 1 || mes == 2) && ano > 0) {
            mes = mes + valorMaxMes;
            ano--;
        }

        final int aux1 = 1;
        final int aux2 = 2;
        final int aux3 = 3;
        final int aux4 = 4;
        final int aux5 = 5;
        final int aux7 = 7;
        final int aux8 = 100;
        final int aux9 = 400;

        final int s = dia + aux2 * mes + (aux3 * (mes + aux1)) / aux5 + ano + ano / aux4 - ano / aux8 + ano / aux9;

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

        ExceptionUtils.validarParametroMin(x, 0);
        ExceptionUtils.validarParametroMin(y, 0);

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

        ExceptionUtils.validarParametroMin(n, 1);

        int i = 2;
        int s = 1;

        while (i <= n && s >= 0) {
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

        ExceptionUtils.validarParametroMin(n, 1);

        int i = 2;
        int f = 1;

        while (i <= n && f >= 1) {
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

        ExceptionUtils.validarParametroMin(a, 0);
        ExceptionUtils.validarParametroMin(b, 0);

        int totalParcelas = a;
        int parcela = b;

        if (b < a && totalParcelas >= 0 && parcela >= 0) {
            totalParcelas = b;
            parcela = a;
        }

        int i = 1;
        int s = 0;

        while (i <= totalParcelas && parcela >= 0 && s >= 0) {
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

        ExceptionUtils.validarParametroMin(x, 0);
        ExceptionUtils.validarParametroMin(y, 0);

        int potencia = 1;
        int i = 1;

        while (i <= y && potencia >= 0) {
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

        ExceptionUtils.validarParametroMin(n, 1);

        double i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        final int numLeibniz = 4;

        while (i <= n && s >= -1 && d >= -1 && p >= 0 && numLeibniz >= 0) {
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

        ExceptionUtils.validarParametroMinDouble(n, 1);
        ExceptionUtils.validarParametroMinDouble(k, 2);

        double i = 2;
        double e = 1 + n;
        double numerador = n;
        double denominador = 1;

        while (i <= k && e >= 0 && numerador >= 0 && denominador >= 0) {
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

        ExceptionUtils.validarParametroMin(x, 0);
        ExceptionUtils.validarParametroMin(y, x + 1);
        ExceptionUtils.validarParametroMin(k, 1);

        double c = y;
        double a = x;
        double i = 1;
        double t = 0;

        while (i <= k && i >= 0 && t >= 0) {
            t = c;
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

        ExceptionUtils.validarParametroMin(n, 1);

        int i = 1;
        int s = 1;

        while (s < n && i >= 0) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
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

        ExceptionUtils.validarParametroMinDouble(n, 1);

        double r = 1;
        double qtdRepeticao = i;

        while (0 <= qtdRepeticao && r >= 0) {
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

        ExceptionUtils.validarParametroMin(n, 2);

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

        ExceptionUtils.validarParametroMin(n, 2);
        ExceptionUtils.validarVetorCrivo(a, n);

        int[] vetor = new int[a.length];
        int i = 2;
        final double limite = Math.floor(Math.sqrt(n));

        for (int j = 0; j < a.length && vetor[j] == a[j]; j++) {
            System.arraycopy(a, 0, vetor, 0, a.length);
        }

        while (i <= limite) {
            if (vetor[i] == 0) {

                int multiplo = i + i;

                while (multiplo <= n && vetor[multiplo] == a[multiplo]) {
                    vetor[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }

            i = i + 1;
        }

        return vetor[n] == 0;
    }

    /**
     * Função para identificar o maior divisor comum entre dois inteiros.
     *
     * @param a Primeiro inteiro.
     * @param b Segundo inteiro.
     * @return maior divisor comum entre os dois inteiros informados.
     */

    public static double mdc(final double a, final double b) {

        ExceptionUtils.validarParametroMinDouble(b, 1);
        ExceptionUtils.validarParametroMinDouble(a, b);

        double numerador = a;
        double denominador = b;
        double m = 0;

        while (denominador != 0 && m >= 0) {
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

        ExceptionUtils.validarParametroMin(b, 1);
        ExceptionUtils.validarParametroMin(a, b);

        double numerador = a;
        double denominador = b;
        final double epsilon = 0.01;

        while (Math.abs(numerador - denominador) > epsilon) {
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

        ExceptionUtils.validarParametroMin(g, 1);

        double p = a[g];
        int i = g - 1;

        while (0 <= i && p >= 0) {
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

        ExceptionUtils.validarParametroMin(n, 0);

        int posicaoDesejada = n;

        if (posicaoDesejada == 0 || posicaoDesejada == 1) {
            return n;
        }

        posicaoDesejada++;

        int i = 2;
        int t = 0;
        int a = 0;
        int c = 1;

        while (i <= posicaoDesejada && t >= 0 && a >= 0) {
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

        ExceptionUtils.validarCpf(d);
        ExceptionUtils.validarDigitosCpf(d);

        final int j = d[digito1] + digito2 * d[digito2] + digito3 * d[digito3] + digito4 * d[digito4] + digito5
                * d[digito5] + digito6 * d[digito6] + digito7 * d[digito7] + digito8 * d[digito8] + digito9
                * d[digito9];

        final int dj = (j % digito11) % digito10;

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

        ExceptionUtils.validarCpf(d);
        ExceptionUtils.validarDigitosCpf(d);

        int c = digito8;
        int p = d[digito9];
        int s = d[digito9];

        while (1 <= c && p >= 0 && s >= 0) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        final int j = (s % digito11) % digito10;

        return j == d[digito10];
    }
}
