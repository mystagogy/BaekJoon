package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalSum = 0;
        double scoreSum = 0;
        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        int N = 20;
        StringTokenizer st;
        while( N --> 0){
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int i = 0; i < 10; i++) {
                if (grade.equals(gradeList[i])) {
                    totalSum += score * gradeScore[i];
                    if (i != 9) {
                        scoreSum += score;
                    }
                }
            }
        }

        System.out.printf("%.6f\n", totalSum / scoreSum);
    }
}
