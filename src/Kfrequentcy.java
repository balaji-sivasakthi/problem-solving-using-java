import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kfrequentcy {
    public static List<String> topKFrequent(String[] words, int k) {

        System.out.println(words.length);
        for(int i=0;i<words.length;i++){
            for(int j=1;j< words.length;j++){
                if(words[j].charAt(0)>words[i].charAt(0)){
                    System.out.println("In i="+i+" j="+j);
                    String temp = words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }else{
                    words[i]=words[i];
                    words[j]=words[j];
                }
            }
        }
        return Arrays.stream(words).toList();
    }
    public static void main(String[] args) {
        System.out.println(Kfrequentcy.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"},2));
    }
}
