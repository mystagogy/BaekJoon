package me.java.baekjoon.java;
import java.util.Scanner;
/*
재귀함수와 반복문 중 어느 것을 사용하는 것이 좋을까?
- 재귀함수는 코드가 간결해지는 장점이 있지만 stack 저장변수가 늘어나 메모리 사용량이 증가하는 단점이 있다.
- 반복문의 경우 코드는 증가할지라도 속도가 증가하며 메모리 낭비를 줄일 수 있다.
 */

public class BaekJoon_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[15][15];
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = 0;
                matrix[0][j] = j;
            }
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(matrix[k][n]);
        }
    }
}
