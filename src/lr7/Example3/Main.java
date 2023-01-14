package lr7.Example3;

public class Main {
    public static void main(String[] args) {
        SuperClassTest Test1 = new SuperClassTest(1);
        System.out.println (Test1.toString());

        SubClassTest Test2 = new SubClassTest(2,'M');
        System.out.println (Test2.toString());

        SubSubClassTest Test3 = new SubSubClassTest(3,'M',"MMMM");
        System.out.println (Test3.toString());
    }
}
