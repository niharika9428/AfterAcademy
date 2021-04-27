package com.questions.iteration;

public class RotateMatrix {

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3 ,4}, { 5, 6,7,8 }, { 9,10,11,12 } ,{ 13,14,15,16 } };
		print(matrix);
		System.out.println("========================Rotated========================");
		rotate(matrix);
		print(matrix);
	}

	public static void print(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void rotate(int matrix[][]) {
		int temp = 0;
		// Transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// Reverse
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length / 2; j++) {
				temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
				matrix[i][matrix[0].length - 1 - j] = temp;
			}
		}

	}

}
