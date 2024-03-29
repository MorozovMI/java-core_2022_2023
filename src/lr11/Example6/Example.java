package lr11.Example6;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "null");
        map.put(1, "one11111");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five22222");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine33333");

        System.out.println("Строки, где ключ < 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() < 5) {
                System.out.println(entry.getValue());
            }
        }

        System.out.println("Строки, где ключ = 0:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                System.out.println(entry.getValue());
            }
        }

        System.out.println("Умножение всех ключей, где длина строки > 5:");
        int result = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                result *= entry.getKey();
            }
        }
        System.out.println(result);
    }
}
