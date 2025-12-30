
import java.util.*;
public class LineComparisonProblem {
    public static void main(String[] args){
        //Welcome Message
        System.out.println("Hello, Welcome to the Comparison Computation Program");
         //UC1
        Double length1 = lengthOfLine1();
        System.out.println("Length of a Line1 is: "+length1);               //Calculating length of line 1

        Double length2 = lengthOfLine2();
        System.out.println("Length of a Line2 is: "+length2);                   //Calculating length of line 2

        System.out.println("==============================================================");
        System.out.println();

        //UC2
        LineCompareByEqual(length1, length2);
         System.out.println("==============================================================");
        System.out.println();

        //UC3
        int result = lineCompare(length1,length2);              //Comparing two lines
        if(result>0){
            System.out.println("The Line1 is GREATER than Line2.");
        }
        else if (result<0){
            System.out.println("The Line1 is SMALLER than Line2.");

        }
        System.out.println("==============================================================");
    


        }


    //This is the UC1
    //Taking input line 1
    public  static Double  lengthOfLine1(){
       System.out.println("----Enter the Co-ordinates of Line 1 Here----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 Co-ordinate of Line1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 Co-ordinate of Line1: ");
        int x2 = sc.nextInt();
               System.out.print("Enter y1 Co-ordinate of Line1: ");
        int y1 = sc.nextInt();
               System.out.print("Enter y2 Co-ordinate of Line1: ");
        int y2 = sc.nextInt();


            return Math.sqrt(                     //Calculating length of line
                Math.pow((x2 - x1), 2) +
                Math.pow((y2 - y1), 2));
    }

    //Taking input of line 2
    public static Double lengthOfLine2(){           //Calculating length of line 2
        System.out.println("----Enter the Co-ordinates of Line 2 Here----");
        Scanner sc = new Scanner(System.in);

          System.out.print("Enter x1 Co-ordinate of Line2: ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 Co-ordinate of Line2: ");
        int x2 = sc.nextInt();
               System.out.print("Enter y1 Co-ordinate of Line2: ");
        int y1 = sc.nextInt();
               System.out.print("Enter y2 Co-ordinate of Line2: ");
        int y2 = sc.nextInt();

        return Math.sqrt                 //Calculating length of line
        (Math.pow((x2 - x1), 2) +
           Math.pow((y2 - y1), 2));
        

    }
// UC@
    public static void LineCompareByEqual(Double lengthOfLine1, Double lengthOFLine2){

        if(lengthOfLine1.equals(lengthOFLine2)){                               //Comparing two lines for equality
            System.out.println("YES, The length of Line1 and Line2 are Equal.");
        }
        else{
            System.out.println("No, The length of Line1 and Line2 are Not Equal.");

        }

    }
    //UC3 
    public static int lineCompare(Double lengthOfLine1, Double lengthOFLine2){           //Comparing two lines
        return lengthOfLine1.compareTo(lengthOFLine2);
            
        
    }
    

}