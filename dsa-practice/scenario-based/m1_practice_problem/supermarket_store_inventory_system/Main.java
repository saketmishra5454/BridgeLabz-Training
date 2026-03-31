package collections.supermarket_store_inventory_system;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter:");
		
		int n = sc.nextInt();
		Inventory inventory = new Inventory();
		sc.nextLine();
		
		for(int i = 0; i<n;i++) {
			String item = sc.nextLine();
			String[] data = item.split(", ");
			
			Product p = null;
			if(data[0].equals("Electronics")) {
				p = new Electronics(data[1], Double.parseDouble(data[2]),
						Integer.parseInt(data[3]), Integer.parseInt(data[4]));
			}
			
			else {
				p = new Clothing(data[1], Double.parseDouble(data[2]),
						Integer.parseInt(data[3]), data[4]);
			
			}
			
			inventory.addProduct(p);
		}
		
		inventory.display();
		
		inventory.calculateTotalValue();
		
	}

}
