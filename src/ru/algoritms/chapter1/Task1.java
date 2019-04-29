package ru.algoritms.chapter1;

public class Task1 {
    public boolean task1(String string){
        if (string.length()>256) return false;

        boolean[] chars = new boolean[256];
        for (int i = 0; i < string.length(); i++) {
            int value = string.charAt(i);
            if (chars[value]){
                return false;
            }
            chars[value] = true;
        }
        return true;
    }
}
