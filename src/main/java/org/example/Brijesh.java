package org.example;

import java.util.Arrays;

public class Brijesh {
    public static void main(String[] args) {
        int[] arr = {3, 5, -1, 8, 17};
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(max);
        System.out.println(arrayAddition(arr, max));
    }

    public static boolean arrayAddition(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            if (target != arr[i]) sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (sum == target) return true;
                if (arr[j] != target) sum += arr[j];
            }
        }
        return false;
    }
}
