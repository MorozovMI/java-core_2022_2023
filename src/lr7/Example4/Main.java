package lr7.Example4;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClass = new SuperClassTest('b');
        System.out.println(superClass.toString());
        System.out.println("________________________________________\n");

        SuperClassTest superClassCopy = new SuperClassTest(superClass);
        System.out.println("Копия: " + "\n" + superClassCopy.toString());
        System.out.println("________________________________________\n");

        SubClassTest subClass = new SubClassTest('A',"test string");
        System.out.println(subClass.toString());
        System.out.println("________________________________________\n");

        SubClassTest subClassCopy = new SubClassTest(subClass);
        System.out.println("Копия: " + "\n" + subClassCopy.toString());
        System.out.println("________________________________________\n");

        SubSubClassTest subsubClass = new SubSubClassTest('C',"TEXT",777);
        System.out.println(subsubClass.toString());
        System.out.println("________________________________________\n");


        SubSubClassTest subsubClassCopy = new SubSubClassTest(subsubClass);
        System.out.println("Копия: " + "\n" + subsubClassCopy.toString());
        System.out.println("________________________________________\n");
    }
}
