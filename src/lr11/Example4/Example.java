package lr11.Example4;

import org.w3c.dom.Node;

class Example {
    public static void main(String[] args) {

        Example1 node0 = new Example1(0, null);
        Example1 node1 = new Example1(1, null);
        Example1 node2 = new Example1(2, null);
        Example1 node3 = new Example1(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        Example1 ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

class Example1 {
    public int value;
    public Example1 next;

    Example1(int value, Example1 next) {
        this.value = value;
        this.next = next;
    }
}

