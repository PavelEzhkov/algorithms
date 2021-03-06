package ru.algoritms.chapter8;

public class Task5 {
    int minProduct(int a, int b) {
        int bigger = a < b ? b : a;
        int smaller = a < b ? a : b;
        return minProductHelper(smaller, bigger);
    }

    private int minProductHelper(int smaller, int bigger) {
        if (smaller == 0){
            return 0;
        } else if (smaller == 1){
            return bigger;
        }
        int s = smaller>>1;
        int side1 = minProduct(s, bigger);
        int side2 = side1;
        if (smaller% 2 == 1){
            side2 = minProduct(smaller -s, bigger);
        }

        return side1 + side2;
    }
}
