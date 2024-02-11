package com.algorithm;

import java.util.Stack;     // 이미 자바에서 제공하는 stack클래스가 있다.

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        //push  값 삽입
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //pop  맨 위의 값을 꺼내고 stack에서 지운다.
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(2);
        stack.push(3);

        //peek  맨 위의 값을 꺼내고 stack에서는 지우지 않는다.
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        //size  stack에 들어있는 값의 개수를 확인한다.
        System.out.println(stack.size());

        //isEmpty  stack이 비어있는지 확인한다. (true, false로 반환)
        System.out.println(stack.isEmpty());

        //search  가장 앞에서부터 존재하는 인덱스를 반환하지만 인덱스가 0부터 시작이 아닌 1부터 시작으로 취급된다.
        //따라서 현재 stack에는 1,2,3 이 들어있는데 serach를 하면 값2가 들어있는 인덱스 2를 반환한다. 값1이 들어있는 인덱스는 1이다. 0은 없음
        System.out.println(stack.search(2));

    }
}
