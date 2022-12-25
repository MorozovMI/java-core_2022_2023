package lr5;

public class Example6{
    public static void main (String[]args){
        Example6 sixth1 = new Example6();
        sixth1.setMaxMin(1);
        sixth1.printMax();
        sixth1.printMin();
        Example6 sixth2 = new Example6();
        sixth2.setMaxMin(1, 2);
        sixth2.printMax();
        sixth2.printMin();

    }

        private int min;
        private int max;

        public Example6() {

        }

        public Example6(int a) {
            min = max = a;
        }

        public Example6(int a, int b) {
            max = a;
            min = b;
        }

        public void setMaxMin(int a) {
            min = max = a;
        }

        public void setMaxMin(int a, int b) {
            if (a > b) {
                max = a;
                min = b;
            } else {
                max = b;
                min = a;
            }
        }

        public void printMax(){
            System.out.println("max = " + max);
        }
        public void printMin() {
            System.out.println("min = " + min);

            }
}
