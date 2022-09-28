package me.java.baekjoon.java;
import java.util.Scanner;
public class BaekJoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSubject = sc.nextInt();
        double[] arr = new double[numSubject];
        double max = 0;
        double avg = 0;
        for(int i = 0; i < numSubject; i++){
            arr[i] = sc.nextInt();
            max = max >= arr[i] ? max : arr[i];
        }
        for(int i = 0; i< arr.length; i++){
            arr[i] = arr[i]/max*100;
            avg += arr[i];
        }
        System.out.println(avg/ arr.length);
    }
}
