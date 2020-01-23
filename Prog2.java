import java.util.Scanner;

public class Prog2 {
    public static int seq(int a, int b) {
        int count = 0;
            
        for(int n = a; n < b; n++) {
            int x = n;
            int c = 0;
            while(x != 1) {
                
                if(x % 2 == 0) {
                    x = x/2;
                    // System.out.print(n + " ");
                    c++;
                }
                else {
                    x  = (3*x) + 1;
                    // System.out.print(n + " ");
                    c++;
                }
                
                if(count < c) {
                    count = c;
                }
            }
            

    }
    return count;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int n = 22;
        while(scan.hasNextLine()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a > 0 || a < 100000 || b > 0 || b < 100000) {
            // System.out.println(n);
            if(a<b){
                
                System.out.println(a+" "+b+" "+(seq(a,b)+1));

            }
                else {
                    System.out.println(a+" "+b+" "+(seq(b,a)+1));

                }
     
    // scan.close(); 
        }
        }
}
}
