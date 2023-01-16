package me.java.programmers.level2;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class OpenChat {
    public static String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String, String> map = new HashMap<>();
        List<String> list = new LinkedList<>();

        for(int i = 0; i < record.length; i++) {
            String[] split = record[i].split(" ");
            if(!split[0].equals("Leave")) {
                map.put(split[1], split[2]);
            }
        }


        for(int i = 0; i < record.length; i++) {
            String[] split = record[i].split(" ");
            if(split[0].equals("Enter")) {
                list.add(map.get(split[1]) + "님이 들어왔습니다.");
            }else if(split[0].equals("Leave")) {
                list.add(map.get(split[1]) + "님이 나갔습니다.");
            }
        }

        answer = list.toArray(new String[list.size()]);

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]
                {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}));
    }
}
