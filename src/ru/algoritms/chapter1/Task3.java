package ru.algoritms.chapter1;

public class Task3 {
    public static void main(String[] args) {
        task3(new char[]{'t','e','s',' ','t','1'});
        task3(new char[]{'t','e','s',' ','t','2',' '});
    }

    private  void task3() {
    }

    public static void task3(char[] string){
        int spaces =0;
        for (int i = 0; i < string.length; i++) {
            if (string[i]== ' ')
                spaces++;
        }
        char[] result = new char[string.length+spaces*2];
        int shift = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i]!=' ')
                result[i+shift]=string[i];
            else {
                result[i+shift++]='%';
                result[i+shift++]='2';
                result[i+shift]='0';
            }
        }
        for (char c:result
             ) {
            System.out.print(c);
        }
        System.out.println();
    }
}
