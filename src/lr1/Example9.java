package lr1;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input current month: ");
        String month = in.nextLine();

        System.out.println("Input number of days in this month: ");
        Integer days = in.nextInt();

        System.out.println(month + " contains " + days + " days");
    }
}