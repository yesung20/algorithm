package com.algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;

public class DequeTest_2 {
    public static void main(String[] args) throws Exception {
        Deque2 deque2 = new Deque2(100);
        deque2.backPush(10);
        deque2.backPush(20);
        deque2.backPush(30);
        deque2.backPush(40);
        deque2.backPush(50);
        System.out.println(deque2.frontRemove());
        System.out.println(deque2.frontRemove());
        deque2.frontPush(80);
        deque2.frontPush(60);
        System.out.println(deque2.backRemove());
        System.out.println(deque2.backRemove());
        System.out.println(deque2.frontPeek());
        System.out.println(deque2.backPeek());
        System.out.println(deque2.size());
        System.out.println(deque2.isEmpty());

    }
}

class Deque2{
    private int[] arr;
    private int size=0;
    private int front=-1;
    private int back=0;
    public Deque2(int data){
        arr = new int[data];
        Arrays.fill(arr, -1);
    }

    void frontPush(int data)throws Exception{
        if(size==0){
            arr[0] = data;
            size++;
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
            arr[0] = data;
            size++;
            back++;
        }
        else if(size == arr.length) throw new Exception("Deque full");
        else {
            arr[back] = data;
            size++;
            back++;
        }
    }
    int frontRemove(){
        int returnData = arr[front+1];
        arr[front+1] = -1;
        front++;
        size--;
        System.out.println("front value: " + front);
        return returnData;
    }

    int backRemove(){
        int returnData = arr[back-1];
        arr[back-1] = -1;
        back--;
        size--;
        return returnData;
    }

    int frontPeek(){
        return arr[front+1];
    }

    int backPeek(){
        return arr[back-1];
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }
}
