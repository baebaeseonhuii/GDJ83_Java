package com.seonhui.s1;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100000);
		}

		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));

	}

	private static void selectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int min = numbers[i];
			int indexOfMin = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (min > numbers[j]) {
					min = numbers[j];
					indexOfMin = j;
				}
			}
			swap(numbers, i, indexOfMin);

		}

	}

	private static void swap(int[] numbers, int a, int b) {
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;

	}

}
