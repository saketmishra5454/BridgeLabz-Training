
import java.util.Scanner;

public class ElementPresentQueries {
    public static int[] FrequencyArray(int[] array){        //function to create frequency array
        int[] Frequency = new int[100001];
        for (int i : array) {                  //count frequency of each element
            Frequency[i]++;
        }
        return Frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              //size of array
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {           //input elements
            Array[i] = sc.nextInt();
        }
        int[] frequency = FrequencyArray(Array);           //create frequency array
        System.out.println(" Enter the number of queries : ");
        int K = sc.nextInt();
        while(K>0){                                                      //process each query
            System.out.println("Enter the Element you want to search :");
            int q = sc.nextInt();
            if(frequency[q]>0){             //check if element is present
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            K--;
        }
    }
}
