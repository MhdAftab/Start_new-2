import java.util.*;

public class TowerOfHanoi {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // number of disks
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        TOH(n, n1, n2, n3);
    }
    public static void TOH(int n, int sor, int des, int helper){
        if(n == 0){
            return;
        }

        TOH(n-1, sor, helper, des);
        System.out.println(n + "[" + sor + " -> " + des + "]");
        TOH(n-1, helper, des, sor);
    }
} 
