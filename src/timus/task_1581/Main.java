package timus.task_1581;
import java.util.Scanner;

public class Main {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] ints = new int[n];

            for (int i = 0; i < ints.length; i++) {
                ints[i] = scanner.nextInt();
            }

            int number = ints[0], count = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] != number) {
                    number = ints[i];
                    System.out.print(count + " " + ints[i - 1] + " ");
                    count = 1;
                } else count ++;
            }
            System.out.print(count + " " + ints[ints.length - 1] + " ");

        }
    }
}
