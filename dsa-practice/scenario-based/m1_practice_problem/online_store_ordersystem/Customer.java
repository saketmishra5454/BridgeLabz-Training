package collections.online_store_ordersystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;
	private List<Double> orders;
	
	public Customer(String name) {
		this.name = name;
		this.orders = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public List<Double> getOrders()
	{
		return orders;
	}

}
