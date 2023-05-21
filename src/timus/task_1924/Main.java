package timus.task_1924;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        long n = InCMD.nextLong();
        if (n%4 == 1 || n%4 == 2) {
            System.out.print("grimy\n");
        } else {
            System.out.print("black\n");
        }
    }
}