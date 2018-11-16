package com.softnero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Martin Ma
 * @Date 2018/11/14
 **/

/*
Sample Input:

6
3
60
100
1024
23456
8735373
Sample Output:

0
14
24
253
5861
2183837
 */
public class FCTRL {
    public static void main(String[] args) throws IOException {

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int loop = Integer.valueOf(bufferedReader.readLine());

        for (int i = 0; i < loop; i++) {
            int factorial = Integer.parseInt(bufferedReader.readLine());
            int res = 0;
            int start = 5;
            while (factorial >= start) {
                res += factorial/start;
                start = start * 5;
            }
            System.out.println(res);
        }
        
    }

}
