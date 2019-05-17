package ru.algoritms.chapter2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public void task1 (LinkedListNode n){
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode prev = null;
        while (n !=null){
            if(set.contains(n.data)){
                prev.next = n.next;
            } else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
        }

    }
}
