package lr1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        Integer year = in.nextInt();

        System.out.println("Input the current year: ");
        Integer currentYear = in.nextInt();

        Integer year1 = currentYear - year;

        System.out.println("Year of your birthday is: " + year1);
    }
}