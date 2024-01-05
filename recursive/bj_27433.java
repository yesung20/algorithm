package com.CodingTest;

import java.util.Scanner;

public class bj_27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    static int fac(int n){  // 백준에 제출 했을 때 틀렸다고 나온다. 자료형을 1ong을 써야하고
        if(n==1){   // n<=0 으로 바꿔줘야 한다. 이유는 잘 모르겠다..
            return 1;   
        }
        else{
            return n * fac(n-1);
        }
    }
}
