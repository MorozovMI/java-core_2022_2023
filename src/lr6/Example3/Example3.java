package lr6.Example3;

public class Example3 {
    static void maxNum(int ... array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Максимальное значение " + max);
    }
        static void minNum(int ... array){
            int min = array[0];
            for (int i = 0; i<array.length; i++){
                min = Math.min(min, array[i]);
            }
            System.out.println("Миниматльное значение " + min);
        }

        static void avgNum(int ... array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
           sum = array[i] + sum;
        }
        double avg = (double) sum/array.length;
        System.out.println("Среднее значение " + avg);
    }
}
