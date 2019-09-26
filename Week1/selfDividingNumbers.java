//Dynnor Shebshaievitz

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ret = new ArrayList<Integer>();

        //Iterate through every value within the bounds
        for(int current_num = left; current_num <= right; current_num ++)
        {
            //check the number is self-divisible
            //if it is append it to the list
            if (isSelfDivisible(current_num))
                ret.add(current_num);

        }

    return ret;
}

//helper function
private boolean isSelfDivisible(int num)
{
    //Turn thr int into an array of chars so we can get
    //each digit without having to do multiple operations like mods and
    //division
    char[] num_to_chars = String.valueOf(num).toCharArray();

    //For each digit (stored as char c)
    //check if it's 0 or if the original number does not
    //divide without a remainder
    for(char c: num_to_chars)
    {
        if (c == '0'|| num % (c - '0') != 0)
            return false;
    }
    return true;

}
}
