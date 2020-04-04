import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String s = scan.nextLine();
            String[] ss = s.split(" ");
            Double h = Double.parseDouble(ss[0]);
            Double u = Double.parseDouble(ss[1]);
            Double d = Double.parseDouble(ss[2]);
            Double f = Double.parseDouble(ss[3]);
            // System.out.println(h+" "+u+" "+d+" "+f);
            int day = 0;
            double afterSliding = 0.0;
            double heightAfterClimbing = 0.0;
            double distanceClimbed = u;
            double fatigueFactor = (u*f)/100;
            boolean Start = true;
            double initHeight = 0.0;
            if(h == 0 || u == 0 ||  d == 0 || f ==0) {
                break;
            }
            while(true){
                day++;
                
                
                initHeight = afterSliding;
                if(distanceClimbed < 0){
                    Start = false;
                    break;
                }
                // distanceClimbed = distanceClimbed - fatigueFactor;
                heightAfterClimbing = initHeight + distanceClimbed;
                if(heightAfterClimbing > h){
                    break;
                }
                afterSliding = heightAfterClimbing - d;
                if(afterSliding < 0){
                    Start = false;
                    break;
                }
                distanceClimbed = distanceClimbed - fatigueFactor;
                

            }
                if(Start) {
                    System.out.println("success on day "+day);
                    // break;
                }
                else{
                   System.out.println("failure on day "+day);
                   // break;
                }
            }
          
    }
}