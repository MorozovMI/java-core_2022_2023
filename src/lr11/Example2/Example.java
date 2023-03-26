package lr11.Example2;

import java.util.Scanner;

public class Example {
    public static int binary (int n) {
        if (n==0) {
            return 0;
        } else {
            return (n%2+10 * binary(n/2));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = in.nextInt();

        System.out.println("Число " + n +
                " в двоичной системе счисления равно: "  + binary(n));
    }
}
