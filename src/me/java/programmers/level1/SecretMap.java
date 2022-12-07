package me.java.programmers.level1;
/*
프로그래머스 코딩테스트 연습 레벨1
2018 KAKAO BLIND RECRUITMENT - 비밀지도
 */
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            tmp = String.format("%" + n + "s", tmp);
            tmp = tmp.replaceAll("1", "#");
            tmp = tmp.replaceAll("0", " ");
            answer[i] = tmp;
        }
        return answer;
    }
}
