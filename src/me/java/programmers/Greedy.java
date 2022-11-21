package me.java.programmers;

public class Greedy {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n+2];
        for(int i =1; i < student.length; i++){
            student[i] = 1;
        }
        for(int minus : lost){
            student[minus] = 0;
        }
        for(int plus : reserve){
            student[plus]++;
        }
        for(int i = 1; i < student.length; i++){
            if(student[i]==0 && student[i-1] > 1){
                student[i-1]--;
                student[i]++;
            }
            else if(student[i]==0 && student[i+1] > 1){
                student[i+1]--;
                student[i]++;
            }
        }
        for(int has : student){
            if(has > 0){
                answer++;
            }
        }
        return answer;
    }

}
