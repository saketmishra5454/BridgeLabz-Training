class TextState {       // Node for doubly linked list
    String content;
    TextState prev;
    TextState next;

    public TextState(String content) {          // Constructor
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {

    private TextState head = null;
    private TextState current = null;
    private int historyLimit = 10;
    private int size = 0;

    // Add new state
    public void addState(String text) {
        TextState newState = new TextState(text);

        // If it's the first state
        if (head == null) {
            head = current = newState;
            size = 1;
            return;
        }

        // If user typed after undo, remove redo history
        current.next = null;

        // Append at end
        newState.prev = current;
        current.next = newState;
        current = newState;

        size++;

        // Enforce history limit
        if (size > historyLimit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo moves to previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo moves to next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current state
    public void displayCurrent() {
        if (current == null) {
            System.out.println("(Empty Document)");
        } else {
            System.out.println("Current Text: \"" + current.content + "\"");
        }
    }
}

// Main class for testing
public class UndoRedoTextEditor {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! This");
        editor.addState("Hello World! This is");
        editor.addState("Hello World! This is Java");

        editor.displayCurrent(); // Should display the latest state
        System.out.println();

        editor.undo();
        editor.displayCurrent();        // Should display previous state

        editor.undo();
        editor.displayCurrent();

        System.out.println("\nRedo Test:");        // Redo Test
        editor.displayCurrent();

        System.out.println("\nAdd more states to exceed history limit:");
        editor.addState("New content 1");
        editor.addState("New content 2");
        editor.addState("New content 3");
        editor.addState("New content 4");
        editor.addState("New content 5");
        editor.addState("New content 6"); // will push old states out due to limit

        editor.displayCurrent();
    }
}
