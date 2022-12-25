package lr5;

    public class Example2 {

        private char symbol1 = 'x';
        private char symbol2 = 'b';

        public void getSymbols()
        {
            int begin = symbol1;
            int end = symbol2;
            if (symbol1>symbol2){
                begin = symbol2;
                end = symbol1;
            }

            for (int i = begin; i <= end; i++) {
                char Arr = (char) i;
                System.out.print(Arr + " ");

            }
        }

        public static void main(String[] args) {
            Example2 example2 = new Example2();
            example2.getSymbols();
        }

    }
