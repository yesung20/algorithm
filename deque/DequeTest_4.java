package com.algorithm;

public class DequeTest_4 {
    public static void main(String[] args) {
        try {
            Deque4 de = new Deque4();
            de.frontPush(10);
            de.frontPush(20);
            de.frontPush(30);
            de.frontPush(40);
            de.backPush(100);
            de.backPush(200);
            de.backPush(300);
            de.backPush(400);
            System.out.println(de.frontRemove());
            System.out.println(de.frontRemove());
            System.out.println(de.backRemove());
            System.out.println(de.backRemove());
            System.out.println(de.frontPeek());
            System.out.println(de.backPeek());
            System.out.println(de.size());
            System.out.println(de.isEmpty());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

//frontPush(), backPush(), frontRemove(), backRemove(), frontPeek(), backPeek(), size(), isEmpty()
class Deque4{
    private Node head;
    private Node tail;
    private int size;
    class Node{
        private int data;
        private Node address;
    }
    public void frontPush(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(size==0){
            tail = newNode;
        }
        newNode.address = head;
        head = newNode;
        size++;
    }

    public void backPush(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(size == 0){
            head = newNode;
        }
        newNode.address = tail;
        tail = newNode;
        size++;
    }

    public int frontRemove() throws Exception{
        if(size==0) throw new Exception("empty");
        int returnData = head.data;
        Node node = new Node();
        node = head.address;
        head = null;
        head = node;
        size--;
        return returnData;
    }

    public int backRemove() throws Exception{
        if(size==0) throw new Exception("empty");
        int returnData = tail.data;
        Node node = new Node();
        node = tail.address;
        tail = null;
        tail = node;
        size--;
        return returnData;
    }

    public int frontPeek() throws Exception{
        if(size==0) throw new Exception("empty");
        return head.data;
    }

    public int backPeek() throws Exception{
        if(size==0) throw new Exception("empty");
        return tail.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
