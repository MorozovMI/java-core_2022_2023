package lr5;

public class Example3 {

    private int firstInt;
    private int secondInt;

    public Example3(){

    }

    public Example3(int one){
        this.firstInt =  one;
    }

    public Example3 (int one,int two){
        this.firstInt = one;
        this.secondInt = two;
    }


    public static void main(String[] args) {
        Example3 firstDes = new Example3();
        Example3 secondDes = new Example3(7);
        Example3 thirdDes = new Example3(1, 2);

        System.out.println();
        System.out.println("Первый конструктор = " + firstDes.firstInt + " Второй конструктор " + secondDes.firstInt
                 + " Третий конструктор " + thirdDes.firstInt + " " + thirdDes.secondInt);
    }



}
