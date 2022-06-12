package sliding_window;

/*Вам дан массив, prices где указана prices[i]цена данной акции в день. i th
Вы хотите максимизировать свою прибыль, выбрав один день для покупки одной акции и выбрав другой день в будущем для продажи этой акции.
Верните максимальную прибыль, которую вы можете получить от этой сделки. Если вы не можете получить какую-либо прибыль, верните 0.*/

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else {
                sell = Math.max(sell, price - buy);
            }
        }
        return sell;
    }
}
