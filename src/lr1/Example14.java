package lr1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Input the number: ");
        Integer number = in.nextInt();

        Integer lessNumber = number - 1;
        Integer moreNumber = number + 1;
        Integer sqrNumber  = lessNumber + moreNumber + number;
        Integer sqrNumber2 = sqrNumber * sqrNumber;


        System.out.println(lessNumber + "," + number + "," + moreNumber + "," + sqrNumber2);
    }
}