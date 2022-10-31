package me.java.baekjoon;
import java.util.Scanner;

public class BaekJoon_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] matrix = new int[100][100];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = 0;
            }
        }

        for(int i =0; i < num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if((x+10)<=100 && (y+10)<=100) {
                for (int j = x; j < x + 10; j++) {
                    for (int k = y; k < y + 10; k++) {
                        matrix[j][k] += 1;
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] >= 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
