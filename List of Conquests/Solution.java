import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] countries = new String[n];
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < n; i++) {
            countries[i] = scan.next();
            set.add(countries[i]);
            String strr = scan.nextLine();
        }
        Arrays.sort(countries);
        String[] stt =set.toArray(new String[set.size()]);
        Arrays.sort(stt);
        for(int i = 0; i < stt.length; i++) {
            int c = 0;
            for(int j = 0; j < n; j++) {
                if(stt[i].equals(countries[j])) {
                    c++;
                }
            }
            System.out.println(stt[i]+" "+c);
        }
    }
}