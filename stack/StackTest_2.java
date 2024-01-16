package com.algorithm;

public class StackTest_2 {
    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        stack.push(3);
        stack.push(7);
        stack.push(10);
        // 스택에 3과 7이 순서대로 저장되어야 한다.


        stack.pop();
        stack.peek();
        stack.size();
        stack.isEmpty();
        //stack.search(7);
    }
}

class Stack2{
    int[] arr = new int[100];   // 스택의 크기를 배열로 설정
    int index;

    public void push(int data){     // push기능 구현
        this.index++;
        arr[index] = data;
    }

    public void pop(){  // pop기능 구현. 근데 pop은 stack배열에서 출력하고 삭제도 해야한다.
        System.out.println("index = " + index);
        System.out.println(arr[index]);
        arr[index]=0;
        this.index--;
        //System.out.println(arr[3]);
        //System.out.println(arr[1]);

    }

    public void peek(){     //맨 위의 값을 꺼내고 지우지는 않는다.
        System.out.println("index = " + index);
        System.out.println(arr[index]);
    }

    public void size(){     //stack에 들어있는 값 개수 확인
        System.out.println(index);
    }

    public void isEmpty(){      //스택이 비어있는지 확인
        if(index==0){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }

    public void search(int data){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==data){
                System.out.println(arr[i]);
                break;
            }
        }
    }

}
