package me.java.Practice.DataStructure;

import java.util.ArrayList;

public class Stack<E> extends ArrayList<E> {
    /**
     * 요소 추가하기
     * @param element : 추가할 요소
     * @return : 추가한 요소
     */
    public E push (E element){
        add(element);
        return element;
    }

    /**
     * 마지막에 넣은 요소 출력
     * @return 스택의 최상단 요소
     */
    public E peek(){
        int len = size();
        return get(len-1);
    }

    /**
     * 마지막에 넣은 요소 출력 및 제거
     * @return 제거된 요소
     */
    public E pop(){
        E object = peek();
        int len = size();

        remove(len -1);

        return object;
    }

    /**
     * 특정 요소의 위치 반환
     * 최상단 요소의 위치는 1
     * @param o 찾을 특성 요소
     * @return 요소 위치
     */
    public int search(Object o){
        int idx = lastIndexOf(o);
        if(idx >= 0) return size()-idx;
        return -1;
    }

    /**
     * 스택이 비어있는지 확인
     * @return 스택이 비어있다면 true 반환
     */
    public boolean empty(){
        return size() == 0;
    }
}
