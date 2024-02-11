package com.algorithm;

import java.util.Arrays;

public class StackTest_5 {
    public static void main(String[] args) throws Exception {
        Stack5 stack = new Stack5(100);
        stack.push(3);
        stack.push(7);
        stack.push(10);
        stack.push(5);
        stack.push(99);
        stack.push(47);
        stack.push(11);
        // 스택에 3과 7이 순서대로 저장되어야 한다.

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(10));
    }
}

class Stack5{
    int[] arr;
    int index = -1;

    public Stack5(int data){
        arr = new int[data];
        Arrays.fill(arr, -1);
    }

    public void push(int data) throws Exception {
        if(this.index+1 >= arr.length) throw new Exception("stack full");
        this.index++;
        arr[index] = data;
    }

    public int pop()  throws Exception{
            if (this.index == -1) throw new Exception("stack empty");
            int data = arr[index];
            arr[index] = -1;
            this.index--;
            return data;
    }

    public int peek() throws Exception {      //맨 위의 값을 꺼내고 지우지는 않는다.
        if(this.index == -1) throw new Exception("stack empty");
        return arr[index];
    }

    public int size(){     //stack에 들어있는 값 개수 확인
        return index+1;
    }

    public boolean isEmpty(){      //스택이 비어있는지 확인
        return index == -1;
    }

    public int search(int data) throws Exception {
        if(this.index == -1) throw new Exception("stack empty");
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
}
