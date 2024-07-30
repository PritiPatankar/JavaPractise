package Collections.Hashmap;
import java.util.HashMap;


import java.util.*;

public class HashMapPractise {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, String> HashMapData = new HashMap<Integer, String>();
    void getData(){
        System.out.println("Enter number of pairs you want to enter: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter Key and Value Pair " + (i+1) + ":");
            HashMapData.put(sc.nextInt(), sc.next());
        }
    }

    void printData(){
        Iterator<Map.Entry<Integer, String>> MapEntry = HashMapData.entrySet().iterator();
        int counter =1;
        while(MapEntry.hasNext()){
            Map.Entry<Integer, String> Entry = MapEntry.next();
            System.out.println("Key and Value Pair "+ counter +":");
            System.out.println("Key: "+Entry.getKey());
            System.out.println("Value: "+Entry.getValue());
            counter++;
        }
    }

    public static void main(String[] args){
        HashMapPractise H = new HashMapPractise();
        H.getData();
        H.printData();
    }



}
