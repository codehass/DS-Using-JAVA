package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        // Jagged array is the array where we have the num of columns different in each row
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of row: ");
        int R = sc.nextInt();

        int[][] arr = new int[R][];
        for (int i = 0; i < R; i++) {
            System.out.println("How meany cols you want in this row: ");
            int colsInCurrentRow = sc.nextInt();

            arr[i] = new int[colsInCurrentRow];
            for (int j = 0; j < colsInCurrentRow; j++) {
                System.out.println("Enter ele: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
