package lr7.Example3;

public class SubSubClassTest extends SubClassTest {
    public String str2;

    public SubSubClassTest(int int2,char chnum1,String strnum2) {
        super(int2,chnum1);
        this.str2=strnum2;

    }

    @Override
    public String toString() {
        return "subSubClassTeset" +
                "str1: " + ch1 + '\'' +
                ",str2: '" + str2 + '\'' +
                ",int1:" + int1;
    }
}