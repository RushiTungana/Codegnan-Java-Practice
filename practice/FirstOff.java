package com.practice;

import java.util.*;

public class FirstOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int copy = n;
        while (copy > 0) {
            count++;
            copy /= 10;
        }
        int d=1;
        for (int i = 0; i < count / 2; i++) {
            d *= 10;
        }
        System.out.println(n%d);
    }
}
