package com.CodingTest;

import java.util.Scanner;
public class bj_11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int [] prefix_sum = new int[N+1];
        for(int i=0; i<N; i++){
            prefix_sum[i+1] = prefix_sum[i] + arr[i];
        }
        /*
        for(int i=0; i<N+1; i++){
            System.out.print(prefix_sum[i] + " ");
        }
        */
        int a, b;
        for(int i=0; i<M; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            int sum = prefix_sum[b] -prefix_sum[a-1];
            System.out.println(sum);
        }

    }
}
