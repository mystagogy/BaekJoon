package me.java.programmers.level2;

import java.util.*;

public class ParkingFee {
    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        HashMap<String, Integer> in = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();
        for(String record : records){
            String[] str = record.split(" ");
            if(str[2].equals("IN")){
                String[] times = str[0].split(":");
                int hour = Integer.parseInt(times[0]);
                int min = Integer.parseInt(times[1]);
                in.put(str[1], hour*60 + min);
            }
            else{
                String[] times = str[0].split(":");
                int hour = Integer.parseInt(times[0]);
                int min = Integer.parseInt(times[1]);
                int total = hour*60 + min;
                result.put(str[1], result.getOrDefault(str[1],0)+total - in.get(str[1]));
                in.remove(str[1]);

            }
        }

        if(!in.isEmpty()){
            for(String key : in.keySet()){
                result.put(key, result.getOrDefault(key,0)+23*60+59 - in.get(key));
            }
        }

        List<String> list = new ArrayList<>(result.keySet());
        Collections.sort(list);

        answer = new int[result.size()];
        int i = 0;
        for(String key : list){
            int temp = result.get(key);
            if(temp <= fees[0]){
                answer[i] = fees[1];
            }
            else{
                temp = temp - fees[0];
                temp = (int)Math.ceil((double)temp/fees[2]);
                answer[i] = temp * fees[3]+ fees[1];
            }
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{180, 5000, 10, 600},
                new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"}));
    }
}
