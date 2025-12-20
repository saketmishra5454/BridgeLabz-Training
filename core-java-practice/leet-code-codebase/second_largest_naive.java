import java.util.Scanner;

public class second_largest_naive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, Enter the value of array size(n):");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Please, Enter the elements of array:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }
        //int largest = getlargest(arr);
        second_largest_naive obj = new second_largest_naive();
        //int largest = obj.getlargest(arr);
        System.out.println("The largest Element in the array is "+arr[obj.getlargest(arr)]);
        System.out.println("At the index of "+ obj.getlargest(arr));
        System.out.println("The Second largest Element is "+arr[obj.secondlargest(arr)]);
        System.out.println("At the index of "+obj.secondlargest(arr));
    }

    int secondlargest(int arr[])
    {
        int n = arr.length;
        int largest = getlargest(arr);
        int res = -1;
        for(int i = 0 ; i<n ; i++){                    //{5,20,12,20,8}
            if(arr[i] != arr[largest])
            {
                if(res == -1)
                res = i;
                else if (arr[i] > arr[res])          //20>12
                res = i;
            }
        }
        return res;
    }

    int getlargest(int arr[])
    {
        int n = arr.length;
        int largest = 0;
        for(int i = 1 ; i < n ; i++){
            if (arr[i] > arr[largest])
            {
                largest = i;
            }
        }
        //System.out.println("The index of largest element is "+ largest);
        return largest;
    }
    
}


    

