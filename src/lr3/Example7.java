package lr3;
import java.util.Arrays;
public class Example7 {

    public static void main(String[] args) {

        int size = 10;
        char array[] = new char[size];
        char c = 'a';


        for (int i = 0; i < array.length; i++) {
            array[i] = c;
            c += 2;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}