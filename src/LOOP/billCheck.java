package LOOP;
import java.util.Scanner;

public class billCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total = sc.nextInt();
        int num_total = sc.nextInt();

        int sum = 0;
        for(int i = 0; i< num_total; i++){
            int stuff = sc.nextInt();
            int price = sc.nextInt();
            sum += stuff * price;
            System.out.println(sum);
        }
        System.out.println(sum);
        if( total == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
