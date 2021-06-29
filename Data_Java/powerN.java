import java.util.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class powerN {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();

        // int powLinear = powerOfN(n, p);
        // System.out.println("Linear time power:- "+powLinear);

        int powLog = powerOfNLog(n, p);
        System.out.println("Logarithmic time power:- "+powLog);

        int powLinear = powerOfN(n, p);
        System.out.println("Linear time power:- "+powLinear);
    }    
    public static int powerOfN(int n, int p){
        if(p == 0){
            return 1;
        }
        return n * powerOfN(n, p-1);
    }
    
    public static int powerOfNLog(int n, int p){
        if(p == 0){
            return 1;
        }
        int power = powerOfNLog(n, p/2);
        int total = power*power;
        if(p % 2 == 1){
            total = n * total;
        }
        return total;
    }

}
