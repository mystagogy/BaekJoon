package me.java.programmers;

import java.util.*;

public class bruteForce {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int A_count = 0;
        int B_count = 0;
        int C_count = 0;
        int[] A = {1,2,3,4,5};
        int[] B = { 2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer>list = new ArrayList<>();

        for(int i = 0; i < answers.length; i++){
            if(answers[i]==A[i%A.length]){
                A_count++;
            } if (answers[i]==B[i%B.length]) {
                B_count++;
            } if (answers[i]==C[i%C.length]) {
                C_count++;
            }
        }
        list.add(A_count);
        list.add(B_count);
        list.add(C_count);
        int max = Collections.max(list);
        int count = Collections.frequency(list, max);
        answer = new int[count];
        int i = 0;
        int j = 0;
        for(int x : list){
            if(x == max) {
                answer[i] = j;
                i++;
            }
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,3,2,4,2};
        solution(arr1);
        solution(arr2);
    }
}
