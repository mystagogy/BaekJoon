package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_2108 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int median = 0;
        int freq = 0;
        int range = 0;
        try{
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                list.add(Integer.parseInt(br.readLine()));
            }
            Collections.sort(list);


            for(int x : list){
                sum += x;
            }
            sum = ((int)Math.round((double)sum / list.size()));
            System.out.println(sum);

            median = list.get((list.size()-1)/2);
            System.out.println(median);

            Map<Integer, Integer> countMap = new HashMap<>();
            int maxCount = -1;
            for (Integer x : list) {
                Integer count = countMap.get(x);
                if(count == null){
                    count = 1;
                    countMap.put(x, count);
                } else{
                    countMap.put(x, ++count);
                }

                if(count != null && count > maxCount){
                    maxCount = count;
                }
            }

            ArrayList<Integer> freqList = new ArrayList<>();

            for(Integer key: countMap.keySet()){
                Integer value = countMap.get(key);
                if(value == maxCount){
                    freqList.add(key);
                }
            }

            Collections.sort(freqList);
            if(freqList.size() == 1){
                freq = freqList.get(0);
            } else{
                freq = freqList.get(1);
            }
            System.out.println(freq);

            range = list.get(list.size()-1) - list.get(0);
            System.out.println(range);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
