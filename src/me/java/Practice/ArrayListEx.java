package me.java.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Character> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("6개의 학점 입력 >>");
        for(int i = 0 ; i < 6; i++){
            char grade = sc.next().charAt(0);
            arrList.add(grade);
        }
        int sum = 0;
        for(int i = 0; i < arrList.size(); i++){
            switch (arrList.get(i)){
                case 'A':
                    sum += 4;
                    break;
                case 'B' :
                    sum += 3;
                    break;
                case 'C':
                    sum += 2;
                    break;
                case 'D' :
                    sum += 1;
                    break;
                case 'F':
                    sum += 0;
                    break;
            }
        }
        double avg = (double)sum/ arrList.size();
        System.out.println(avg);
    }
}
