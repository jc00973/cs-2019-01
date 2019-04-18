package ex3;

public class ex4 {

    public static int mod(int x, int y) {

        int s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
    }

    public static void main(String args[]) {
        System.out.println(mod(5, 5));
    }
}
