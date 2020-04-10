import static org.junit.jupiter.api.Assertions.*;

class newSortingTester {

    /* Test Case 1
     * Method: newSorting(int[] a, int size)
     *
     * Input:  int[] a = {4,12,6,15,9,7,18,20}
     *         size = 5
     *
     * Expected Outcome:  int[] b = {4,6,7,9,12,15,18,20};
     *
     * Reason: This a common and expected use of the method without any type of edge case with an even array.
     *         Due to the input size and the array length, it is expected for the array to be divided in half,
     *         quicksorted, and then merged back again.
     *
     *
     * Outcome: The code managed to cut the array in half, quicksorted then merged together. Overall, the code worked
     *          perfectly
     */

    @org.junit.jupiter.api.Test
    void newSortingTest1() {

        //array
        int[] a = {4, 12, 6, 15, 9, 7, 18, 20};
        //expected array after the method newSorting()
        int[] b = {4, 6, 7, 9, 12, 15, 18, 20};
        newSorting.newSorting(a, 5);
        //tests whether the array are equal after the use of the method newSorting
        assertArrayEquals(b, a);

    }

    /* Test Case 2
     * Method: newSorting(int[] a, int size)
     *
     * Input:  int[] a = {8,7,6,5,4,3,2,1,0}
     *         size = 5
     *
     * Expected Outcome:  int[] b = {0,1,2,3,4,5,6,7,8};
     *
     * Reason: This a common and expected use of the method with an odd array that is sorted from greatest to smallest.
     *         Due to the input size and the array length, one side will be cut into array of length 4
     *         which will enter the base case, while the other side will be of length 5 which will have to enter the
     *         recursive case once more
     *
     *
     *
     * Outcome: The code worked as expected since the method enter the base case three times, once for
     *          the left side, and twice for the right side of the array. The method worked correctly.
     */

    @org.junit.jupiter.api.Test
    void newSortingTest2() {

        //array
        int[] a = {8, 7, 6, 5, 4, 3, 2, 1, 0};
        //expected array after the method newSorting()
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        newSorting.newSorting(a, 5);
        //tests whether the array are equal after the use of the method newSorting
        assertArrayEquals(b, a);

    }

    /* Test Case 3
     * Method: newSorting(int[] a, int size)
     *
     * Input:  int[] a = {}
     *         size = 5
     *
     * Expected Outcome:  int[] b = {};
     *
     * Reason: I wanted to test the method with an empty array to see if the code would manage to work or if
     *         it would create an error.
     *
     *
     * Outcome: The method sent the array to the base case in which quicksort handled the empty array without
     *          any problems. The code worked well.
     */

    @org.junit.jupiter.api.Test
    void newSortingTest3() {

        //array
        int[] a = {};
        //expected array after the method newSorting()
        int[] b = {};
        newSorting.newSorting(a, 5);
        //tests whether the array are equal after the use of the method newSorting
        assertArrayEquals(b, a);

    }

    /* Test Case 4
     * Method: newSorting(int[] a, int size)
     *
     * Input:  int[] a = {4,12,6,15,9,7,18,20}
     *         size = -3
     *
     * Expected Outcome:  int[] b = {4,6,7,9,12,15,18,20};
     *
     * Reason: I wanted to test a negative size to see if the code would work.I used the
     *         same array as newSortingTest1 since it had previously worked.
     *
     *
     * Outcome: There was a stack overflow error since the array length could never become lower than
     *          the size. (if the size <= 1, then the base case will never be reached)
     *
     * Solution: Created another base case in which it checks whether size <= 1. If it enters the
     *           base case, then the code will call a recursion call with the same array and a size
     *           equal to that currents array size + 1. This will make the code enter base case to
     *           immediately quicksort the array. The code functions perfectly
     *
     */

    @org.junit.jupiter.api.Test
    void newSortingTest4() {

        //array
        int[] a = {4, 12, 6, 15, 9, 7, 18, 20};
        //expected array after the method newSorting()
        int[] b = {4, 6, 7, 9, 12, 15, 18, 20};
        newSorting.newSorting(a, -3);
        //tests whether the array are equal after the use of the method newSorting
        assertArrayEquals(b, a);

    }

    /* Test Case 5
     * Method: newSorting(int[] a, int size)
     *
     * Input:  int[] a = {2,2,4,5,10,10,8,4}
     *         size = 3
     *
     * Expected Outcome:  int[] b = {2,2,4,4,5,8,10,10};
     *
     * Reason: I wanted to test identical elements in array. In this array there are multiple identical array.
     *
     *
     * Outcome: The code worked perfectly with identical values.
     */

    @org.junit.jupiter.api.Test
    void newSortingTest5() {

        //array
        int[] a = {2, 2, 4, 5, 10, 10, 8, 4};
        //expected array after the method newSorting()
        int[] b = {2, 2, 4, 4, 5, 8, 10, 10};
        newSorting.newSorting(a, 3);
        //tests whether the array are equal after the use of the method newSorting
        assertArrayEquals(b, a);

    }

}