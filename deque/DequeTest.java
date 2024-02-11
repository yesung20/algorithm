package com.algorithm;

import java.util.Arrays;

public class DequeTest {
    public static void main(String[] args) throws Exception{
        Deque deque = new Deque(100);
        deque.backPush(10);
        deque.backPush(20);
        deque.backPush(30);
        deque.backPush(40);
        deque.backPush(50);
        System.out.println(deque.frontRemove());
        System.out.println(deque.frontRemove());
        deque.frontPush(80);
        deque.frontPush(60);
        System.out.println(deque.backRemove());
        System.out.println(deque.backRemove());
        System.out.println(deque.frontPeek());
        System.out.println(deque.frontPeek());
        System.out.println(deque.backPeek());
        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
    }
}

//frontPush(), backPush(), frontRemove(), backRemove(), frontPeek(), backPeek(), size(), isEmpty()
class Deque{
    private int[] arr;
    private int size=0;
    private int front=-1;
    private int back=0;
    public Deque(int data){
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

        arr[front] = data;
        size++;
        front--;
    }

    void backPush(int data)throws Exception{
        if(size==0){
            arr[0] = data;
            size++;
            back++;
        }
        if(size == arr.length) throw new Exception("Deque full");
        arr[back] = data;
        size++;
        back++;
    }
    int frontRemove(){
        int returnData = arr[front+1];
        arr[front+1] = -1;
        front++;
        System.out.println("front value: " + front);
        return returnData;
    }

    int backRemove(){
        int returnData = arr[back-1];
        arr[back-1] = -1;
        back--;
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
