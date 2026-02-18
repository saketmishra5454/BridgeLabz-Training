package food_delivering_ordersystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();
        Scanner sc = new Scanner(System.in);

        // 1. Register Agents
        System.out.println("Enter number of agents:");
        int agentNum = Integer.parseInt(sc.nextLine()); // Safer than nextInt()

        System.out.println("Enter agents (Format -> Name:ID:Vehicle:true/false):");
        for (int i = 0; i < agentNum; i++) {
            String[] data = sc.nextLine().split(":");
            Agent a = new Agent(data[0], data[1], data[2], Boolean.parseBoolean(data[3].trim()));
            service.registerAgent(a);
        }

        // 2. Receive Orders
        System.out.println("Enter the number of Orders:");
        int orderNum = Integer.parseInt(sc.nextLine());

        System.out.println("Enter orders (Format -> ID:Customer:Address:Price):");
        for (int i = 0; i < orderNum; i++) {
            String[] details = sc.nextLine().split(":");
            Order o = new Order(details[0], details[1], details[2], Double.parseDouble(details[3]));
            service.receiveOrder(o);
        }

        // 3. Process
        System.out.println("\n--- Processing Assignments ---");
        for (int i = 0; i < orderNum; i++) {
            try {
                System.out.println(service.assignOrder());
            } catch (NoAgentAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
