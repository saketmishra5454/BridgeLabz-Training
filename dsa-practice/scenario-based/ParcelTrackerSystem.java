// Node class represents each stage of parcel delivery
class StageNode {
    String stageName;   // name of current stage
    StageNode next;     // pointer to next stage

    public StageNode(String stageName) {
        this.stageName = stageName;
        this.next = null; // by default no next linked stage
    }
}

// Class to manage parcel delivery tracking
class ParcelTracker {
    StageNode head; // this will point to first stage (like Packed)

    // initializing default stages
    public ParcelTracker() {
        // creating the default delivery chain
        head = new StageNode("Packed");
        StageNode shipped = new StageNode("Shipped");
        StageNode inTransit = new StageNode("In Transit");
        StageNode delivered = new StageNode("Delivered");

        // linking nodes (forming singly linked list)
        head.next = shipped;
        shipped.next = inTransit;
        inTransit.next = delivered;

        // delivered.next = null automatically, means this is end
    }

    // Method to add custom checkpoint between two known stages
    
    public void addCheckpoint(String existingStage, String newStage) {
        StageNode temp = head;

        // searching the existing stage node
        while (temp != null) {
            if (temp.stageName.equals(existingStage)) {
                // found the matching stage
                StageNode newNode = new StageNode(newStage);

                // inserting new node after found stage
                newNode.next = temp.next;
                temp.next = newNode;

                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            temp = temp.next; // move to next node
        }

        System.out.println("Existing stage not found, checkpoint not added!");
    }

    // Method to track parcel forward through chain (like forward traversal in SLL)
    public void trackParcel() {
        StageNode temp = head;

        System.out.println("\nTracking Parcel:");
        while (temp != null) {
            System.out.println("Stage: " + temp.stageName);
            temp = temp.next; // move forward through linked list
        }
    }

    // Method to simulate lost/missing parcel by setting next as null 
    public void markLost(String stage) {
        StageNode temp = head;

        // searching stage where parcel got lost
        while (temp != null) {
            if (temp.stageName.equals(stage)) {
                // break chain here
                temp.next = null;
                System.out.println("\nParcel lost after stage: " + stage);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found! Cannot mark lost.");
    }
}

// Main class to test everything like a student
public class ParcelTrackerSystem {
    public static void main(String[] args) {

        // creating parcel tracker object
        ParcelTracker parcel = new ParcelTracker();

        // tracking initial default stages
        parcel.trackParcel();

        // adding custom intermediate checkpoint
        parcel.addCheckpoint("Shipped", "At Warehouse");
        parcel.trackParcel(); // tracking again to see new checkpoint

        // marking parcel lost
        parcel.markLost("In Transit");

        // tracking again to show missing node scenario
        parcel.trackParcel(); 
    }
}
