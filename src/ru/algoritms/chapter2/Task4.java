package ru.algoritms.chapter2;

public class Task4 {
    public LinkedListNode task4 (LinkedListNode node, int x){
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterEnd = null;
        LinkedListNode afterStart = null;

        while (node != null) {
            LinkedListNode next = node.next;
            node.next = null;
            if (node.data < x){
                if(beforeStart == null){
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null){
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }

        if (beforeStart == null)
            return afterStart;
        beforeEnd.next=afterStart;
        return  beforeStart;
    }
}
