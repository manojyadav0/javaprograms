package Hashhh;
import java.util.HashMap;

public class HashExp1 {
    public static void main(String[] args) {
        int n=3;
        String[] name =new String[n];
        long[] phno= new long[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            name[i] = sc.next()
        }System.out.println("enter phno's");
        for(int i=0; i<n; i++){
            phno[i] = sc.nextLong();
}
HashMap<String, Long> hm = new HashMap<>();
for(int i=0; i<n; i++){
    hm.put(name[i], phno[i]);
}
System.out.println(hm);

    }
    
}
