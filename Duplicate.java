import java.util.Scanner;

public class Duplicate {
    static void DuplicateNumbers(int arr[], int n) {
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
         arr[i] = S.nextInt();
        }
        DuplicateNumbers(arr, n)

    }
}
