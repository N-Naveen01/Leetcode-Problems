class Solution {
    public boolean checkValid(int[][] matrix) {
       int n=matrix.length;
       for(int i=0;i<n;i++){
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int j=0;j<n;j++){
            row.add(matrix[i][j]);
            col.add(matrix[j][i]);
        }
        if(row.size()!=col.size()){
            return false;
        }
        for(int j=1;j<=n;j++){
            if(!row.contains(j)|| !col.contains(j)){
                return false;
            }
        }
       } 
       return true;
    }
}