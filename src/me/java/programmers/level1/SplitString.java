package me.java.programmers.level1;

public class SplitString {
    public int solution(String s) {
        int answer = 0;
        boolean state = true;
        while(state){
            int o = 0;
            int x = 0;
            if(s.length()<2) {
                state= false;
            }
            answer++;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(0)==s.charAt(i)){
                    o++;
                }
                else{
                    x++;
                }
                if(o==x){
                    s = s.substring(i+1);
                   if(s.length()==0){
                       state=false;
                   }
                    break;
                }
            }
        }
        return answer;
    }
}
