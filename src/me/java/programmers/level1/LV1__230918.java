package me.java.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class LV1__230918 {
    public String[] solution(String[] players, String[] callings) {

        Map<Integer, String> rank = new HashMap<>();
        Map<String, Integer> player = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            rank.put(i + 1, players[i]);
            player.put(players[i], i + 1);
        }

        for (String curPlayer : callings) {
            int curRank = player.get(curPlayer);
            int frontRank = curRank - 1;
            String frontPlayer = rank.get(curRank-1);

            rank.put(frontRank, curPlayer);
            rank.put(curRank, frontPlayer);
            player.put(frontPlayer, curRank);
            player.put(curPlayer, frontRank);
        }

        String[] answer = new String[players.length];
        int cnt = 0;
        for(String s : rank.values()){
            answer[cnt++] = s;
        }

        return answer;
    }
}

