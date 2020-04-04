import java.io.*;
import java.util.*;

public class Solution {

    public static void main(final String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        final Scanner scan = new Scanner(System.in);
        final String[] inp = scan.nextLine().split(" ");
        final int N = Integer.parseInt(inp[0]);
        final int R = Integer.parseInt(inp[1]);
        final HashMap<String, PhysicalAddress> map = new HashMap<String, PhysicalAddress>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(scan.nextLine());
            final String name = st.nextToken();
            final int ba = Integer.parseInt(st.nextToken());
            final int size = Integer.parseInt(st.nextToken());
            final int dimension = Integer.parseInt(st.nextToken());
            final int[] bound = new int[2 * dimension];
            for (int j = 0; j < bound.length; j++) {
                bound[j] = Integer.parseInt(st.nextToken());
            }
            final PhysicalAddress phy_arr = new PhysicalAddress(ba, size, dimension, bound);
            map.put(name, phy_arr);
        }
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(scan.nextLine());
            final String key = st.nextToken();
            final ArrayList<Integer> indexes = new ArrayList<>();
            while (st.hasMoreTokens()) {
                indexes.add(Integer.parseInt(st.nextToken()));
            }
            final PhysicalAddress obj = map.get(key);
            if (obj != null) {
                System.out.println(key + indexes + " = " + obj.getPhy(indexes));
            }
        }
    }
}

class PhysicalAddress {
    int[] C;

    PhysicalAddress(final int ba, final int size, final int dimension, final int[] b) {
        C = new int[dimension + 1];
        C[dimension] = size;
        for (int i = dimension - 1; i > 0; i--) {
            C[i] = C[i + 1] * (b[2 * i + 1] - b[2 * i] + 1);
        }
        C[0] = ba;
        for (int i = 1; i < dimension + 1; i++) {
            C[0] -= (C[i] * b[2 * i - 2]);
        }
    }

    public int getPhy(final ArrayList<Integer> lis) {
        int res = this.C[0];
        for(int i = 0; i < lis.size();i++) {
            res += this.C[i+1]*lis.get(i);
        }
        return res;
    }
    public String toString() {
        return Arrays.toString(this.C);
    }
}