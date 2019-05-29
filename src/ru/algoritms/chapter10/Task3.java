package ru.algoritms.chapter10;

public class Task3 {
    int task3(int a[], int left, int right, int x){
        int mid = (left+right)/2;
        if (x==a[mid]){
            return mid;
        }
        if (right<left){
            return -1;
        }

        if (a[left]< a[mid]){
            if (x>= a[left] && x<a[mid]){
                return task3(a,left, mid-1,x);
            } else {
                return task3(a, mid+1,right, x);
            }
        } else if (a[mid]<a[left]){
            if (x> a[mid] && x <=a[right]){
                return task3(a,mid+1,right,x);
            } else {
                return task3(a,left,mid-1,x);
            }
        } else if (a[left]==a[mid]){
            if (a[mid] != a[right]){
                return task3(a,mid+1, right, x);
            } else {
                int result = task3(a,left, mid-1, x);
                if (result == -1){
                    return task3(a, mid+1,right,x);
                } else {
                    return result;
                }
            }
        }
        return -1;
    }
}
