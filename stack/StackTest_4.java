package com.algorithm;

public class StackTest_4 {
    public static void main(String[] args) {
        Stack4 stack = new Stack4();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(10));
    }
}

class Stack4{
    private Node head;
    private int size;
    class Node{
        private int data;
        private Node next;
    }

    public void push(int k){
        Node newNode = new Node();
        newNode.data = k;
        if(head != null){
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public int pop(){
        int returnData = head.data;
        Node newNode = new Node();
        newNode = head;
        head = null;
        head = newNode.next;
        size--;
        return returnData;
    }

    public int peek(){
        return head.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int search(int k){
        int count = 1;
        int scount = this.size;
        Node x = head;
        while(scount != 0){
            if(x.data == k){
                return count;
            }
            x = x.next;
            scount--;
            count++;
        }
        return -1;
    }

}
