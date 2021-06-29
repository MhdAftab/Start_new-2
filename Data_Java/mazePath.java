import java.util.*;


public class mazePath { 
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nrows = scn.nextInt();
        int ncols = scn.nextInt();

        //System.out.println(maze(0, 0, nrows-1, ncols-1));
        mazeUP(0,0, nrows-1, ncols-1, "");
    }
    public static ArrayList<String> maze(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        if(sr > dr || sc > dc){
            ArrayList<String> ivBase = new ArrayList<String>();
            return ivBase;
        }
        ArrayList<String> mylist = new ArrayList<String>();

        ArrayList<String> hmove = maze(sr, sc+1, dr, dc);
        for(String hm: hmove){
            mylist.add("h"+hm);
        }

        ArrayList<String> vmove = maze(sr+1, sc, dr, dc);
        for(String vm: vmove){
            mylist.add("v"+vm);
        }

        return mylist;

    }

    public static void mazeUP(int sr, int sc, int dr, int dc, String asf){
        if(sr == dr && sc == dc){
            System.out.println(asf);
            return;
        }
        if(sr > dr || sc > dc){
            return;
        }
        //Horizontal move
        mazeUP(sr, sc+1, dr, dc, asf+"h");
        //Vertical move
        mazeUP(sr+1, sc, dr, dc, asf+"v");
    }
}
 