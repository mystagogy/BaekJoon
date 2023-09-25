package me.java.programmers.level2;

import java.util.*;

public class SaleInfo {
    public boolean check(List<String> list, String[] discount) {
        List<String> info = new ArrayList<>(Arrays.asList(discount));

        for (String item : list) {
            if (!info.contains(item)) return false;
        }
        return true;
    }
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        int i = 0;
        for(String item : want){
            for(int j = 0; j < number[i]; j++){
                list.add(item);
            }
            i++;
        }

        if(!check(list, discount)) return 0;

        for(int j = 0; j <= discount.length-10; j++){

            List<String> tmp=new ArrayList<>(Arrays.asList(Arrays.copyOfRange(discount, j, j+10)));

            for(String item : list){
                tmp.remove(item);
            }

            if(tmp.isEmpty()) answer++;

        }
        return answer;
    }
}
