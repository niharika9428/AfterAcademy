package com.questions.iteration;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		print(matrix);
		System.out.println("========================Spiral Order========================");
		List<Integer> nums = spiralOrder(matrix);
		System.out.println(nums);
	}

	public static void print(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> nums = new ArrayList<>();
		if (null == matrix || matrix.length == 0)
			return nums;

		int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length-1;
		int direction = 0;

		while (top <= bottom && left <= right) {

			if (direction == 0) {
				for (int i = left; i <= right; i++) {
					nums.add(matrix[top][i]);
				}
				top++;
			} else if (direction == 1) {
				for (int i = top; i <= bottom; i++) {
					nums.add(matrix[i][right]);
				}
				right--;
			} else if (direction == 2) {
				for (int i = right; i >= left; i--) {
					nums.add(matrix[bottom][i]);
				}
				bottom--;
			} else if (direction == 3) {
				for (int i = bottom; i >=top; i--) {
					nums.add(matrix[i][left]);
				}
				left++;
			}

			direction = (direction + 1) % 4;
		}
		return nums;

	}
	
}
