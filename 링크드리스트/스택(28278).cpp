#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;
// 백준 : 스택(28278) https://www.acmicpc.net/problem/28278
class Node {
    int data;
    Node* next;

public:

    Node(int data = -1, Node* next = nullptr) : data(data), next(next) {}
    int getData() {
        return data;
    }
    Node* getLink() {
        return next;
    }
   void setLink(Node* link) {
        next = link;
    }
};

class Stack2 {
    Node* top;
    int stackSize;

public:
    Stack2() : top(nullptr), stackSize(0) {
    }

    void push(int element) {

        Node* newNode = new Node(element, top);
        top = newNode;
        
        stackSize++;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        Node* temp = top;
        int poppedData = temp->getData();

        top = top->getLink();
        delete temp;
        stackSize--;

        return poppedData;
    }

    int getStackSize() {
        return stackSize;
    }

    bool isEmpty() {
        return top == nullptr;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top->getData();
    }
};

int main() {
    int N;
    scanf("%d", &N);

    Stack2 st;
    for (int i = 0; i < N; i++) {
        int cmd;
        scanf("%d", &cmd);

        switch (cmd) {
        case 1: {
            int tmp;
            scanf("%d", &tmp);
            st.push(tmp);
            break;
        }
        case 2: {
            printf("%d\n", st.pop());
            break;
        }
        case 3: {

            printf("%d\n",st.getStackSize());
            break;
        }
        case 4: {

            printf("%d\n", st.isEmpty());
            break;
        }
        case 5: {

            printf("%d\n", st.peek());
            break;
        }
        }
    }
    return 0;
}
