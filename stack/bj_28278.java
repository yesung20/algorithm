package com.CodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class bj_28278 {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int value = 0;
            if(st.hasMoreTokens()){
                value = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case 1:
                    stack.push(value);
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        bw.write(String.valueOf(stack.pop()));
                    }
                    else {
                        bw.write(String.valueOf(-1));
                    }
                    bw.newLine();
                    break;
                case 3:
                    bw.write(String.valueOf(stack.size()));
                    bw.newLine();
                    break;
                case 4:
                    if(stack.isEmpty()){
                        bw.write(String.valueOf(1));
                    }
                    else{
                        bw.write(String.valueOf(0));
                    }
                    bw.newLine();
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        bw.write(String.valueOf(stack.peek()));
                    }
                    else{
                        bw.write(String.valueOf(-1));
                    }
                    bw.newLine();
                    break;
            }
        }
        bw.close();
    }
}
