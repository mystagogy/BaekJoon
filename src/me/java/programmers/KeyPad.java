package me.java.programmers;

public class KeyPad {
    public int[] find(int push){
        char[][] pad = {{1,2,3},{4,5,6},{7,8,9},{'#',0,'*'}};
        int[] answer = {};
        for(int i = 0; i < pad.length; i++){
            for(int j = 0; j < pad[0].length; j++){
                if(push == pad[i][j]){
                    answer = new int[]{i, j};
                    return answer;
                }
            }
        }
        return null;
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String left = "L";
        String right = "R";
        int[] l_point = {3,0};
        int[] r_point = {3,2};
        for(int push : numbers){
            if(push == 1 || push == 4 || push == 7){
                answer += left;
                l_point = find(push);
            }
            else if(push == 3 || push == 6 || push == 9){
                answer += right;
                r_point = find(push);
            }
            else{
                int[] temp = find(push);
                int l_path = 0;
                int r_path = 0;
                for(int i = 0; i < temp.length; i++){
                    l_path += Math.abs(l_point[i]-temp[i]);
                    r_path += Math.abs((r_point[i]-temp[i]));
                }
                if( l_path > r_path){
                    answer += right;
                    r_point = temp;
                }
                else if(l_path == r_path){
                    if(hand.equals("right")){
                        answer += right;
                        r_point = temp;
                    }
                    else{
                        answer += left;
                        l_point = temp;
                    }
                }
                else{
                    answer += left;
                    l_point = temp;
                }
            }
        }
        return answer;
    }
}
