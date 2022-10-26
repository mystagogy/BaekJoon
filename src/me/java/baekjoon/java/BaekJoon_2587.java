package me.java.baekjoon.java;
import java.util.*;

public class BaekJoon_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i =0; i < 5; i++){
            list.add(sc.nextInt());
        }
        list.sort(Comparator.reverseOrder());
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        System.out.println(sum/list.size());
        System.out.println(list.get(2));
    }
}
