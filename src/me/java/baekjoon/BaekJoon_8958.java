package me.java.baekjoon;
import java.util.Scanner;
public class BaekJoon_8958{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test_num = sc.nextInt();
        int point = 0;
        int total = 0;
        for(int i =0; i<test_num; i++){
            String[] result = new String[test_num];
            result[i] = sc.next();
            char[] ox = result[i].toCharArray();
            point = 0;
            total = 0;
            for(int j = 0; j< ox.length; j++){
                if('X' == ox[j]){
                    point = 0;
                }else{
                    point++;
                    total += point;
                }
            }
            System.out.println(total);
        }
    }
}