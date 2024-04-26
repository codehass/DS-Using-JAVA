package org.example;

import java.util.Arrays;

public class TowDimensionalArrays {
    public static  void traverse(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,45},{4,5,6,400},{7,8,5,965}};

        //this will display an array contain the addresses of other arrays
        System.out.println(Arrays.toString(arr));
        //this will display 2D array
        System.out.println(Arrays.deepToString(arr));
        traverse(arr);

        // filter array in comparing the sum of elements of each array
        Arrays.sort(arr, (int[] o1, int[] o2) -> getSum(o1) - getSum(o2));

        // Compare in the bases of the value of the last element
        Arrays.sort(arr, (int[] o1, int[] o2) -> o1[o1.length -1] - o2[o2.length -1]);
        System.out.println(Arrays.deepToString(arr));
    }
}
