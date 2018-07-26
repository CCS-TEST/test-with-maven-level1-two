package ccs.test.mvn.level1.two;

/**

   We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).

   Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array.

   Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.

 */

public class Endy {

    /**
     * returns a new integer array of first n endy numbers where n = count
     *
     * should throw exception if nums is null or count is less than or equals to 0
     *
     * @param nums the original array
     * @param count howmany endy numbers to return
     * @return int[]
     */
    public int[] copyEndy(int[] nums, int count) throws BadArgumentException {
        return null;
    }


    /**
     * checks whether a given number is an Endy
     * @param n input number
     * @return true if it is an Endy, false otherwise
     */
    private boolean isEndy(int n){
        return false;
    }

}
