package lr6.Example6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayInt = new int[3];
        arrayInt[0] = 2;
        arrayInt[1] = 10;
        arrayInt[2] = 32;

    int[] arrayIntResult1 = Main.getArray(arrayInt, 2);
        System.out.println(Arrays.toString(arrayIntResult1));

    int[] arrayIntResult2 = Main.getArray(arrayInt, 10);
        System.out.println(Arrays.toString(arrayIntResult2));
    }

    public static int[] getArray(int[] arrayInt, int value) {

        if (value >= arrayInt.length) {
            return arrayInt;
        }

        int[] arrayIntResult = new int[value];
        for (int i = 0; i < value; i++) {

            arrayIntResult[i] = arrayInt[i];
        }
        return arrayIntResult;
    }

}
