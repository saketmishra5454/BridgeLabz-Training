package collections.product_inventory_system;

class Product {

    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
}
