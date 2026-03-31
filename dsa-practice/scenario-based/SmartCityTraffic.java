import java.util.LinkedList;
import java.util.Queue;

// 1. OOP: Encapsulating Vehicle Data
class Vehicle {
    String id;
    Vehicle next;

    public Vehicle(String id) {
        this.id = id;
    }
}

class TrafficManager {
    private Vehicle head = null;
    private Vehicle tail = null;
    private Queue<Vehicle> entryQueue;
    private int maxQueueCapacity;
    private int roundaboutCount = 0;

    public TrafficManager(int capacity) {
        this.entryQueue = new LinkedList<>();
        this.maxQueueCapacity = capacity;
    }

    // --- QUEUE OPERATIONS ---

    public void arriveAtGate(String carId) {
        if (entryQueue.size() >= maxQueueCapacity) {
            System.out.println(" Queue Overflow: Gate is full. " + carId + " must wait outside.");
            return;
        }
        entryQueue.add(new Vehicle(carId));
        System.out.println( carId + " is waiting in the entry queue.");
    }

    // --- CIRCULAR LINKED LIST OPERATIONS ---

    public void enterRoundabout() {
        if (entryQueue.isEmpty()) {
            System.out.println(" Queue Underflow: No cars waiting to enter.");
            return;
        }

        Vehicle newVehicle = entryQueue.poll();
        
        if (head == null) {
            head = newVehicle;
            tail = newVehicle;
            newVehicle.next = head; // Point to itself
        } else {
            tail.next = newVehicle;
            tail = newVehicle;
            tail.next = head; // Maintain circularity
        }
        roundaboutCount++;
        System.out.println(newVehicle.id + " has entered the roundabout.");
    }

    public void exitRoundabout(String carId) {
        if (head == null) {
            System.out.println("Empty Roundabout: No cars to remove.");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = tail;

        do {
            if (curr.id.equals(carId)) {
                if (head == tail) { // Only one car left
                    head = null;
                    tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = prev.next;
                    if (curr == tail) tail = prev;
                }
                roundaboutCount--;
                System.out.println( carId + " has exited the roundabout.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Car " + carId + " not found in the roundabout.");
    }

    public void displayState() {
        System.out.println("\n--- ROUNDABOUT STATE ---");
        if (head == null) {
            System.out.println("No cars in the circle.");
        } else {
            Vehicle temp = head;
            System.out.print("Flow: ");
            do {
                System.out.print("[" + temp.id + "] -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("(Back to " + head.id + ")");
        }
        System.out.println("Waiting in Queue: " + entryQueue.size() + " cars.");
        System.out.println("------------------------\n");
    }
}

// 3. Execution Main Class
public class SmartCityTraffic {
    public static void main(String[] args) {
        TrafficManager cityFlow = new TrafficManager(3); // Max 3 cars in queue

        // Simulate Traffic
        cityFlow.arriveAtGate("Car_A");
        cityFlow.arriveAtGate("Car_B");
        cityFlow.arriveAtGate("Car_C");
        cityFlow.arriveAtGate("Car_D"); // Should trigger Overflow

        cityFlow.enterRoundabout();
        cityFlow.enterRoundabout();
        cityFlow.displayState();

        cityFlow.exitRoundabout("Car_A");
        cityFlow.displayState();
    }
}