package java;

public class AlgoritmosEmJava {

    public static boolean propriedade3025(int n) {

        int i = n / 100;
        int j = n % 100;

        return Math.pow((i + j), 2) == n;
    }

    public static boolean propriedade153(int n) {

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

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = (d + 2 * m + (3 * (m + 1)) / 5 + a + a / 4 - a / 100 + a / 400);

        return s % 7;
    }

    public static int mod(int x, int y) {

        int s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
    }

    public static int soma(int n) {

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    public static int fatorial(int n) {

        int i = 2;
        int f = 1;

        while(i<=n) {
            f = f*i;
            i = i+1;
        }

        return f;
    }

    public static int produto(int a, int b) {

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

        int potencia = 1;
        int i = 1;

        while (i <= y) {
            potencia = produto(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    public static double pi(int n) {
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

        int i = 1;
        int s = 1;

        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return (s == n);
    }

    public static double raiz(double n, double i) {

        double r = 1;

        while (0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    public static boolean primo(int n) {

        double i = 2;

        while (i < n) {
            if (n % i == 0) {
                return false;
            }

            i = i + 1;
        }

        return true;
    }

    public static void crivoEratostenes(int a[], int n) {

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
    }

    public static double mdc(double a, double b) {

        while (b != 0) {
            double m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

    public static double mdc2(int a, int b) {

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    public static double horner(int x, int g, int a[]) {

        double p = a[g];
        int i = g - 1;

        while (0 <= i) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    public static int fibonacci(int n) {

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
        int j = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
        int k = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6] + 6 * d[7] + 7 * d[8] + 8 * d[9] + 9 * d[10];

        int dj = ((j % 11) % 10);
        int dk = ((k % 11) % 10);

        return (dj == d[10] && dk == d[11]);
    }

    public static boolean cpf2(int d[]) {

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
