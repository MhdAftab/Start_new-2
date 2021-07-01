import java.util.*;

import jdk.internal.jshell.tool.resources.l10n;

class isPrime{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        isPrimeON(n); // O(N) approach
        isPrimeNB2(n); // O(N/2) approach (More efficient) 
        isPrimesqrt(n); // O(n^(1/2)) approach 
    }
    public static void isPrimeON(int n){
        int flag = 1;
        // Loop from 2 till N
        for(int i=2; i<n; i++){
            if(n % i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }

    public static void isPrimeNB2(int n){
        int flag = 1;
        // Loop from 2 till N/2 
        // As after N/2 there will be no number which can divide N
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
    public static void isPrimesqrt(int n){
        int flag = 1;
        // Loop from 2 till sqrt(n)
        // from simple onservation -> the smallest and greater than one factor of a number cannot be more than the sqrt of N
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
}