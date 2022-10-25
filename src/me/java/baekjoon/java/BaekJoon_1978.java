package me.java.baekjoon.java;
import java.util.Scanner;

public class BaekJoon_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int result = 0;
        for(int i = 0; i<num; i++){
            int x = sc.nextInt();
            if( x >= 2){
                for(int j = 2; j <= x; j++){
                    if(x%j == 0){
                        count++;
                    }
                }
            }
            if(count == 1){
                result++;
            }
            count =0;
        }
        System.out.println(result);
    }
}
