package me.java.programmers.level2;

import java.util.ArrayList;
import java.util.HashSet;

class Point{
    double x;
    double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Distance {
    public static int solution(String dirs) {

        int nowY = 0;
        int nowX = 0;
        int y = 0;
        int x = 0;

        HashSet<String> set = new HashSet<String>();

        for(int i=0; i<dirs.length(); i++)
        {
            y = nowY;
            x = nowX;
            char command = dirs.charAt(i);
            if(command=='U' && y<=4)
            {
                nowY++;
            }
            if(command=='D' && y>=-4)
            {
                nowY--;
            }
            if(command=='L' && nowX>=-4)
            {
                nowX--;
            }
            if(command=='R' && nowX<=4)
            {
                nowX++;
            }
            if(x==nowX && y==nowY)
            {
                continue;
            }


            String OldToNew = y + "" + x + "" + nowY + "" + nowX + "";
            String NewToOld = nowY + "" + nowX + "" + y + "" + x + "";

            set.add(OldToNew);
            set.add(NewToOld);
        }


        return set.size()/2;
    }

    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));
    }
}
