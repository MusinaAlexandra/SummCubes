package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.next();
        String end = scanner.next();
        sumCubes(start, end);
    }

    public static void sumCubes(String statr, String end) {
        int s = 0;
        int e = 0;
        try {
            s = Integer.parseInt(statr);
            e = Integer.parseInt(end);
        } catch (Exception er) {
            return ;
        }

        for (int i = s; i <= e; i++) {
            char[] chars = (i + "").toCharArray();
            int res = 0;
            for (char ch:chars) {
                res += Math.pow(Integer.parseInt(ch+ ""), 3);
            }
            if (res == i) {
                System.out.println(i);
            }
        }

    }
}
