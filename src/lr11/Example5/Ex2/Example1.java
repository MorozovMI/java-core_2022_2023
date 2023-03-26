package lr11.Example5.Ex2;

public class Example1 {
    public static void main(String[] args) {
        Example5Node head = null;
        for (int i = 10; i >= 0; i--)
        {
            head = new Example5Node(i, head);
        }
        Example5Node ref = head;
        System.out.print("Формирование односвязного списка от хвоста: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next; }
    }
}

class Example5Node {
    public int value; public Example5Node next;
    Example5Node(int value, Example5Node next)
    {
        this.value = value; this.next = next;
    }
}

