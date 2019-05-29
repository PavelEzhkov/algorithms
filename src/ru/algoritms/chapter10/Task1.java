package ru.algoritms.chapter10;

public class Task1 {
    void task1(int[] a, int[] b, int lastA, int lastB){
        int indexA = lastA - 1;
        int indexB = lastB - 1;
        int indexMerged = lastB+lastA-1;

        while (indexB>= 0){
            if (indexA >= 0 && a[indexA]>b[indexB]){
                a[indexMerged] = a[indexA];
                indexA--;
            } else {
                a[indexMerged] = b[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }
}
