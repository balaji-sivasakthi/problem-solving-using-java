public class Sorted {
    public static int[] search(int[] nums,int target){
        if (nums.length==0){
            return new int[]{-1,-1};
        }
        for(int i =0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0;j--){
                if(nums[i]==target && nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] a = {1};
       for (int x:search(a,0)){
           System.out.println(x );
       }
    }
}
