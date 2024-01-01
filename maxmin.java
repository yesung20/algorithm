package com.algorithm;

import java.util.Scanner;

public class maxmin {
    static int max(int a, int b, int c, int d){
        int max = a;
        if(max<b) max = b;
        if(max<c) max = c;
        if(max<d) max = d;
        return max;
    }
    static int min(int a, int b, int c){
        int min = a;
        if(min>b) min = b;
        if(min>c) min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(max(a, b, c, d));
        System.out.println(min(a,b,c));
    }
}
