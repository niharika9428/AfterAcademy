package com.questions.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveSort {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.addAll(Arrays.asList(5, 2, 9, 3, 2));
		System.out.println(nums);
		System.out.println("==============Wave Sort======================");
		nums = waveArray(nums);
		System.out.println(nums);
		int arr[] = { 5, 2, 9, 3, 2 };
		arr = waveArray(arr);

		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println(arr);
	}

	public static ArrayList<Integer> waveArray(ArrayList<Integer> arr) {

		if (arr == null || arr.size() == 0)
			return arr;
		int n = arr.size();
		for (int i = 1; i < n; i = i + 2) {
			System.out.println("i is " + i);
			if (arr.get(i) > arr.get(i - 1)) {
				Collections.swap(arr, i, i - 1);
			}

			if (i <= n - 2 && arr.get(i) > arr.get(i + 1)) {
				Collections.swap(arr, i, i + 1);
			}

		}

		return arr;
	}

	public static int[] waveArray(int[] arr) {

		if (arr == null || arr.length == 0)
			return arr;
		int n = arr.length;
		int temp = 0;
		for (int i = 1; i < n; i = i + 2) {
			System.out.println("i is " + i);
			if (arr[i] > arr[i - 1]) {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
			}

			if (i <= n - 2 && arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		}

		return arr;
	}
}
