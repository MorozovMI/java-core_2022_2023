package lr6.Example1;

public class Example1 {

    char chars;
    String text;
    void test (char a){
        chars = a;
        System.out.println("Вызов метода test с символом " +chars);
    }
    void test (String b){
        text = b;
        System.out.println("Вызов метода test с текстом " +text);
    }
    void test (char [] CharArray){

         if (CharArray.length == 1){
             chars = CharArray[0];
             System.out.println("Вызов метода с массивом из одного символа " + chars);
        }

         else {
             text  = new String(CharArray);
                 System.out.println("Вызов метода с массивом текста " + chars);

         }
    }
}
