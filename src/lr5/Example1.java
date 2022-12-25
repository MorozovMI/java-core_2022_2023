package lr5;
import java.util.Scanner;
public class Example1 {
    private char ch1;
    public void firstMethod (char test1) {

       this.ch1 = test1;
    }
    public int getCodeSymbol(){
        return ch1;
    }
    public void symAndCode() {
        System.out.println("Символ = " + ch1);
        int code = ch1;
        System.out.println("Код символа = " + code);

    }

    public static void main(String[] args) {

        Example1 example1 = new Example1();
        example1.symAndCode();
        example1.firstMethod('M');
        System.out.println("Код символа = " + example1.getCodeSymbol());
        example1.symAndCode();

    }

}
