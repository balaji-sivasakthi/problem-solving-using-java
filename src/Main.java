import java.util.HashSet;
import java.util.Set;

public class Main {
    public static Boolean check(String sentence){
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count = 0;
        HashSet<Character> s = new HashSet<>(sentence.length()-1);
        for(char x:sentence.toCharArray()){
            s.add(x);
        }
        if(sentence.length()<26){
            return false;
        }else{
           for(char y:s){
               for(int i=0;i<26;i++){
                   if(alpha[i]==y){
                       count++;
                   }
               }
           }
        }
        System.out.println(count);
        if(count<26){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(Main.check("jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo"));

    }
}