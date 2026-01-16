
import java.util.Scanner;

public class SortEmployeeId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        //array of length n
        int [] arr= new int[n];
        //taking input of element of array
        for(int i=0;i<n;i++){
            System.out.println("enter Id of employee "+(i+1));
            arr[i]=sc.nextInt();
        }
        int[] sortedId=insertionSort(arr);
        for(int s:sortedId){
            System.out.print(s +" ");

        }
    }
    //method to sort employeeId
   static int[]  insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=key;
        }
        return arr;
    }

}
