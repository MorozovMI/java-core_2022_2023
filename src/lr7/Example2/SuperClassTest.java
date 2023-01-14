package lr7.Example2;

public class SuperClassTest {

    private String str1;

    SuperClassTest() {setStr1();}
    SuperClassTest (String str1){setStr1(str1);}
    public void setStr1 (){
        this.str1 = "Конструктор без параметра>";
    }
    public void setStr1 (String str1){
        this.str1 = str1;
    }
    public String getStr1(){
        return str1;
    }
    public int getStringLength(){
        if(null == this.str1){
            return 0;
        }
        return this.str1.length();
    }
    @Override
    public String toString() {
        String SuperClassName = "________________________________________\n" +
                "super" + "\n" +
                "Строка =" + getStr1() +  "\n" +
                "Длина строки = " +getStringLength();
        return SuperClassName;
    }
}
