package lr3;

import java.util.Random;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива"); // Сообщение пользователю "для красоты и понимания"
        int Size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        //значения введенного в консоль
        System.out.println("Размер массива равен " + Size); // Сообщение пользователю "для красоты и понимания"
        int[] nums = new int[Size]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }
        for (int i = nums.length - 1; i >= 0; i--) { // Сортировка массива по убыванию его элементов
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int sort = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = sort;
                }
            }
        }
        System.out.println("Произведена сортировка массива"); // Сообщение пользователю "для красоты и понимания"
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива [" + i + "] после сортировки =" + nums[i]); //Сообщение пользователю для красоты и понимания
        }
    }
}