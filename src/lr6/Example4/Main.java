package lr6.Example4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Введите число для вычисления двойного факториала: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int factorialRec = Example4.getFactorialRec(a);
        System.out.println("Факториал равен (вычисление c рекурсией): " + factorialRec);

        int factorialFor = Example4.getFactorialFor(a);
        System.out.println("Факториал равен (вычисление без рекурсии): " + factorialFor);
    }
}
