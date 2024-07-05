package Hashhh;
import java.util.*;
public class HashExp {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(101,"a");
        hm.put(102,"b");
        hm.put(103,"c");
        hm.put(102,"d");
        System.out.println(hm);
        System.out.println(hm.get(102));
        hm.replace(103,"e");
        System.out.println(hm);
        System.out.println(hm.containsKey(103));


    }
    
}

