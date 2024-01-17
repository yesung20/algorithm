package com.algorithm;

import java.util.Scanner;

public class prefix_sumTest{
    public static void main(String[] args){

        /*
        int [] arr = {1, 8, 7, 4, 3, 5, 6};
        int n = arr.length;
        int[] prefix_sum = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                prefix_sum[i] = prefix_sum[i] + arr[j];
            }
        }
        */

        // 위의 경우보다 시간복잡도를 줄이기 위함

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 8, 7, 4, 3, 5, 6};
        int n = arr.length;
        int[] prefix_sum = new int[n + 1];

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < n; i++) {
            prefix_sum[i + 1] = prefix_sum[i] + arr[i];
        }

        // 이렇게 되면 기존의 배열과 값이 달라진다. 왜냐면 prefix배열의 맨 앞에 0이 있기 때문에.
        /*
        int sum = prefix_sum[b]-prefix_sum[a-1];
        System.out.println(sum);
        */

        // 이렇게 해야 값이 맞게 나오는데.. 뭐가 이상한건지 모르겠네
        int sum = prefix_sum[b+1]-prefix_sum[a];
        System.out.println(sum);

        // 원래 알고리즘은 첫번째가 맞는데 배열로 만들시 오류를 해결하기 위해 맨 앞에 0을 추가해줘야 하고 그렇게 되면 두번째 알고리즘을 사용해야 값이 제대로 나온다.


        // 배열 출력
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(prefix_sum[i]+" ");
        }

    }
}
