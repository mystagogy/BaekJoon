package me.java.baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Person {

    private int age;
    private String name;

    public Person() {};

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class BeakJoon_10814 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            Person[] person = new Person[num];

            for(int i = 0; i < num; i++){
                person[i] = new Person(sc.nextInt(), sc.next());
            }
            Arrays.sort(person, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getAge() - o2.getAge();
                }
            });
            for(int i = 0; i < num; i++)
                System.out.println(person[i]);
        }
    }

