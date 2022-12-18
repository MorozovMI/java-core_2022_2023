package lr4;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
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
                System.out.println("i = "+i+";j= "+j+";value= "+twoD[i][j]);
            }
        }
        System.out.println("генерация № строки/столбца");

        int numOfHeight = random.nextInt(a-1);
        int numOfWidth = random.nextInt(b-1);

        System.out.println("удалена строка № = "+(numOfHeight)+". Удален столбец №= "+(numOfWidth));
        System.out.println();

        int secondTwoD[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=numOfHeight){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != numOfWidth) {
                        secondTwoD[i][j] = twoD[s][k];
                        System.out.println("i = " + i + ";j= " + j + ";value= " + secondTwoD[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}

