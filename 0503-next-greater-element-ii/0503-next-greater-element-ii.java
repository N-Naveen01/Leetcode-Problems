class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];
        Arrays.fill(result,-1);
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<2*n;i++){
            int index=i%n;
            while(!s.isEmpty() && nums[s.peek()] < nums[index]){
                result[s.pop()]=nums[index];
            }
            if(i<n){
                s.push(index);
            }
        }
        return result;
    }
}