package me.java.baekjoon.java;
import java.util.Scanner;
public class plusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int initial = num;
        int tmp=0;
        int count = 0;
        do {
            if (initial >= 0 && initial <= 99) {
                int first = initial / 10;
                int second = initial % 10;
                tmp = first + second;
                tmp = second * 10 + tmp % 10;
                initial = tmp;
                count++;
            }
        }while(num!=tmp);
        System.out.println(count);

    }
}
