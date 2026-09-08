class Solution {
    public int maxProfit(int[] prices) {
        int buyingprice=prices[0];
        int profit=0,maxprofit=0;
        for(int i=0;i<prices.length;i++){
            int sellingprice=prices[i];
            if(buyingprice<sellingprice){
                profit=sellingprice-buyingprice;
                maxprofit=Math.max(profit, maxprofit);
            }else{
                buyingprice=sellingprice;
            }
        }
        return maxprofit;
    }
}