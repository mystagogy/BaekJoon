package LOOP;
import java.util.Scanner;

public class printStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i<num; i++) {
            for (int j = 1;j<=i+1 ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

