package timus.task_1327;
import java.util.Scanner;
public class task_1327 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();
                int result = 0;
                if (a % 2 == 0 && b % 2 == 0){
                    result = (b - a) / 2;
                } else {
                    result = (b - a) / 2 + 1;
                }
                System.out.print(result);
    }
}
