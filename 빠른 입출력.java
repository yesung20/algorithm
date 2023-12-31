package com.CodingTest;

import java.io.*;
import java.util.*;

public class bj_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}
//Scanner, sout을 쓰는 것 보다 한번에 버퍼에 저장하고 출력하는 해당 형식이 속도가 훨씬 빠르다.
