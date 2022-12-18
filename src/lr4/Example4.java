package lr4;

public class Example4 {
        public static void main(String[] args) {
            int height = 10;
            char [][] twoD = new char [height][];
            for (int i = 0;i < twoD.length; i++){
                int j = i + 1;
                twoD[i]= new char [j];
            }
            for (int i = 0; i < height; i++){
                for (int j = 0; j < i + 1; j++){
                    twoD[i][j] = '+';
                }
            }
            for (int i =0; i < height; i++){
                for (int j = 0; j < twoD[i].length; j++){
                    System.out.print(twoD[i][j]+" ");
                }
                System.out.println();
            }
        }
}