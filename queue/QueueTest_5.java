package com.algorithm;

public class QueueTest_5 {
    public static void main(String[] args) throws Exception{
        Queue5 q = new Queue5();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}

class Queue5{
    private Node front;
    private Node rear;
    private int size;
    class Node{
        private int data;
        private Node next;
    }

    public void add(int k){
        Node newNode = new Node();
        newNode.data = k;
        if(front == null){
            front = newNode;
        }
        if(rear == null){
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public int remove() throws Exception {
        if(size == 0) throw new Exception("Queue Empty");
        int returnData = front.data;
        front = front.next;
        size--;
        return returnData;
    }

    public int peek() throws Exception {
        if(size == 0) throw new Exception("Queue Empty");
        return front.data;
    }

    public int size() throws Exception {
        if(size == 0) throw new Exception("Queue Empty");
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
