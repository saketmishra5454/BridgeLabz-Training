import java.util.Scanner;

class largest_element
{
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        //int m = arr.length;
        for (int i = 0 ; i < arr.length  ; i++){
            arr[i] = s. nextInt();
        }
        int max = 0;
        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println("Maximum element at index: "+max);
    }
}
