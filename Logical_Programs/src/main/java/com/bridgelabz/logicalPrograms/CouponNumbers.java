package com.bridgelabz.logicalPrograms;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the number of distinct coupon numbers: ");
        int n = new Scanner(System.in).nextInt();
        int totalRandomNumbers = getCoupon(n);
        System.out.println("Total random numbers needed to have all distinct coupons: " + totalRandomNumbers);
    }

    static int getCoupon(int n) {
        Set<Integer> generated = new HashSet<>();
        Random r = new Random();
        int count = 0;
        while (generated.size() < n) {
            int coupon = r.nextInt(n);
            generated.add(coupon);
            count++;
        }
        return count;
    }
}

