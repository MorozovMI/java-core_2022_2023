package lr7.Example5;

public class SuperClass {
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    SuperClass(String str1) {

        this.setStr1(str1);
    }

    public void PrintString() {
        String ClassName;
        ClassName =
                "__________________________________\n" +
                        "Наименование класса: " + this.getClass().getSimpleName() + "\n" +
                        "String: " + this.getStr1();
        System.out.println(ClassName);
    }

    public String getStr1() {
        return str1;
    }
}