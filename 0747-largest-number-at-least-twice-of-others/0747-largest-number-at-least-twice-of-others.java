class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int nu=nums[0];
        int se= Integer.MIN_VALUE;
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nu){
                se=nu;
                nu=nums[i];
                index=i;
            }
            else if(nums[i]>se){
                se=nums[i];
            }
   
        }
         if(2*se<=nu){
            return index;
        }
        else{
            return -1;
        }        
    }
}