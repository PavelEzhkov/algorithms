package ru.algoritms.chapter2;

public class Task2 {
    public LinkedListNode task2(LinkedListNode list, int k) {
        LinkedListNode p1 = list;
        LinkedListNode p2 = list;

        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
