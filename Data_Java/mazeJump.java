import java.util.*;

public class mazeJump{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nrows = scn.nextInt();
        int ncols = scn.nextInt();

        // ArrayList<String> paths = mazejumpN(0,0,nrows-1, ncols-1);
        // System.out.println(paths);
        mazejumpUP(0,0,nrows-1, ncols-1, "");
    }

    public static ArrayList<String> mazejumpN(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        ArrayList<String> mylist = new ArrayList<String>();

        // Horizontal Move
        for(int i=1; i<=dc-sc; i++){
            ArrayList<String> hmoves = mazejumpN(sr, sc+i, dr, dc);
            for(String hp: hmoves){
                mylist.add("h"+i+hp);
            }
        }

        // Vertical Moves
        for(int i=1; i<=dr-sr; i++){
            ArrayList<String> vmoves = mazejumpN(sr+i, sc, dr, dc);
            for(String vp: vmoves){
                mylist.add("v"+i+vp);
            }
        }

        //Diagonal Moves
        for(int i=1; i<=dr - sr && i<=dc - sc; i++){
            ArrayList<String> dmoves = mazejumpN(sr+i, sc+i, dr, dc);
            for(String dp: dmoves){
                mylist.add("d"+i+dp);
            }
        }

        return mylist;
    }

    public static void mazejumpUP(int sr, int sc, int dr, int dc, String asf){
        if(sr == dr && sc == dc){
            System.out.println(asf);
            return;
        }
        // Horizontal move
        for(int i=1; i<=dc-sc; i++){
            mazejumpUP(sr, sc+i, dr, dc, asf+"h"+i);
        }

        // Vertical move
        for(int i=1; i<=dr-sr; i++){
            mazejumpUP(sr+i, sc, dr, dc, asf+"v"+i);
        }

        // Diagonal move
        for(int i=1; i<=dr-sr && i<= dc-sc; i++){
            mazejumpUP(sr+i, sc+i, dr, dc, asf+"d"+i);
        }
    }
}