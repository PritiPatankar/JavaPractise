package Collections.Hashmap;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;

public class searchHashmap {
    HashMap<Integer, String> HData = new HashMap<Integer,String>();
    Scanner sc = new Scanner(System.in);
    void getData(){
        System.out.println("Enter number of pairs you want to enter: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter Key and Value Pair " + (i+1) + ":");
            HData.put(sc.nextInt(), sc.next());
                        
            }
    }
    void SearchKey(){
        System.out.println("Enter the Key you want to search ");
	    int checkKey = sc.nextInt(); 
        boolean isPresent = false;
	    System.out.println("HashMap: " + HData); 
        Iterator<Map.Entry<Integer, String>> MapEntry = HData.entrySet().iterator();
        while(MapEntry.hasNext()){
                Map.Entry<Integer, String>  Entry = MapEntry.next();
                if(Entry.getKey()==checkKey){                 
                    isPresent = true;
                }
        }
        if(isPresent){
            System.out.println("Key present in Map");
        }
        else{
            System.out.println("Key is not present in Map");
        }

    }

    public static void main(String[] args){
        searchHashmap H = new searchHashmap();
        H.getData();
        H.SearchKey();
    }

}
