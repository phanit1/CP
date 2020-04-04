import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=br.readLine())!=null) {
            int H1=(s.charAt(0)-'0')*10+(s.charAt(1)-'0');
            int M1=(s.charAt(2)-'0')*10+(s.charAt(3)-'0');
            int S1=(s.charAt(4)-'0')*10+(s.charAt(5)-'0');
            int C1=(s.charAt(6)-'0')*10+(s.charAt(7)-'0');

            BigDecimal timeInC=BigDecimal.valueOf(H1*60*60*100+ M1*60*100 + S1*100 + C1);
            BigDecimal dayInC=BigDecimal.valueOf(24*60*60*100.0);
            BigDecimal ans=timeInC.divide(dayInC, new MathContext(10)).multiply(BigDecimal.valueOf(10*100*100*100));
            System.out.printf("%07d\n", Long.parseLong(ans.toBigInteger().toString()));
        }
    }
}