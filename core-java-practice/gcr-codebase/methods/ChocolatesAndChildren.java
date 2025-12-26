import java.util.*; 
public class ChocolatesAndChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of chocolates and number of children:");
        int chocolates = sc.nextInt();                // Input number of chocolates
        int children = sc.nextInt();              // Input number of children
        ChocolatesAndChildren obj = new ChocolatesAndChildren();                 // Create object of the class
        obj.distributeChocolates(chocolates, children);             // Method call to distribute chocolates
    
}

    public void distributeChocolates(int chocolates, int children) {       // Method to distribute chocolates among children
        int chocolatesPerChild = chocolates / children;        // Calculate chocolates per child
        int remainingChocolates = chocolates % children;       // Calculate remaining chocolates

        System.out.println("Chocolates per child: " + chocolatesPerChild);
        System.out.println("Remaining chocolates: " + remainingChocolates);
    }   

}

