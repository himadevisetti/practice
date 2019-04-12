package com.test.practice;

public class MaxStockProfit {

	public static void getMaxProfit(int[] arr) {

		int i = 0, buy = 0, sell = 0, min=0, maxProfit = 0;

		buy = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (arr[i] < buy) {
				buy = arr[i];
				min = i; 
			}
			if (arr[i] > sell && i > min) {
				sell = arr[i];
			}
			if (sell > buy)
				maxProfit = sell - buy;
		}

		System.out.println("Buy stocks at " + buy + " and sell at " + sell + " to make a profit of " + maxProfit);
	}

	public static void main(String[] args) {

		int[] stockPrices = { 11, 10, 7, 5, 8, 10, 9 };
		getMaxProfit(stockPrices);

	}

}
