import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = 1;
        while(true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int capacity = Integer.parseInt(st.nextToken());
            if(n==0 && m==0 && capacity==0)
                break;
            boolean [] on = new boolean[n];
            int[] c = new int[n];
            for (int i = 0; i < c.length; i++) {
                c[i] = Integer.parseInt(br.readLine());
            }
            int cur = 0 , max = 0;
            boolean safe = true;
            for (int i = 0; i < m; i++) 
            {
                int x = Integer.parseInt(br.readLine())-1;
                if(on[x])
                {
                    on[x] = false;
                    cur -= c[x]; 
                }
                else
                {
                    on[x] = true;
                    cur += c[x];
                    max = Math.max(max, cur);
                    if(cur>capacity)
                        safe = false;
                }
            }
            System.out.print("Sequence "+cases++ +"\n");
            if(safe)
                System.out.print("Fuse was not blown.\nMaximal power consumption was "+max+" amperes.\n");
            else
                System.out.print("Fuse was blown.\n");
            System.out.print("\n");
        }
    }
}