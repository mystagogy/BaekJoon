package me.java.Practice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**포인트 관리 프로그램입니다**");
        HashMap<String, Integer> hash = new HashMap();
        while (true){
            System.out.print("이름과 포인트 입력>>");
            String name = sc.next();
            if(name.equals("그만"))
                break;
            int point = sc.nextInt();
            if(hash.get(name) == null)
                hash.put(name, point);
            else
                hash.put(name, hash.get(name)+point);
            Set<String >key = hash.keySet();
            Iterator<String> iter = key.iterator();
            while(iter.hasNext()){
                String getName = iter.next();
                Integer sum = hash.get(getName);
                System.out.println("("+getName+","+sum+")");
            }
        }
    }
}
