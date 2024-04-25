package org.example;
import javax.swing.plaf.synth.SynthInternalFrameUI;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
    // Read N Numbers and Print them in Reverse
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter " + N + " number: ");
        for (int i = 0; i < N; i++) {
            System.out.println("arr" + arr[i] + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array in reverse: ");
        for (int i = N-1; i > 0 ; i--) {
            System.out.println(arr[i]);
        }

    }
}
