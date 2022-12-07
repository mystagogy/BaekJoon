package me.java.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class makePrimeNumber {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else
            return false;
    }
    public static boolean isPrime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int solution(int[] nums) {
        int answer = 0;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0; i < nums.length; i ++){
            if(isEven(nums[i])){
                even.add(nums[i]);
            }else {
                odd.add(nums[i]);
            }
        }
        int sum = 0;
        if(odd.size()>=3){
            for(int i = 0; i < odd.size(); i++){
                for(int j = i+1; j <odd.size(); j++){
                    for(int k = j+1; k < odd.size(); k++){
                        sum = odd.get(i)+odd.get(j)+odd.get(k);
                        if(isPrime(sum))
                            answer++;
                    }
                }
            }
        }
        for(int x : odd){
            for(int i = 0; i < even.size(); i++){
                for(int j = i+1; j < even.size(); j++){
                    sum = x + even.get(i) + even.get(j);
                    if(isPrime(sum))
                        answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,6,4};
        System.out.println(solution(arr));
        int[] arr2 = {1,2,3,4};
        System.out.println(solution(arr2));
    }
}
