package lr11.Example9;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example9 {
    private static final int ELEMENTS_COUNT = 100000;
    private static final int ELEMENTS_COUNT2 = 10000;
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        System.out.println("Время выполнения операции добавление элемента в начало LinkedList: " + getInsertionTimeAtStart(linkedList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале LinkedList: " + getDeletionTimeAtStart(linkedList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец LinkedList: " + getInsertionTimeAtEnd(linkedList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в конце LinkedList: " + getDeletionTimeAtEnd(linkedList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в середину LinkedList: " + getInsertionTimeAtMiddle(linkedList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в середине LinkedList: " + getDeletionTimeAtMiddle(linkedList) + " мс");
        System.out.println("Время получения элемента по индексу LinkedList: " + getSearchTime(linkedList) + " мс");
        System.out.println();
        System.out.println("Время выполнения операции добавление элемента в начало ArrayList: " + getInsertionTimeAtStart(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале ArrayList: " + getDeletionTimeAtStart(arrayList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец ArrayList: " + getInsertionTimeAtEnd(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в конце ArrayList: " + getDeletionTimeAtEnd(arrayList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в середину ArrayList: " + getInsertionTimeAtMiddle(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в середине ArrayList: " + getDeletionTimeAtMiddle(arrayList) + " мс");
        System.out.println("Время получения элемента по индексу ArrayList: " + getSearchTime(arrayList) + " мс");
    }



    public static long getInsertionTimeAtStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtMiddle(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(list.size() / 2, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }





    public static long getDeletionTimeAtStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(list.size() - 1);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtMiddle(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(list.size() / 2);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getSearchTime(List<Integer> list) {
        for(int i = 0; i < ELEMENTS_COUNT2; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT2; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }


}