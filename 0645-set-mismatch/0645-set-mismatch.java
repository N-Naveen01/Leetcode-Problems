class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        boolean[] arr = new boolean[nums.length+1];
        for(int num:nums){
            if(arr[num]){
                res[0]=num;
            }
            arr[num]=true;
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                res[1]=i;
            }
        }
        return res;
    }
}