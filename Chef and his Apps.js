import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int S = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            int free = S - (X + Y);
            
            if (free >= Z) {
                System.out.println(0);
            } 
            else if (free + Math.max(X, Y) >= Z) {
                System.out.println(1);
            } 
            else {
                System.out.println(2);
            }
        }
    }
}
