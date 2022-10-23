public class Palindrom {
    public static boolean isPalindrome(int x) {
        int temp=x;
        int q=0;
        while(x>0){
            int r=x%10;
            q=(q*10)+r;
            x= x/10;
        }
        return temp==q?true:false;
    }
    public static void main(String[] args) {
        System.out.println(Palindrom.isPalindrome(-212));
    }
}
