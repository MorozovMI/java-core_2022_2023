package lr3;
import java.util.Random;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива"); // Сообщение пользователю "для красоты и понимания"
        int Size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        System.out.println("Размер массива равен " + Size); // Сообщение пользователю "для красоты и понимания"
        int[] nums = new int[Size]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }

        int[] min_count = new int[Size]; // создание массива для отслеживания индекса
        int[] min_nums = new int[Size]; // создание массива для отслеживания повторяющегося минимального значения
        int min = nums[0]; // создание переменной с минимальным значением
        for (int l = 0; l < 2; l++) { // расчет минимальных значений
            for (int j = 0; j < nums.length; j++) {
                if (min >= nums[j]) {
                    min_count[j] = j;
                    min = nums[j];
                    min_nums[j] = nums[j];
                } else {
                    min_count[j] = 0;
                    min_nums[j] = 0;
                }
            }
        }
        for (int k = 0; k < nums.length; k++) { // Вывод итогового сообщения
            if (min_nums[k] == min && min_count[k] != 0) {
                System.out.println("Элемент массива [" + min_count[k] + "] " + min_nums[k] + " - минимальное значение");
            }
        }
    }
}
