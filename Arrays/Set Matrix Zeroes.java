//extra space approach

class Solution {
    public void setZeroes(int[][] matrix) {
       int r= matrix.length;
        int c=matrix[0].length;
        Set<Integer> R= new HashSet<>();

        Set<Integer> C= new HashSet<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    R.add(i);
                    C.add(j);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(R.contains(i)|| C.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
