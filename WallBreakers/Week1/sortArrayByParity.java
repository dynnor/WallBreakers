class Solution {
    public int[] sortArrayByParity(int[] A) {
        //sort the elements of an array
        //returning an array or ints even, odd

        //set up an array
        int[] ret = new int[A.length];
        int ret_index = 0;

        //go through appending the even ints
        for (int current_int : A)
            if(current_int % 2 == 0) //check for even
                ret[ret_index++] = current_int;

        //go through the array for a second time
        //but this time append the odd ints
        for (int current_int: A)
            if (current_int % 2 !=0)
                ret[ret_index++] = current_int;

        return ret;

    }
}

//Runtime 0 ms
/*
 input: [3,1,2,4]
 output: [2,4,3,1]
 expected: [2, 4, 3, 1]
*/
