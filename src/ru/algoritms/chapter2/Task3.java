package ru.algoritms.chapter2;

public class Task3 {
    public boolean task3 (LinkedListNode n){
        if (n==null||n.next==null)
            return false;
        LinkedListNode next = n.next;
        n.data= next.data;
        n.next = next.next;
        return true;
    }
}
