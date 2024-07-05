package string;
import java.util.*;
public class StringMatcher {

    public static void main(String[] args) {
        String[] str1={"abc","ab","abc","bca"};
        String[] str2={"abc","ab","ca","acb","bca"};
        List<Integer> output = new ArrayList<>();
        for (String s2: str2){
            int count=0;
            for (String s1: str1){
                if(s1.equals(s2)){
                    count++;
                }
            }
            output.add(count);
        }
        System.out.println(output);

        
    }
    
}
