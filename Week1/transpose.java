//Dynnor Shebshaievitz

class Solution {
    public int[][] transpose(int[][] A) {

        //given a matrix you want to return the transpose

        //start by making a new matrix with the same
        //size as the original
        int[][] ret = new int[A[0].length][A.length];

        /*
        Go through the original matrix A row by row, but
        will be inserting into our matrix ret column by
        column.
        */
        for(int row= 0; row < A.length; row ++)
        {
            for(int col= 0; col < A[0].length; col++)
            {
                ret[col][row] = A[row][col];
            }
        }
        return ret;
    }
}
