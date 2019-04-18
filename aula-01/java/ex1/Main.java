package ex1;

public class Main {

    public static boolean propriedade3025(int n) {

        int i = n / 100;
        int j = n % 100;

        if (Math.pow((i + j), 2) == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String arg[]) {

        propriedade3025(1);
    }
}
