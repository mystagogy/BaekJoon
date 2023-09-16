package me.java.programmers.level1;

public class LV1_230916 {
    public int[] solution(String[] park, String[] routes) {
        int dx = 0;
        int dy = 0;

        char[][] arr = new char[park.length][park[0].length()];

        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();

            if(park[i].contains("S")){
                dy = i;
                dx = park[i].indexOf("S");
            }
        }

        for(String route : routes){
            String way = route.split(" ")[0];
            int len = Integer.parseInt(route.split(" ")[1]);

            int nx = dx;
            int ny = dy;

            for(int i = 0; i < len; i++){
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }
                if(nx >=0 && ny >=0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        break;
                    }
                    if(i == len-1){
                        dx = nx;
                        dy = ny;
                    }
                }
            }
        }

        int[] answer = {dy, dx};
        return answer;
    }
}
