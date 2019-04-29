package ru.algoritms.chapter1;

public class Task2 {
    public boolean task2 (String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] letters = new int[256];

        char[] str1Array = str1.toCharArray();
        for (char c:str1Array) {
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int c= str2.charAt(i);
            if (--letters[c]<0){
                return false;
            }
        }
        return true;
    }

}
