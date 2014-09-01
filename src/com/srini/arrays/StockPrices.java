package com.srini.arrays;

public class StockPrices {
	
	public static void main(String args[]){
		findMaxProfit(new int[]{12, 5, 9, 19});
	}
	
	public static int[] findMaxProfit(int[] stockPrices){
		if(stockPrices.length < 2){
			return null;
		}
		int localBuy = stockPrices[0];
		int globalSell = stockPrices[1];
		int localProfit = Integer.MIN_VALUE;
		int globalProfit = globalSell - localBuy;
		for(int i = 1; i < stockPrices.length; i++){
			localProfit = stockPrices[i] - localBuy;
			if(localBuy > stockPrices[i]){
				localBuy = stockPrices[i];
			}
			if(localProfit > globalProfit){
				globalProfit = localProfit;
				globalSell = stockPrices[i];
			}
		}
		return new int[]{globalSell - globalProfit, globalProfit};
	}
}
