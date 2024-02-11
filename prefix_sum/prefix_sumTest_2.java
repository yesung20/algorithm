package com.algorithm;

public class prefix_sumTest_2 {
    public static void main(String[] args){
        int[] array = {1, 8, 7, 4, 3, 5, 6};
        int n = array.length;
        int[] prefix_sum = new int[n + 1];
        int x = 2;
        int y = 5;

        for(int i = 0; i < n; i++) {
            prefix_sum[i + 1] = prefix_sum[i] + array[i];
        }

        int part_sum = prefix_sum[y] - prefix_sum[x - 1];
        System.out.println(part_sum);
    }
}
