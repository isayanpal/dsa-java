package Leetcode_qs;

//LC121

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int price : prices){
            if (price < minPrice){
                minPrice = price;

            }
            int profit = price - minPrice;

            if (profit > max_profit){
                max_profit = profit;
            }
        }
        return max_profit;
    }
}
