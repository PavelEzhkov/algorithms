package ru.algoritms.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task3 {
    void createLevellinkedList (TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
        if (root == null) return;

        LinkedList<TreeNode> list = null;
        if (list.size() == level){
            list = new LinkedList<TreeNode>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        createLevellinkedList(root.left, lists, level+1);
        createLevellinkedList(root.right,lists, level+1);
    }
    ArrayList<LinkedList<TreeNode>> createLelelLinkedLisy(TreeNode root){
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        createLevellinkedList(root,lists,0);
        return lists;
    }
}
