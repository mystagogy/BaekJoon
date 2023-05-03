package me.java.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon_11068 {

    public static boolean isPalindrome(int x, int B){
        ArrayList<Integer> list = new ArrayList<>();
        while (x != 0){
            list.add(x%B);
            x /= B;
        }
        for(int i = 0; i < list.size()/2; i++){
            if(list.get(i) != list.get(list.size()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T > 0) {
            int x = Integer.parseInt(br.readLine());
            boolean status = false;
            for(int i = 2; i < 65; i++){
                if(isPalindrome(x, i)){
                    status = true;
                    break;
                }
            }
            sb.append(status ? 1 : 0).append("\n");
            T--;
        }
        System.out.println(sb);
    }
}
