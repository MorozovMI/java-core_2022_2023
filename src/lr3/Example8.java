package lr3;

public class Example8 {

    public static void main(String[] args) {
    int size = 10;
    char chars[] = new char[size];
    char i = 'A';
    char mainLetterChars [] = {'A', 'E', 'I', 'O', 'U', 'Y'};
    for (int x = 0; x < chars.length; i++)
    {
        for (int y = 0; y < mainLetterChars.length; y++)
        {
            if (i == mainLetterChars[y]) {
                i++;
            }
        }
        chars[x] = i;
        System.out.println(chars[x]);
        x++;
    }
}
}


