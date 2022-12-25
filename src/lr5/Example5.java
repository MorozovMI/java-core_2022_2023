package lr5;

public class Example5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.printValue();
        task5.printValue(25);
        task5.printValue(120);
    }
}
class Task5 {
    private int i;

    public Task5() {
        this.i = 0;
    }

    public Task5(int value) {
        this.i = value;
    }


    public void printValue(){
        System.out.println("Без аргумента value: " + CheckValue());
    }

    public void printValue(int newValue){
        System.out.println("С аргументом value: " + CheckValue(newValue));
    }

    private int CheckValue() {
        return check(i);
    }
    private int CheckValue(int i2) {
        this.i = i2;
        return check(i);
    }

    private int check (int value){
        if (i==0) {i = 0;
        } else if (i > 100) i= 100;
        return i;
    }
}