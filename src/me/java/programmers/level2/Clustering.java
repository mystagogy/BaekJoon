package me.java.programmers.level2;


import java.util.ArrayList;
import java.util.Collections;

public class Clustering {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for(int i = 0; i < str1.length()-1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i+1);

            if(Character.isLetter(a) && Character.isLetter(b)) {
                list1.add(str1.substring(i,i+2));
            }
        }

        for(int i = 0; i < str2.length()-1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i+1);

            if(Character.isLetter(a) && Character.isLetter(b)) {
                list2.add(str2.substring(i,i+2));
            }
        }


        Collections.sort(list1);
        Collections.sort(list2);


        for(String s : list1) {
            if(list2.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }

        for(String s : list2) {
            union.add(s);
        }

        if(union.size() == 0)
            answer = 65536;
        else
            answer = (int)((double)intersection.size()/(double) union.size()*65536);

        return answer;
    }
}
