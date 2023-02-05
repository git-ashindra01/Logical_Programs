package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class Stopwatch {
    private static long startTime;
    private static long endTime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to start the stopwatch");
        int start = sc.nextInt();
        if (start == 1) {
            startTime = System.currentTimeMillis();
            System.out.println("Stopwatch started!");
        }
        System.out.println("Press 2 to stop the stopwatch");
        int stop = sc.nextInt();
        if (stop == 2) {
            endTime = System.currentTimeMillis();
            System.out.println("Stopwatch stopped!");
            long elapsedTime = endTime - startTime;
            System.out.println("Elapsed time in milliseconds: " + elapsedTime + "ms");
        }
    }
}

