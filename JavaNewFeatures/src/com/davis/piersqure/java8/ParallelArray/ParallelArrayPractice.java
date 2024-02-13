package com.davis.piersqure.java8.ParallelArray;

import java.util.Arrays;

public class ParallelArrayPractice {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 7, 1, 0, 5, 8, 6, 3 };

		for (int value : arr) {
			System.out.print(value + " ");
		}
		Arrays.parallelSort(arr, 0, 4);
		System.out.println("\nArray after sorting from 0th index to 4th index.");
		for (int value : arr) {
			System.out.print(value + " ");
		}

	}

}
