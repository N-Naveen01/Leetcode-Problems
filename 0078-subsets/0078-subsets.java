class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(nums,result,new ArrayList<>(),0);
        return result;
    }

        public static void subset(int[] nums,List<List<Integer>> r, List<Integer> tem,int s){
            r.add(new ArrayList<>(tem));
            for(int i=s;i<nums.length;i++){
                tem.add(nums[i]);
                subset(nums,r,tem,i+1);
                tem.remove(tem.size()-1);
            }
        } 
}