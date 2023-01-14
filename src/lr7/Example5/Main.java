package lr7.Example5;

public class Main {
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass("Тест SuperClass");
        superClass.PrintString();

        SubClass subClass = new SubClass ("Тест SubClass", 777);
        subClass.PrintString();

        SubSubClass subsubClass = new SubSubClass("Тест SubSubClass", 'M');
        subsubClass.PrintString();

        SuperClass superClassOutsubclass = new SuperClass(subClass.getStr1());
        superClassOutsubclass.PrintString();

        SuperClass superClassOutsubsubclass = new SuperClass(subsubClass.str1);
        superClassOutsubsubclass.PrintString();
    }
}