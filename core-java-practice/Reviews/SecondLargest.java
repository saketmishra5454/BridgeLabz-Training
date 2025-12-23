import java.util.Scanner;
public class secondLargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0){
                System.out.println("Plz Enter the valid Positive Value");
                break;
            }
            
        }
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
        
        int largest = 0;
       
        for(int num : arr){
            
            if(num>largest){
                largest = num;
            }
        }
        int secondLargest = 0;
        for(int nums : arr){
            if(nums > secondLargest && nums < largest){
                secondLargest = nums;
            }
        }
        System.out.println("Second Largest: "+ secondLargest);
    }
}
