package java_collections.Interfaces;

import java.util.Deque;
import java.util.LinkedList;

public class interface_Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dque=new LinkedList<Integer>();
        dque.addFirst(6);
        dque.addFirst(7);
        dque.addFirst(8);
        dque.addFirst(9);
        dque.add(5);

        dque.addLast(4);

        dque.removeFirst();
        dque.removeLast();

        dque.getFirst();
        dque.getLast();

        System.out.println(dque.poll());

        System.out.println(dque);
    }
}
