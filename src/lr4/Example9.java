package lr4;
import java.util.Scanner;
public class Example9 {
    private static class Caeser {
        static char alphabet[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        static String encryptText;

        private static String encrypt(String enText, int key) {
            char[] ArrayText = enText.toCharArray();
            char[] CharCode = new char[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (ArrayText[i] == alphabet[j]) {
                        CharCode[i] = alphabet[(j + key) % 33];
                    } else if (CharCode[i] == 0) {
                        CharCode[i] = '*';
                    }
                }

            }
            for (int i = 0; i < ArrayText.length; i++) {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }

        private static String decrypt(String enText, int key) {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (ArrayText[i] == alphabet[j]) {
                        CharCode[i] = alphabet[(j - key) % 33];
                    } else if (CharCode[i] == '*') {
                        CharCode[i] = '*';
                    }
                }
            }
            for (int i = 0; i < ArrayText.length; i++) {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();
        System.out.print("Введите ключ: ");
        int shift = id.nextInt();
        String encryptStr = Caeser.encrypt(text.toLowerCase(), shift);

        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");
        System.out.print("\nВыполнить обратное преобразование? (y/n)");
        boolean cool = false;
        while (!cool) {
            String reply = id.next();
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, shift);
                System.out.println(decryptStr);
                cool = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }
}

