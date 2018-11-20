package com.softnero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Martin Ma
 * @Date 2018/11/19
 **/
public class CLEANUP {

    public static void main(String[] args) throws IOException {

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int testcases = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testcases; i++) {
            String[] cases = bufferedReader.readLine().split(" ");
            int total = Integer.parseInt(cases[0]);
            int used = Integer.parseInt(cases[1]);
            String[] jobs = bufferedReader.readLine().split(" ");
            List<String> jobsList = Arrays.asList(jobs);
            int order = 1;
            StringBuilder chef = new StringBuilder();
            StringBuilder assis = new StringBuilder();
            for (int j = 1; j <= total; j++) {
                if (!jobsList.contains(String.valueOf(j))) {
                    if (order % 2 == 1)
                        chef.append(j).append(" ");
                    else
                        assis.append(j).append(" ");
                    order ++;
                }

            }
            if (chef.length() > 0)
                System.out.println(chef.substring(0, chef.length() - 1));
            else
                System.out.println("");
            if (assis.length() > 0)
                System.out.println(assis.substring(0, assis.length() - 1));
            else
                System.out.println("");
        }
    }

}
