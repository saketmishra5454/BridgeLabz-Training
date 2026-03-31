package food_delivering_ordersystem;

import java.util.*;

public class DeliveryService {

    private Queue<Order> orderQueue = new LinkedList<>();

    public void receiveOrder(Order order) {
        orderQueue.add(order);
    }

    private List<Agent> agentList = new ArrayList<>();

    public void registerAgent(Agent agent) {
     //   System.out.println("Registered Agent: " + agent.getAgentName() + " | Available: " + agent.isAvailable());
        agentList.add(agent);
    }

    public String assignOrder() throws NoAgentAvailableException {
        if (orderQueue.isEmpty()) {
            return "No orders to process";
        }

        Agent availableAgent = null;

        for (Agent a : agentList) {
            if (a.isAvailable()==true) {
                availableAgent = a;
                break;
            }
        }
        if (availableAgent == null) {
            throw new NoAgentAvailableException("Assignment ;Failed: No free agents at the moment.");

        }

        Order currentOrder = orderQueue.poll();
        availableAgent.setAvailable(false);

        return "Order " + currentOrder.getOrderId() + "assigned to " + availableAgent.getAgentName();

    }


    public void completeDelivery(String agentId){

        for(Agent a: agentList){
            if(a.getAgentId().equals(agentId)){
                a.setAvailable(true);
            }
        }
        System.out.println("Agent Id " + agentId + " not found.");
    }









    //Getter and Setter

    public Queue<Order> getOrderQueue() {
        return orderQueue;
    }

    public List<Agent> getAgentList(){
        return agentList;
    }


}
