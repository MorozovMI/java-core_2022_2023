package lr7.Example2;

public class Main {
    public static void main(String[] args) {
        SuperClassTest Test0 = new SuperClassTest();
        System.out.println(Test0);

        SuperClassTest Test1 = new SuperClassTest("Тест");
        System.out.println(Test1);

        SuperClassTest Test2 = new SubClassTest();
        System.out.println(Test2);

        SuperClassTest Test3 = new SubClassTest("Тест2");
        System.out.println(Test3);

        SuperClassTest Test4 = new SubClassTest(888);
        System.out.println(Test4);

        SuperClassTest Test5 = new SubClassTest("Тест3", 777);
        System.out.println(Test5);
    }
}
