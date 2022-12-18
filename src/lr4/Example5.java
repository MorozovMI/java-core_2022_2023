package lr4;
import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a = id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int twoD[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                twoD[i][j] = random.nextInt(200);
                System.out.println("i = "+i+"; j= "+j+"; value= "+twoD[i][j]);
            }
        }
        System.out.println("Перестановка");

        int twoD2[][] = new int[b][a];
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                twoD2[i][j] = twoD[j][i];
                System.out.println("i = "+i+";j= "+j+";value= "+twoD2[i][j]);
            }
        }
    }
}
