class Solution {
    public int numEquivDominoPairs(int[][] d) {

        Map<String,Integer> ar = new HashMap<>();
        int c=0;

        for(int i=0;i< d.length;i++){
            int a = d[i][0];
            int b= d[i][1];

            if(a>b){
                int temp = a;
                a=b;
                b=temp;
            }

            String k = a + "," + b;

            if(ar.containsKey(k)){
                c+=ar.get(k);
            }

            ar.put(k,ar.getOrDefault(k,0)+1);
        }

        return c;
            
    }
}