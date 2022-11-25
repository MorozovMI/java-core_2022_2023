package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input current day of the week: ");
        String week = in.nextLine();

        System.out.println("Input current month: ");
        String month = in.nextLine();

        System.out.println("Input current date: ");
        Integer date = in.nextInt();

        System.out.println("The current date is: " + week + " " + date + " " + month);
    }
}
