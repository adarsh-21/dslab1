import java.util.Scanner;

class occurences
{
    static void countOccurrences(int arr[], int n, int x)
    {
       
        int i;
        for (i=0; i<n; i++)
            if (x == arr[i])
                System.out.println(i);
    }

    public static void main(String args[])
    {   Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = S.nextInt();
        }
        System.out.println("Enter the element you want to find");
        int x = S.nextInt();
        System.out.println("The element occurred at the following indexes:");
        countOccurrences(arr, n, x);
    }
} 
