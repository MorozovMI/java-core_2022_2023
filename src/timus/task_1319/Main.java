package timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int n = InCMD.nextInt();
        int[][] arr = new int[n][n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i - j][j] = k;
                k++;
            }
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i <= n - 1 - j; i++) {
                arr[n-1-i][j+i] = k;
                k++;
            }
        }
        for (int i=0; i<n; i++) {
            for(int j=n-1; j>=0; j--) {
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }
    }
}