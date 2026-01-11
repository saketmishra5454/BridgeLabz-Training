import java.util.ArrayList;

// Node representing a User
class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friends;   // stores friend user IDs
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

// Singly Linked List System
class SocialMedia {

    private UserNode head = null;

    // Add new user to list
    public void addUser(int id, String name, int age) {
        UserNode newNode = new UserNode(id, name, age);

        if (head == null) {
            head = newNode;
            return;
        }

        UserNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Search user by ID
    public UserNode searchById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by Name
    public void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("User not found with name: " + name);
    }

    // Add friend connection
    public void addFriendConnection(int user1Id, int user2Id) {
        UserNode u1 = searchById(user1Id);
        UserNode u2 = searchById(user2Id);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        if (!u1.friends.contains(user2Id)) u1.friends.add(user2Id);
        if (!u2.friends.contains(user1Id)) u2.friends.add(user1Id);

        System.out.println("Friend connection added between " + u1.name + " & " + u2.name);
    }

    // Remove friend connection
    public void removeFriendConnection(int user1Id, int user2Id) {
        UserNode u1 = searchById(user1Id);
        UserNode u2 = searchById(user2Id);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found!");
            return;
        }

        u1.friends.remove(Integer.valueOf(user2Id));
        u2.friends.remove(Integer.valueOf(user1Id));

        System.out.println("Friend connection removed between " + u1.name + " & " + u2.name);
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode u = searchById(userId);
        if (u == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.println("Friends of " + u.name + ":");
        if (u.friends.isEmpty()) {
            System.out.println("No Friends!");
            return;
        }

        for (int fid : u.friends) {
            UserNode friend = searchById(fid);
            System.out.println("- " + friend.name + " (ID: " + friend.userId + ")");
        }
    }

    // Mutual friends
    public void mutualFriends(int user1Id, int user2Id) {
        UserNode u1 = searchById(user1Id);
        UserNode u2 = searchById(user2Id);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.println("Mutual Friends between " + u1.name + " & " + u2.name + ":");

        boolean found = false;
        for (int f1 : u1.friends) {
            if (u2.friends.contains(f1)) {
                UserNode friend = searchById(f1);
                System.out.println("- " + friend.name + " (ID: " + friend.userId + ")");
                found = true;
            }
        }

        if (!found) System.out.println("No mutual friends!");
    }

    // Display user details (helper)
    private void displayUser(UserNode u) {
        System.out.println("User ID: " + u.userId);
        System.out.println("Name   : " + u.name);
        System.out.println("Age    : " + u.age);
        System.out.println("Friends Count: " + u.friends.size());
        System.out.println("--------------------");
    }

    // Count friends for each user
    public void countFriendsForAll() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }
}

// Main class for testing
public class SocialMediaConnections {
    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        // Adding users
        sm.addUser(1, "Alice", 21);
        sm.addUser(2, "Bob", 23);
        sm.addUser(3, "Charlie", 22);
        sm.addUser(4, "David", 20);

        // Friend connections
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        System.out.println();
        sm.displayFriends(1);
        System.out.println();
        sm.displayFriends(2);

        System.out.println();
        sm.mutualFriends(1, 2);

        System.out.println();
        sm.searchByName("Charlie");

        System.out.println();
        sm.removeFriendConnection(1, 3);
        sm.displayFriends(1);

        System.out.println();
        sm.countFriendsForAll();
    }
}
