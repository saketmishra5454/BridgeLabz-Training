
import java.util.Scanner;

public class SortStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        //array of length n
        int [] arr= new int[n];
        //taking input of element of array
        for(int i=0;i<n;i++){
            System.out.println("enter marks of student no "+(i+1));
            arr[i]=sc.nextInt();
        }
        //calling sortmarks() method and storing result in array
        int[] sortedMarks=sortMarks(arr);
        //loop for displaying sorted marks
        for(int sort :sortedMarks){
            System.out.print(sort+" ");
        }
    }
    //method to sort array
    public static int[] sortMarks(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
