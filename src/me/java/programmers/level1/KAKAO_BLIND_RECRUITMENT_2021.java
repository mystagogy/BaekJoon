package me.java.programmers.level1;

public class KAKAO_BLIND_RECRUITMENT_2021 {
    public String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase(); //1단계

        new_id = new_id.replaceAll("[^\\w\\-_.]*",""); //2단계

        new_id = new_id.replaceAll("\\.{2,}",".");   //3단계

        new_id = new_id.replaceAll("^[.]|[.]$","");  //4단계

        if (new_id.length()==0) {   //5단계
            new_id = "a";
        }

        if(new_id.length()>15){ //6단계
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("[.]$","");
        }

        if(new_id.length() < 3){    //7단계
            boolean state = true;
            while(state){
                new_id += new_id.substring(new_id.length()-1);
                if(new_id.length() > 2) state = false;
            }
        }

        answer = new_id;

        return answer;
    }

}
