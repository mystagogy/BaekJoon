package me.java.Practice;

import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
    public static void printVector(Vector<Integer> v){
        int max = v.get(0);
        for(int i = 1; i < v.size(); i++){
            max = max > v.get(i)? max : v.get(i);
        }
        System.out.println("가장 큰 수는 "+ max );
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력>>");
        while(true){
            int num = sc.nextInt();
            if(num == -1)
                break;
            v.add(num);

        }
        printVector(v);
    }
}
