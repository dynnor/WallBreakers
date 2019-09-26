//Dynnor Shebshaievitz

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {

        int num_row = A.length;
        int num_col = A[0].length;
        int[][] ret = new int[num_row][num_col];

        //use one for loop to flip the image horizontally and then invert
        for(int row = 0; row < num_row; row ++)
        {
          for (int col = 0; col < num_col; col++)
          {
              /*
              the first step is to fill each cell starting from
              the last column and moving towards the beginning
              in order to invert the image use bitwise
              XOR with 1 to flip the bit
              */
              ret[row][num_col - col -1] = (A[row][col]^1);
            }
        }
        return ret;
    }
}
