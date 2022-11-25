package lr1;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {

        // Integer currentyear = 2022;


        Scanner in = new Scanner(System.in);

        System.out.println("Input the current year: ");
        Integer currentYear = in.nextInt();

        System.out.println("Input year of your birthday: ");

        Integer year = in.nextInt();
        Integer year1 = currentYear - year;

        System.out.println("Your age is: " + year1);
    }
}