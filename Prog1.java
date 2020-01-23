import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        //int[] arr2 = new int[arr.length];
        // for (int i = 0; i < arr.; i++) {
        //     arr[i] = scan.nextInt();
        // }
    //     int n = arr.length;
    //     for(int i = 0; i < arr.length; i++) {
    //         arr1[i] = arr[arr.length];
            
    //    }
    int n = arr.length;
    for (int i = 0; i < arr1.length; i++) {
        arr1[i] = arr[n-1];
        n--;
        //System.out.println(arr1[i]);
    }
    for (int i = 0; i < arr2.length - 1; i++) {
            arr2[i] = arr1[i];
            i++;
            arr2[i] = arr[n];
            n++;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    // for (int i = 0; i < arr.length/2; i++) {
    //     System.out.println(arr[arr.length-i-1]);
    //     System.out.println(arr[i]);
    // }
    }
}