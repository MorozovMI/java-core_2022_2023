package lr1;

import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input the current year: ");
        Integer currentYear = in.nextInt();

        System.out.println("Input year of your birthday: ");
        Integer year = in.nextInt();
        Integer year1 = currentYear - year;

        System.out.println("Your age is: " + year1 + "." + "Your name is: " + name);
    }
}