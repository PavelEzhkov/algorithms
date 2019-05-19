package ru.algoritms.chapter4;

public class Task2 {
    TreeNode createMin(int array[]){
        return createMin(array, 0, array.length-1);
    }

    private TreeNode createMin(int[] array, int start, int end) {
        if (end<start){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode n = new TreeNode(array[mid]);
        n.left = createMin(array, start, mid-1);
        n.right = createMin(array,mid+1, end);
        return n;
    }
}
