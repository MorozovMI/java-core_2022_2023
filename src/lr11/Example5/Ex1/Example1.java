package lr11.Example5.Ex1;

public class Example1 {
    public static void main(String[] args) {
        Example5_1 head = new Example5_1(0, null);
        Example5_1 tail = head;
        for (int i = 0; i < 10; i++) {
            tail.next = new Example5_1(i + 1, null);
            tail = tail.next;
        }
        Example5_1 ref = head;
        System.out.println("Формирование односвязного списка от головы: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

class Example5_1 {
    public int value;
    public Example5_1 next;

    Example5_1(int value, Example5_1 next) {
        this.value = value;
        this.next = next;
    }
}

