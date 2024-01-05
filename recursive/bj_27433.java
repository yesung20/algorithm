package com.CodingTest;

import java.util.Scanner;

public class bj_27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    static int fac(int n){  // 백준에 제출 했을 때 틀렸다고 나온다. 자료형을 1ong을 써야하고 -> 팩토리얼 값은 매우 빠르게 증가하기 때문에 long을 써주는게
                            // 안전하다.
        if(n==1){   // n<=0 으로 바꿔줘야 한다. 이유는 잘 모르겠다.. 값은 잘 나오는데..? -> 1이상의 값만 처리하는게 아닌 0이하의 값도 처리해야하기 때문
                    // 0!은 1이기 때문에 0이하도 1을 반환해야 한다.
            return 1;
        }
        else{
            return n * fac(n-1);
        }
    }
}
