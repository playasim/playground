package com.softnero;

import java.io.*;
/**
 * @Author Martin Ma
 * @Date 2018/11/15
 **/
public class CIELAB {

    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = new DataInputStream(System.in);
        int a = inputStream.readInt();
        int b = inputStream.readInt();
        int res;
        if (a > b)
            res = a - b;
        else
            res = b - a;
        if (res % 10 != 9)
            System.out.println(res + 1);
        else
            System.out.println(res - 1);
    }

}
