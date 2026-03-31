import java.util.*;

// This class represents a single tab history node
// Using Doubly LinkedList so node has previous and next
class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    // Constructor for creating a new history entry
    public HistoryNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

// This class represents a browser tab and its operations
class BrowserTab {
    HistoryNode current; // pointer to current webpage in history

    // Constructor to initialize a tab with a first URL
    public BrowserTab(String url) {
        current = new HistoryNode(url);
    }

    // Visiting a new page means:
 
    public void visit(String url) {
        HistoryNode newPage = new HistoryNode(url);

        // breaking forward chain if exists
        current.next = null;

        // linking new page
        newPage.prev = current;
        current.next = newPage;

        // move current pointer to new page
        current = newPage;

        System.out.println("Visited: " + url);
    }

    // Back means move to previous node if possible
    public void goBack() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page!");
        }
    }

    // Forward means move to next node if possible
    public void goForward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page!");
        }
    }

    // Show current URL
    public void showCurrentPage() {
        System.out.println("Current Page: " + current.url);
    }
}

class Browser {
    Stack<BrowserTab> closedTabs; // stack to store closed tabs
    ArrayList<BrowserTab> openTabs; // simple list to store opened tabs

    public Browser() {
        closedTabs = new Stack<>();
        openTabs = new ArrayList<>();
    }

    // Opening new tab means create object and add to list
    public void openTab(String url) {
        BrowserTab tab = new BrowserTab(url);
        openTabs.add(tab);
        System.out.println("Opened new tab with: " + url);
    }

    // Closing tab means remove from open list and push into stack
    public void closeTab(int index) {
        if (index >= 0 && index < openTabs.size()) {
            BrowserTab tab = openTabs.remove(index);
            closedTabs.push(tab);
            System.out.println("Closed tab at index: " + index);
        } else {
            System.out.println("Invalid tab index!");
        }
    }

    // Restore last closed tab → pop from stack
    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            BrowserTab restored = closedTabs.pop();
            openTabs.add(restored);
            System.out.println("Restored recently closed tab!");
        } else {
            System.out.println("No closed tabs to restore!");
        }
    }

    // Show all open tabs
    public void showTabs() {
        System.out.println("\n--- Open Tabs ---");
        for (int i = 0; i < openTabs.size(); i++) {
            System.out.println("Tab " + i + ": (" + openTabs.get(i).current.url + ")");
        }
    }
}

// Main class (like a student testing the features)
public class BrowserBuddyTabHistoryManager{
    public static void main(String[] args) {

        // making browser object
        Browser browser = new Browser();

        // opening few tabs initially
        browser.openTab("google.com");
        browser.openTab("github.com");

        browser.showTabs();

        // working with first tab (index 0)
        BrowserTab tab1 = browser.openTabs.get(0);

        // visiting new pages in tab1
        tab1.visit("youtube.com");
        tab1.visit("stackoverflow.com");

        // performing back and forward operations
        tab1.goBack();       // should go to youtube
        tab1.goForward();    // forward to stackoverflow
        tab1.showCurrentPage();

        // closing second tab and restoring
        browser.closeTab(1);
        browser.restoreTab();

        browser.showTabs();
    }
}
