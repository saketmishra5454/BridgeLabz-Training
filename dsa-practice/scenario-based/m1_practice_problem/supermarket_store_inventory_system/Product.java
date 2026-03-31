 package collections.supermarket_store_inventory_system;

import java.util.Objects;

public abstract class Product {
	private String name;
	private double price;
	private int quantity;
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
//	@Override
//	public String toString() {
//		return "Product [name=" + name + ", price=" + price + 
//				", quantity=" + quantity + "]";
//	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}
	
	
}

class Electronics extends Product{
	
	private String name;
	private double price;
	private int quantity;
	private int warranty;
	
	public Electronics(String name, double price,int quantity, int warranty) {
		super(name,price,quantity);
		this.warranty = warranty;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public void setPrice(double price) {
		this.price = price;
	}

	

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

//	@Override
//	public String toString() {
//		return super.toString() +
//				"Warranty " + warranty;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name, price, quantity, warranty);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electronics other = (Electronics) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& warranty == other.warranty;
	}
	
	
	
}

class Clothing extends Product{
	
	private String name;
	private double price;
	private int quantity;
	private String size;
	
	public Clothing(String name, double price,int quantity, String size) {
		super(name,price,quantity);
		this.size = size;
		
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public void setPrice(double price) {
		this.price = price;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

//	@Override
//	public String toString() {
//		return super.toString()
//				+ "Size : " + size;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, quantity, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clothing other = (Clothing) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& Objects.equals(size, other.size);
	}
	
}
