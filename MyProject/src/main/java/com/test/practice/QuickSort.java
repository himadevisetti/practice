package com.test.practice;

public class QuickSort {

	public static void quickSort(int[] arr, int begin, int end) {

		if (begin < end) {

			int partitionIndex = partition(arr, begin, end);
			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
			
		}
	}

	public static int partition(int[] arr, int begin, int end) {

		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		quickSort(input, 0, input.length - 1);

		for (int k = 0; k < input.length; k++) {
			System.out.print(input[k] + " ");
		}

	}

}
