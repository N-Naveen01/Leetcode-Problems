class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> ar = new HashSet<>();
        int n=nums.length;
        for(int j=0;j<n;j++){
            if(nums[j]==key){
                for(int i=Math.max(0,j-k);i<=Math.min(n-1,j+k);i++){
                     ar.add(i);
                }
            }
        }
        List<Integer> arr=new ArrayList<>(ar);
        Collections.sort(arr);
        return arr;
        
    }
}