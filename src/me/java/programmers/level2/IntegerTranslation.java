package me.java.programmers.level2;

import java.util.ArrayList;

public class IntegerTranslation {
    public boolean isPrime(long x){
        if(x==0 || x==1){
            return false;
        }
        else{
            for(int j = 2; j <= Math.sqrt(x); j++){
                if(x%j==0){
                    return false;
                }
            }
            return true;
        }
    }
    public int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n,k);
        ArrayList<Long> list = new ArrayList<>();
        int start = 0;

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i)=='0'){
                list.add(Long.parseLong(num.substring(start,i)));
                start = i;
            }
            else if(num.charAt(i)!='0' && i == num.length()-1){
                list.add(Long.parseLong(num.substring(start,i+1)));
            }
        }

        for(int i = 0; i < list.size(); i++){
            long x = list.get(i);
            if(isPrime(x)){
                answer++;
            }
        }
        return answer;
    }
}
