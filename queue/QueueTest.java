package com.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args){
        Deque<Integer> q = new LinkedList<>();

        //add  맨 뒤에 삽입
        q.add(1);
        q.add(2);
        q.add(3);

        //addLast  위와 같다. 맨 뒤에 삽입
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);

        //addFirst  맨 앞에 삽입
        q.addFirst(9);
        q.addFirst(9);
        q.addFirst(9);

        for(Integer integer : q){
            System.out.print(integer+" ");
        }
        System.out.println();

        //pollFirst  맨 앞 요소 가져오고 큐에서 제거
        System.out.println(q.pollFirst());
        //q.pollFirst();

        //pollLast  맨 뒤 요소 가져오고 큐에서 제거
        System.out.println(q.pollLast());
        //q.pollLast();

        //peekFirst  맨 앞 요소를 가져오고 큐에서 제거하지는 않는다
        System.out.println(q.peekFirst());

        //peekLast  맨 뒤 요소를 가져오고 큐에서 제거하지는 않는다.
        System.out.println(q.peekLast());

        //contains  해당 값을 포함하고 있는지 true,flase로 나타낸다.
        System.out.println(q.contains(9));
    }
}
