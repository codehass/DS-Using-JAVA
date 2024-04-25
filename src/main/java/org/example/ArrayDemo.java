package org.example;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1,15,6,84,9};
        System.out.println(arr);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Traversal
        System.out.println("Array Length " + arr.length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //Enhanced For Loop/For Each Loop
        for (int x: arr) {
            System.out.println(x);
        }

        int[] arr2 = new int[10];
        Arrays.fill(arr2, 14);
        arr2[0] = 80;
        System.out.println(Arrays.toString(arr2));

    }
}
