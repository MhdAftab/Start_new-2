import java.util.*;

public class getKPC {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        //System.out.println(KPC(str));
        KPCUP(str, "");
    }

    static String keypad[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> KPC(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base; 
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> list = KPC(ros);

        int idx = ch - '0';
        String word = keypad[idx];

        ArrayList<String> myList = new ArrayList<String>();
        for(int i=0; i<word.length(); i++){
            char letter = word.charAt(i);
            for(String res: list){
                myList.add(letter+res);
            }
        }
        return myList; 
    }

    public static void KPCUP(String str, String asf){
        if(str.length() == 0){
            System.out.print(asf+"  ");
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        int idx = ch - '0';
        String ans = keypad[idx];
        for(int i=0; i<ans.length(); i++){
            KPCUP(ros, asf+ans.charAt(i));
        }
    }
}
