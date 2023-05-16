package com.likelion.til.Week5.Day21;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (isAscending ? arr[j] < arr[j - 1] : arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else
                    break;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort01 insert = new InsertionSort01();
        arr = insert.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}
