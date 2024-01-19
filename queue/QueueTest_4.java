package com.algorithm;

import java.util.Arrays;

public class QueueTest_4 {
    public static void main(String[] args) throws Exception {
        Queue4 q = new Queue4(100);
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

class Queue4{
    int[] arr;
    private int front = 0;
    private int rear = 0;
    private int count = 0;
    public Queue4(int data){
        arr = new int[data];
        Arrays.fill(arr, -1);
    }

    public void add(int data) throws Exception {
        if(count == arr.length) throw new Exception("Queue full");                                                                               
        if(rear== arr.length){
            rear=0;
        }
        arr[rear] = data;
        rear++;
        count++;
    }

    public int remove() throws Exception {
        if(count == 0) throw new Exception("Queue Empty");
        if(front== arr.length){
            front = 0;
        }
        int data = arr[front];
        arr[front] = -1;
        front++;
        count--;
        return data;
    }

    public int peek() throws Exception {
        if(count == 0) throw new Exception("Queue Empty");
        return arr[front];
    }

    public int size() throws Exception {
        if(count == 0) throw new Exception("Queue Empty");
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

}
