import java.io.*;
import java.util.*;

public class input {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        // ArrayList < String > mylist = gss(str);
        // System.out.println(mylist);
        gssUP(str, "");
    }

    public static ArrayList < String > gss(String str) {
        if (str.length() == 0) {
            ArrayList < String > base = new ArrayList < String > ();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList < String > list = gss(ros);
        ArrayList < String > mylist = new ArrayList < String > ();

        for (String s: list) {
            mylist.add(s);
        }
        for (String s: list) {
            mylist.add(ch + s);
        }
        return mylist;
    }

    public static void gssUP(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        //include
        gssUP(ros, asf+ch);

        // not includeg
        gssUP(ros, asf);
    }
}