package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TowDimensionalArraysInput {

    public static void main(String[] args) {
        // Create a 2D array size of NxM and display it:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of rows: ");
        int N = sc.nextInt();
        System.out.println("Enter the num of columns: ");
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Enter ele: ");
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println(Arrays.deepToString(arr));
    }
}
