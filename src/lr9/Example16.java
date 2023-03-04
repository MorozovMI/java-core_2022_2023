package lr9;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        try {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Random random = new Random();
            System.out.println(" Сколько строк нужно для матрицы? ");
            int high = scanner1.nextInt();
            System.out.println(" Сколько столбцов нужно для матрицы? ");
            int width = scanner1.nextInt();
            int newArray[] [] = new int[high][width];
            int i;
            int j;
            System.out.println(" Матрица, указанного размера будет заполнена случайными числами. ");
            for ( i = 0; i < high; i++){
                for(j = 0; j < width; j++){
                    newArray[i][j] = random.nextInt(500);
                    System.out.print(newArray[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println( " Какой столбец нужно показать? ");
            int k = scanner2.nextInt();
            for(i = 0; i < high; i++){
                System.out.println(newArray[i][k]);
            }
        } catch (InputMismatchException a) {
            System.out.println(" ОШИБКА! Несоответствующий тип вводных данных!");
        } catch (ArrayIndexOutOfBoundsException b ){
            System.out.println("ОШИБКА! Несуществующий столбец!");
        }
    }
}