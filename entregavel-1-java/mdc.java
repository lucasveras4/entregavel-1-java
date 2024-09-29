package entregavel.pkg1.java;

public class mdc {

    public static void mdc(int a, int b) {
        if (a == 0) {
            System.out.println(b);
            return;
        }

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        mdc(12, 6);
    }
}
