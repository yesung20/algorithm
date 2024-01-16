package com.algorithm;

import java.util.Arrays;

public class StackTest_3 {
    public static void main(String[] args) {
        Stack3 stack = new Stack3(100);
        stack.push(3);
        stack.push(7);
        stack.push(10);
        stack.push(5);
        stack.push(99);
        stack.push(47);
        stack.push(11);
        // 스택에 3과 7이 순서대로 저장되어야 한다.

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(10));

    }
}

class Stack3{
    int[] arr;   // 스택의 크기를 배열로 설정
    int index = -1;

    public Stack3(int data){    //생성자에서 입력 받은 만큼의 스택배열을 생성하고 모든 요소는 -1로 초기화 시켜준다.
        arr = new int[data];
        Arrays.fill(arr, -1);
    }

    public void push(int data){     // push기능
        this.index++;
        arr[index] = data;
    }

    public int pop(){// pop기능 구현. 근데 pop은 stack배열에서 출력하고 삭제도 해야한다.
        int data = arr[index];
        arr[index]=-1;
        this.index--;
       return data;
    }

    public int peek(){     //맨 위의 값을 꺼내고 지우지는 않는다.
        return arr[index];
    }

    public int size(){     //stack에 들어있는 값 개수 확인
        return index+1;
    }

    public boolean isEmpty(){      //스택이 비어있는지 확인
        return index == -1;
    }

    public int search(int data){
        int position = 1;
        int index = this.index;
        while(index>=0){
            if(arr[index]==data){
                return position;
            }
            index--;
            position++;
        }
        return -1;
    }

    public void test(){
        System.out.println(arr[0]);
    }
}
