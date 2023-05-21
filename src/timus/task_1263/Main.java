package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParties = scanner.nextInt();
        int numberOfPeople = scanner.nextInt();
        int[] numberOfPartiesArr = new int[numberOfParties];
        for (int i = 0; i < numberOfPeople; i++) {
            numberOfPartiesArr[scanner.nextInt() - 1] += 1;
        }
        for (int value : numberOfPartiesArr) {
            double result = 100 / ((double) numberOfPeople / value);
            System.out.printf("%.2f%%%n", result);
        }
    }
}