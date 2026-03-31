package collections.M1_Practice.set1.product_price_history_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class PriceVersion {

    String version;
    int price;

    public PriceVersion(String version, int price){
        this.version = version;
        this.price = price;
    }
}

public class ProductHistory {

    static Map<String, List<PriceVersion>> priceMap = new HashMap<>();

    public static void updatePrice(String product, String version, int price){

        // add version
    	priceMap.putIfAbsent(product, new ArrayList<>());
    	
    	List<PriceVersion> pro = priceMap.get(product);
    	
    	for(PriceVersion p : pro) {
    		if(p.version.equals(version)) {
    			return;
    		}
    	}
   
        pro.add(new PriceVersion(version,price));
    		
    }

    public static void priceHistory(String product){

        // sort and print
    	if(!priceMap.containsKey(product)) {
    		System.out.println("Product Not Found");
    		return;
    	}
    	
    	List<PriceVersion> pro = new ArrayList<>(priceMap.get(product));
    	
//    	List<PriceVersion> sortin = pro.stream().sorted((a,b)->{
//    		if(a.price!=b.price) {
//    			return a.price-b.price;
//    		}
//    		
//    		return a.version.compareTo(b.version);
//    	} ).collect(Collectors.toList());
//    	
//    	for(PriceVersion p : sortin) {
//    		System.out.println(product+ " "+ p.version+" "+p.price);
//    	}
    	
    	Collections.sort(pro,(a,b)->{
    		if(a.price != b.price) {
    			return a.price-b.price;
    		}
    		
    		return a.version.compareTo(b.version);
    	});
    	
    	for(PriceVersion p : pro) {
   		System.out.println(product+ " "+ p.version+" "+p.price);
    	}    	
    }

    public static void latestPrice(String product){

        // get last version
    	if(!priceMap.containsKey(product)) {
    		System.out.println("Product Not Found");
    		return;
    	}
    	List<PriceVersion> price = priceMap.get(product);
    	PriceVersion latest = price.get(price.size()-1);
    	
		System.out.println(product+ " "+ latest.version+" "+latest.price);
    	
    }

    public static void totalPrice(String product){

        // sum prices
    	
    	if(!priceMap.containsKey(product)) {
    		System.out.println("Product Not Found");
    		return;
    	}
    	
    	List<PriceVersion> pro = priceMap.get(product);
    	int sum = 0;
    	for(PriceVersion p : pro) {
    		
    		sum += p.price;
    		
    	}
    	
    	System.out.println(product+" "+sum);
    	
    	
    }
    
    public static void main(String[] args) {
    	System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n;i++) {
			String input = sc.nextLine();
			
			String[] data = input.split(" ");
			
			if(data[0].equals("UPDATE_PRICE")) {
				updatePrice(data[1],data[2],Integer.parseInt(data[3]));
			}
			
			else if(data[0].equals("PRICE_HISTORY")) {
				priceHistory(data[1]);
			}
			else if(data[0].equals("LATEST_PRICE")) {
				latestPrice(data[1]);
			}
			
			else if(data[0].equals("TOTAL_PRICE")) {
				totalPrice(data[1]);
			}
		}
	}
}