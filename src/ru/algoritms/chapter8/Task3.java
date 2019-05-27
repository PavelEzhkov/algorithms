package ru.algoritms.chapter8;

public class Task3 {
    int task3(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==i)
                return i;
        }
        return -1;
    }
}
