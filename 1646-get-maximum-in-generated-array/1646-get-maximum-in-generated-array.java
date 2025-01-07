class Solution {
    public int getMaximumGenerated(int n) {
       List<Integer> arr = new ArrayList<>();
       int a=1;
       for(int i=0;i<=n;i++){
        if(i==0){
            arr.add(0);
        }
        if(i==1){
            arr.add(1);
        }
        if(i%2==0){
            if(2*a==i){
                arr.add(arr.get(a));
            }
        }
        else{
            if((2*a+1)==i){
                arr.add(arr.get(a)+arr.get(a+1));
                a++;
            }
        }
       } 
       int max=Collections.max(arr);
       return max;
    }
}