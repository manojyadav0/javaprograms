package array;

public class Toggle {
    public static void main(String[] args) {
        String input = "SuRenDar";
        char[] chars = input.toCharArray();
        for(int i=0; i<chars.length; i++){
            char c = chars[i];
            if(c>=65 && c<=91){
                chars[i] = (char)(c+32);
            }else(c>=97 && c<=122){
                char[i] = (char)(c-32);
            }
        }
        String output =new String(chars);
        System.out.println(output);

        
    }
    
}
