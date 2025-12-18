public class CalculateProfit_Loss{
    public static void main(String args[]){
        int costPrice = 129;                // value given in the question
        int sellingPrice = 191;            // value given in the question
        int profit = sellingPrice - costPrice;
        System.out.println("Profit: "+profit);

        double profitPercent = (profit / (double)costPrice) * 100;     // calculating profit percentage
        System.out.printf("Profit Percentage: %.2f", profitPercent);
       
    }
}