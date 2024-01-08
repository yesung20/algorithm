package com.algorithm;

public class recursive_1 {
    public static void main(String[] args) {
        function(3);
    }
    static void function(int n){
        if(n==0){
            //System.out.println("재귀 공부중");
            return;
        }
        else{
            function(n-1);
        }
    }
}
