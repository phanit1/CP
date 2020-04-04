import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
        String a = scan.nextLine();
        String[] arr = a.split(" ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr[i].length()-1; j>=0;j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    }
}