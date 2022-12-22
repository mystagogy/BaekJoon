package me.java.programmers.level2;

public class Jump {
    public static int solution(int n) {
        int ans = 0;
        while (true){
            if(n==1) {
                ans++;
                break;
            }
            if(n%2==0){
                n = n/2;
            }
            else{
                n = (n-1)/2;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(5000));
        System.out.println(solution(1));
    }
}
