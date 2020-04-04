import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(scan.hasNextLine()) {
            String text = scan.nextLine();;
                    
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '\"') {
                // count++;
                if(count%2 == 0) {
                    System.out.print("``");
                }
                else {
                    System.out.print("''");
                }
                count++;
            }
            else {
                System.out.print(text.charAt(i));
                }
            }
            System.out.print("\n");
        }
    }
}