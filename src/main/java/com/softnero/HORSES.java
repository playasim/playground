package com.softnero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author Martin Ma
 * @Date 2018/11/15
 **/
public class HORSES {

    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int loop = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < loop; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            int[] arr = new int[number];
            int min = Integer.MAX_VALUE;
            String[] strs = bufferedReader.readLine().split(" ");
            for (int j = 0; j < number; j++)
                arr[j] = Integer.parseInt(strs[j]);
            Arrays.sort(arr);
            for (int k = 0; k < number - 1; k++) {
                if (arr[k + 1] - arr[k] < min)
                    min = arr[k + 1] - arr[k];
            }
            System.out.println(min);

        }

    }

}
