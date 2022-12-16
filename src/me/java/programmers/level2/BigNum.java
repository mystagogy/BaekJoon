package me.java.programmers.level2;

public class BigNum {
    public static int solution(int n) {
        int answer = 0;
       String binary = Integer.toBinaryString(n);

       int count = 0;
       for(int i = 0; i < binary.length(); i++){
           if(binary.charAt(i)=='1') count++;
       }
       n++;
       boolean state = true;
       while(state){
           int result = 0;
           String str = Integer.toBinaryString(n);
           for(int i = 0; i < str.length(); i++){
               if(str.charAt(i)=='1') result++;
           }
           if(count==result){
               state = false;
           }
           n++;
       }
        answer = n-1;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(78));
    }
}
