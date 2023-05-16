package com.likelion.til.Week5.Day21;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 9, 28, 11};

        for (int i = 1; i <arr.length; i++) {
            int targetValue = arr[i-1];
            int targetIdx = i-1;
            for (int j = i; j < arr.length; j++) {
                if (targetValue > arr[j]) {
                    targetValue = arr[j];
                    targetIdx = j;
                }
            }
            int temp = arr[i-1];
            arr[i-1] = arr[targetIdx];
            arr[targetIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
