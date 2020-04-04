import java.io.*;
import java.util.*;

public class Solution {
       public static int[] coins;

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIinput. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        for (int i=0;i<testCases;i++) {
            int N=Integer.parseInt(br.readLine());
            coins=new int [N];
            StringTokenizer st=new StringTokenizer(br.readLine());
            
            int sum=0;
            int index=1;
            for (int j=0;j<N;j++) {
                coins[j]=Integer.parseInt(st.nextToken());
                if (j>0) {
                    if (sum>=coins[j]) {
                        sum-=coins[j-1];
                        sum+=coins[j];
                    } else {
                        sum+=coins[j];
                        index++;
                    }
                } else {
                    sum=coins[j];
                }
            }
            System.out.println(index);
        }
    }
}