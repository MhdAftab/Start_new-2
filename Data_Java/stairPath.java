import java.util.*;


public class stairPath {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // System.out.println("Reative Path:- ");
        // System.out.println(getStairPath(n));

        // System.out.println("ProAtive Path:- ");
        // System.out.println(getStairPathsProActive(n));
        stairPathUP(n, "");
    }

    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        if(n < 0){
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }

        //1 len move
        ArrayList<String> path1len = getStairPath(n-1);

        // 2 len move
        ArrayList<String> path2len = getStairPath(n-2);

        //3 len move
        ArrayList<String> path3len = getStairPath(n-3);

        ArrayList<String> mylist = new ArrayList<String>();

        for(String len1 : path1len){
            mylist.add(1 + len1);
        }

        for(String len2 : path2len){
            mylist.add(2 + len2);
        }

        for(String len3 : path3len){
            mylist.add(3 + len3);
        }

        return mylist;
    }

    public static ArrayList<String> getStairPathsProActive(int n){
        if(n == 0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> mylist = new ArrayList<String>();

        //1 len move
        if(n-1 >= 0){
            ArrayList<String> path1len = getStairPathsProActive(n-1);
            for(String len1 : path1len){
                mylist.add(1 + len1);
            }
        }
        // 2 len move
        if(n-2 >= 0){
            ArrayList<String> path2len = getStairPathsProActive(n-2);
            for(String len2 : path2len){
                mylist.add(2 + len2);
            }
        }
        
        //3 len move
        if(n-3 >= 0){
            ArrayList<String> path3len = getStairPathsProActive(n-3);
            for(String len3 : path3len){
                mylist.add(3 + len3);
            }
        }
        
        

        return mylist;
    }

    public static void stairPathUP(int n, String asf){
        if(n == 0){
            System.out.println(asf);
            return;
        }
        if(n-1 >= 0){
            stairPathUP(n-1, asf+1);
        }
        if(n-2 >= 0){
            stairPathUP(n-2, asf+2);
        }
        if(n-3 >= 0){
            stairPathUP(n-3, asf+3);
        }
    }
}
