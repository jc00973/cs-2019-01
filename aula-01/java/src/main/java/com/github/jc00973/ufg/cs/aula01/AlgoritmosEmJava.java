package com.github.jc00973.ufg.cs.aula01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;


/**
 *
 * @author João Carlos Fonseca
 */

public final class AlgoritmosEmJava {

    private AlgoritmosEmJava() {};

    public static void validarParametroMin(int parametro, int valorMinimo) {

        if (parametro < valorMinimo) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
        }

    }

    public static void validarParametroMinDouble(double parametro, double valorMinimo) {

        if (parametro < valorMinimo) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
        }

    }

    public static void validarParametro(int parametro, int valorMinimo, int valorMaximo) {

        if (parametro < valorMinimo || parametro > valorMaximo) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
        }

    }

    public static void validarVetorCrivo(int vetor[], int n){

        int i = 2;

        while(i <= n){
            if(vetor[i] == 0){
                i++;
            }else{
                throw new IllegalArgumentException("Parâmetro inválido. O vetor informado não atende aos requisitos exigidos.");
            }
        }
    }

    public static void validarCpf(int cpf[]) {
        if (cpf == null) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor é nulo.");
        }

        if (cpf.length != 12) {
            throw new IllegalArgumentException("Parâmetro inválido. O valor não tem 11 dígitos.");
        }

        int i = 0;

        while(i < 11){
            if (cpf[i] < 0 || cpf[i] > 9) {
                throw new IllegalArgumentException("Parâmetro inválido. O valor está fora do intervalo válido.");
            }

            i++;
        }
    }

    public static boolean propriedade3025(int n) {

        validarParametro(n, 0, 9999);

        int i = n / 100;
        int j = n % 100;

        return Math.pow((i + j), 2) == n;
    }

    public static boolean propriedade153(int n) {

        validarParametro(n, 100, 999);

        int c = n / 100;
        int du = n % 100;
        int d = du / 10;
        int u = du % 10;

        double x = Math.pow(c, 3);
        double y = Math.pow(d, 3);
        double z = Math.pow(u, 3);

        return (x + y + z) == n;
    }

    public static double diaDaSemana(int d, int m, int a) {

        validarParametro(d, 1, 31);
        validarParametro(m, 1, 12);
        validarParametroMin(a, 1753);

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = (d + 2 * m + (3 * (m + 1)) / 5 + a + a / 4 - a / 100 + a / 400);

        return s % 7;
    }

    public static int mod(int x, int y) {

        validarParametroMin(x, 0);
        validarParametroMin(y, 0);

        int s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
    }

    public static int soma(int n) {

        validarParametroMin(n, 1);

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    public static int fatorial(int n) {

        validarParametroMin(n, 1);

        int i = 2;
        int f = 1;

        while(i<=n) {
            f = f*i;
            i = i+1;
        }

        return f;
    }

    public static int produto(int a, int b) {

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

    public static int potencia(int x, int y) {

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

    public static double pi(int n) {

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

    public static float logaritmoNatural(int n, int k) {

        validarParametroMin(n, 1);
        validarParametroMin(k, 2);

        float i = 2;
        float e = 1 + n;
        float numerador = n;
        float denominador = 1;

        while (i <= k) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;

    }

    public static double razaoAurea(int x, int y, int k) {

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

    public static boolean quadradoPerfeito(int n) {

        validarParametroMin(n, 1);

        int i = 1;
        int s = 1;

        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return (s == n);
    }

    public static double raiz(double n, double i) {

        validarParametroMinDouble(n, 1);

        double r = 1;

        while (0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    public static boolean primo(int n) {

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

    public static boolean crivoEratostenes(int a[], int n) {

        validarParametroMin(n, 2);
        validarVetorCrivo(a, n);

        int i = 2;
        double limite = Math.floor(Math.sqrt(n));

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

    public static double mdc(double a, double b) {

        validarParametroMinDouble(b, 1);
        validarParametroMinDouble(a, b);

        while (b != 0) {
            double m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

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

    public static double horner(int x, int g, int a[]) {

        validarParametroMin(g, 1);

        double p = a[g];
        int i = g - 1;

        while (0 <= i) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    public static int fibonacci(int n) {

        validarParametroMin(n, 0);

        n++;
        int a = 0;
        int c = 1;

        if ((n == 0) || (n == 1)) {
            return n;
        }

        int i = 2;

        while (i <= n) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }

    public static boolean cpf(int d[]) {

        validarCpf(d);

        int j = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
        int k = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6] + 6 * d[7] + 7 * d[8] + 8 * d[9] + 9 * d[10];

        int dj = ((j % 11) % 10);
        int dk = ((k % 11) % 10);

        return (dj == d[10] && dk == d[11]);
    }

    public static boolean cpf2(int d[]) {

        validarCpf(d);

        int c = 8;
        int p = d[9];
        int s = d[9];

        while (1 <= c) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        int j = ((s % 11) % 10);
        int k = (((s - p + 9 * d[10]) % 11) % 10);

        return j == d[10] && k == d[11];
    }
}
