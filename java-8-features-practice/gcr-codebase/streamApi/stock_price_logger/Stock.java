package streamApi.stock_price_logger;

public class Stock {

    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return stockName + " -> ₹" + price;
    }
}