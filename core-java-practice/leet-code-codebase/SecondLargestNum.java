import java.util.Scanner;

public class SecondLargestNum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Plz, Enter the array size:");
        int n = s.nextInt();
        System.out.println("Now Please, Enter the Element of array:");
        int arr [] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }
        //secondlargest obj = new secondlargest();
        System.out.println("The Second largest Element is at the index of "+getsecondlargest(arr));
    }
    static int getsecondlargest(int arr[]){
        int n = arr.length;
        int res = -1 , largest = 0;
        for(int i = 1 ; i < n ; i++){
            //{5,20,12,20,8}
            if ( arr[i] > arr[largest])
            {
                res = largest;
                largest = i;
            }
            //res = 0 , largest = 1
            else if(arr[i] != arr[largest]){
                if(arr[i] == -1 || arr[i] > arr[res])
                res = i;
            }
        }
        return res;
    }
}