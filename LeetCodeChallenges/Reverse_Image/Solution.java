class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A[0].length][A[0].length];
        for(int i = 0; i < A[0].length; i++){
            int count = ( A[0].length - 1 );
            for(int j = 0; j < A[0].length; j++){
                B[i][count] = A[i][j];
                count -- ;
            }
            for(int j = 0; j < A[0].length; j++){
               B[i][j] =  B[i][j] == 0 ? 1 : 0 ;
            }
        }
        return B;
    }
}
