package com.algorithm;

import java.util.Arrays;

public class QueueTest_2 {
    public static void main(String[] args){
        Queue2 q = new Queue2(100);
        q.add(99);
        q.add(86);
        q.add(53);
        q.add(40);

        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
}

class Queue2{
    int[] arr;
    private int front = 0;
    private int rear = 0;
    private int count = 0;
    public Queue2(int data){
        arr = new int[data];
        Arrays.fill(arr, -1);
    }

    public void add(int data){
        if(rear== arr.length){
            rear=0;
        }
        arr[rear] = data;
        rear++;
        count++;
    }

    public int remove(){
        if(front== arr.length){
            front = 0;
        }
        int data = arr[front];
        arr[front] = -1;
        front++;
        count--;
        return data;
    }

    public int peek(){
        return arr[front];
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }
    
}
