package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        try {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите какого размера массив нужен: ");
            int l = scanner1.nextInt();
            int newArray[] = new int[l];
            for (int i = 0; i < newArray.length; i++){
                newArray[i] = scanner2.nextInt();
                System.out.print("[" +i+"] " + newArray[i] + " ");
            }
            System.out.println();
            int counter = 0;
            int num = 0;
            for (int i = 0; i < newArray.length; i++){
                if (newArray[i] > 0 ){
                    num++;
                    counter = counter + newArray[i];
                }
            }
            int srednee = counter/num;
            System.out.println(" Среднее значение среди положительных элементов массива: " + srednee);
            System.out.println(" Значение какой ячейки нужно показать? ");
            int j = scanner2.nextInt();
            System.out.println(newArray[j]);
        }
        catch (ArithmeticException g ){
            System.out.println(" ОШИБКА! В массиве нет положительных чисел, происходит деление на 0 при вычислении среднего значения ");
        }
        catch (InputMismatchException e) {
            System.out.println(" ОШИБКА! Используйте целые числа типа int: " +
                    "1) положительные целые числа для размера массива; " +
                    "2) числа типа int для заполнения массива ");
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(" ОШИБКА! Обращение к несуществующей ячейке ");
        }
    }
}

