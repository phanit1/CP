import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Character, Integer> map2 = new HashMap<>();

        map2.put('B', 1);
        map2.put('P', 1);
        map2.put('F', 1);
        map2.put('V', 1);
        map2.put('C', 2);
        map2.put('S', 2);
        map2.put('K', 2);
        map2.put('G', 2);
        map2.put('J', 2);
        map2.put('Q', 2);
        map2.put('X', 2);
        map2.put('Z', 2);
        map2.put('M', 5);
        map2.put('N', 5);
        map2.put('D', 3);
        map2.put('T', 3);
        map2.put('L', 4);
        map2.put('R', 6);
        ArrayList<Character> al = new ArrayList<>();
        al.add('A');
        al.add('E');
        al.add('I');
        al.add('O');
        al.add('U');
        al.add('Y');
        al.add('W');
        al.add('H');
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String name = sc.nextLine();
            String output1 = "";
            String output = "";
            output = name.substring(0,1);
            for(int il = 1; il < name.length(); il++) {
                char c1 = name.charAt(il);
                char c2 = name.charAt(il-1);
                if(al.contains(c1)) {

                }
                else if(map2.get(c1) != map2.get(c2)) {
                    output1 += map2.get(c1);
                }
            }
            output1 += "000";
            if(output1.length() > 3) {
                output1 = output1.substring(0, 3);
            }
            System.out.println(name+";"+output+output1);
        }
    }
}