import java.util.Scanner;

public class CountDistinctElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                     //size of array
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){               //input elements
            arr[i] = sc.nextInt();
        }
        System.out.println(countdigits(arr,n));           //function call to count distinct elements
    }

    public static int countdigits(int[]arr, int n){
        int count = 0 ; boolean isDistinct;
        for (int i = 0 ; i < n ; i++){
            isDistinct = true;
            for (int j = (i-1) ; j >= 0 ; j--){           //check if element is already present
                if (arr[i] == arr[j]){
                   isDistinct=false;          //if present mark isDistinct as false
                    break;
                }
            }
            if (isDistinct == true){               //if element is distinct increment count
                count++;
            }
        }
      return count;


    }
}
    

