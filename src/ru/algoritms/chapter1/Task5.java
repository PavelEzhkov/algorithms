package ru.algoritms.chapter1;

public class Task5 {
    public boolean task5(String str1, String str2){
        if (Math.abs(str1.length()-str2.length())>1){
            return false;
        }
        String s1 = str1.length()<str2.length()? str1:str2;
        String s2 = str1.length()<str2.length()? str2:str1;

        int index1 = 0;
        int index2 =0;
        boolean foundDiff = false;
        while (index2<s2.length() && index1< s1.length()){
            if (s1.charAt(index1)!= s2.charAt((index2))){
                if (foundDiff) return false;
                foundDiff =true;
                if (s1.length() == s2.length()){
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
