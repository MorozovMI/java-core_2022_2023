package lr3;
import java.util.Scanner;
import java.util.Random;

public class Example5_for {

    public static void main(String[] args) {

        System.out.println("Введите количество чисел в сумме");
        Scanner in = new Scanner(System.in);
        int Numbers = in.nextInt();
        Random random = new Random();

        int sum = 0;
        for (int i = 0; Numbers > 0; i++)


        { int nums = random.nextInt(1000);
            if (nums % 5 == 2 || i % 3 == 1) {
                System.out.println(nums + " ");
                sum = sum + nums;
                Numbers--;
            }

        }

        System.out.printf("Cумма чисел: %d", sum);

    }
}