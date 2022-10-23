import java.lang.Math;
public class Reverse {
    public static int reverse(int x) {
        int temp =x;
        long q=0;
       // x=x<0?x*(-1):x;
        while(x>0){
            q=q*10+(x%10);
            x/=10;
        }
        if(q>Integer.MAX_VALUE || q<Integer.MIN_VALUE){
            return 0;
        }else{
            return temp<0?(int)q*(-1):(int)q;
        }

    }
    public static void main(String[] args) {
        System.out.println(Reverse.reverse(123));

    }
}
