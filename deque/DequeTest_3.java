package com.algorithm;

import java.util.Arrays;

public class DequeTest_3 {
    public static void main(String[] args) throws Exception{
        Deque3 deque3 = new Deque3(100);
        deque3.frontPush(10);
        deque3.frontPush(20);
        deque3.frontPush(30);
        deque3.frontPush(40);
        deque3.backPush(100);
        deque3.backPush(200);
        deque3.backPush(300);
        deque3.backPush(400);
        System.out.println(deque3.frontRemove());
        System.out.println(deque3.frontRemove());
        System.out.println(deque3.backRemove());
        System.out.println(deque3.backRemove());
        System.out.println(deque3.frontPeek());
        System.out.println(deque3.backPeek());
        System.out.println(deque3.size());
        System.out.println(deque3.isEmpty());

    }
}

class Deque3{
    private int[] arr;
    private int size=0;
    private int front=0;
    private int back=0;
    public Deque3(int data){
        arr = new int[data];
        Arrays.fill(arr, -1);
        this.back = data/2;
        this.front = data/2;
    }

    void frontPush(int data)throws Exception{
        if(size==0){
            arr[front] = data;
            size++;
            front--;
            back++;
        }
        else if(front==-1) throw new Exception("front full");
        else {
            arr[front] = data;
            size++;
            front--;
        }
    }

    void backPush(int data)throws Exception{
        if(size==0){
            arr[back] = data;
            size++;
            back++;
            front--;
        }
        else if(back == arr.length) throw new Exception("Deque full");
        else {
            arr[back] = data;
            size++;
            back++;
        }
    }
    int frontRemove()throws Exception{
        if(size==0) throw new Exception("Deque empty");

        int returnData = arr[front+1];
        arr[front+1] = -1;
        front++;
        size--;
        return returnData;
    }

    int backRemove()throws Exception{
        if(size==0) throw new Exception("Deque empty");

        int returnData = arr[back-1];
        arr[back-1] = -1;
        back--;
        size--;
        return returnData;
    }

    int frontPeek()throws Exception{
        if(size==0) throw new Exception("Deque empty");
        return arr[front+1];
    }

    int backPeek()throws Exception{
        if(size==0) throw new Exception("Deque empty");
        return arr[back-1];
    }

    int size()throws Exception{
        if(size==0) throw new Exception("Deque empty");
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }
}
