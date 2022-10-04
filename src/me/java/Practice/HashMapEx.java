package me.java.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 10개 입력>>");
        while(true){
            System.out.println("나라 이름, 인구 >> ");
            String country = sc.next();
            if(country.equals("그만"))
                break;
            int num = sc.nextInt();
            hash.put(country,num);
        }
       while (true){
           System.out.println("인구검색>>");
           String str = sc.next();
           if(str.equals("그만"))
               break;
           Integer getNum = hash.get(str);
           if(getNum == null)
               System.out.println(str + "나라는 없습니다");
           else
               System.out.println(str +"의 인구는 "+ getNum);
       }
    }
}
