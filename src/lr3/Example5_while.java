package lr3;

import java.util.Scanner;
import java.util.Random;

public class Example5_while {

    public static void main(String[] args) {

        System.out.println("Введите количество чисел в сумме");
        Scanner in = new Scanner(System.in);
        int Numbers = in.nextInt();
        Random random = new Random();
        int sum = 0;

        int x1 = Numbers;


        while(x1>0) {

            int nums = random.nextInt(1000);
            if (nums % 5 == 2 || nums % 3 == 1) {

                System.out.println(nums + " ");
                sum = sum + nums;
                x1--;
            }


        }
        System.out.println("Cумма чисел:" + sum);


    }
}


