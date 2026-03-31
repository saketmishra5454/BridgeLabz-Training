package collections.online_store_ordersystem;

import java.util.*;

class OnlineStore {

    private Map<String, Customer> customers = new LinkedHashMap<>();

    public void addCustomer(String name) {
    	
    	// write logic
    	
    	Customer existing = customers.putIfAbsent(name,new Customer(name));
    	
    	if(existing == null) {
    		System.out.println("Customer Added Successfully");
    	}
    	else {
    		System.out.println("Customer Already Exists");
    	}
    }
    
    public void removeCustomer(String name) {
    	Customer removedCustomer = customers.remove(name);
    	
    	if(removedCustomer!=null) {
    		System.out.println("Customer Removed Successfully");
    	}
    	else {
    		System.out.println("Customer not found");
    	}
    }

    public void addOrder(String name, double amount) {
        // write logic
    	Customer customer = customers.get(name);
    	if(customer == null){
    	    System.out.println("Customer not found");
    	    return;
    	    
    	}
    	else{
    	    customer.getOrders().add(amount);
    	    
    	    System.out.println("Amount Added Successfully");
    	}
    }

    public void calculateTotalSpending(String name) {
        // write logic
        Customer customer = customers.get(name);
        if(customer == null){
            System.out.println("Customer not Found");
            return;
        }
        
        List<Double> spend = customer.getOrders();
        
        if(spend.isEmpty()){
            System.out.println("No Order Yet");
            return;
        }
        double total = 0;
        
        for(double am : spend){
            total+=am;
        }
        
        double totalSpend = total;
        
        System.out.println("Total Spend by "+ customer.getName() + " is: "+totalSpend);
        
    }

    public void findTopSpender() {
        // write logic
        if(customers.isEmpty()){
            System.out.println("No Customer is Available");
            return;
        }
        
        double maxSpend = 0;
        String topSpender = null;
         
        for(Map.Entry<String,Customer> entry : customers.entrySet()){
            Customer customer = entry.getValue();
            
            List<Double> spend = customer.getOrders();
            if(spend.isEmpty()){
                System.out.println("No Customer is Available");
                return;
            }
            
            double sum = 0;
            for(double sp : spend){
                sum+=sp;
            }
            double totalSpen = sum;
            
            if(totalSpen>maxSpend){
                maxSpend = totalSpen;
                topSpender = customer.getName();
            }
            if(topSpender != null){
                System.out.println("The Top Spender is: "+ topSpender);
                System.out.println("With the TotalSpend: "+maxSpend);
            }
            else{
                System.out.println("No Spender is found");
            }
        }
    }

    public void displayCustomers() {
        // write logic
        
        for(Customer custom : customers.values()){
            
            System.out.println("Customer Name: "+ custom.getName());
            System.out.println("Total Spend: "+ custom.getOrders());
          //  System.out.println("--------------------------------------------");
        }
    }
}