package LOOP;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if( (num>=1) && (num <= 9)) {
            for (int i = 1; i < 10; i++) {
                System.out.println(num + " * " + i + " = " + num*i);
            }
        }else {
            return;
        }
    }
}