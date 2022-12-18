package lr4;

public class Example3 {
    public static void main(String[] args) {

        int width = 5;
        int height = 10;

        char twoD[][] = new char [height][width];

        for (int i = 0; i<10; i++){
            for (int j = 0; j<5; j++)

                twoD[i][j] = '2';

        }

        for (int i = 0; i < 10; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");

            }
            System.out.println();
        }

    }
}
