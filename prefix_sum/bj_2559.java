package com.CodingTest;


import java.util.ArrayList;
import java.util.Scanner;
public class bj_2559 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int [] prefix_sum = new int[N+1];

        /*
        int a = prefix_sum.length;
        System.out.println(a);
        */

        for(int i=0; i<N; i++){
            prefix_sum[i+1] = prefix_sum[i]+arr[i];
        }

        /*
        for(int i=0; i<11; i++){
            System.out.print(prefix_sum[i] + " ");
        }

        System.out.println();

        int c = 0;
        int [] answer = new int[N+1];
        int count = 0;
        while(K <= N) {
            answer[count] = prefix_sum[K] - prefix_sum[c];
            count++;
            K++;
            c++;
        }

        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }

        System.out.println();


        int max = answer[0];
        for(int i=0; i<answer.length; i++){
            if(max<answer[i]){
                max = answer[i];
            }
        }
        System.out.print(max);
        */

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= N - K; i++) {
            int sum = prefix_sum[i + K] - prefix_sum[i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.print(max);

    }
}

