package me.java.baekjoon.java;

import java.util.Scanner;

public class threeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prize;
        int max;
        if (((a == b)&&(b==c))) {       //a,b,c가 모두 동일한 값인 경우
            prize = 10000 + a * 1000;
            System.out.println(prize);
        }
        else if((a!=b)&&(b!=c)&&(a!=c)){//a,b,c,가 모두 다른 값인 경우
            max = (a>b)? a:b;
            max = (max>c)? max:c;
            prize = 100*max;
            System.out.println(prize);
        }
        else{                           //3개중 2개의 값이 같은 경우
            if(a==b || a==c){
                prize = 1000+100*a;
            }
            else
                prize = 1000+100*b;
            System.out.println(prize);
        }
    }
}