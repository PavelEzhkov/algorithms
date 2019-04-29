package ru.algoritms.chapter1;

public class Task4 {
    public boolean task4 (String string){
        int[] letters = new int[256];

        char[] strArray = string.toCharArray();
        for (char c:strArray) {
            letters[c]++;
        }
        int number=0;

        for (int letter : letters) {
            if (letter % 2 != 0) number++;
        }

        return number < 2;
    }
}
