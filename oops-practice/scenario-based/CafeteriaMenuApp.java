import java.util.Scanner;

public class CafeteriaMenuApp {

    // storing cafeteria items
    static String[] menuItems = {
        "Idli","Dosa","Vada","Poha","Upma","Sandwich","Burger","Pasta","Tea","Coffee"};

    // method to display menu items
    static void displayMenu() {

        System.out.println("Cafeteria Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(i + ". " + menuItems[i]);
        }
    }

    // method to get item using index
    static String getItemByIndex(int index) {

        // checking index range
        if (index >= 0 && index < menuItems.length) {
            return menuItems[index];
        } else {
            return "Invalid item selected";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // show menu
        displayMenu();

        System.out.print("\nEnter item index to order: ");
        int choice = sc.nextInt();

        // get selected item
        String selectedItem = getItemByIndex(choice);

        System.out.println("You selected: " + selectedItem);

        sc.close();
    }
}
