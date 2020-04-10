import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class newSorting {

    public static void newSorting(int[] a, int size){

        //base case;
        if(size <= 1 ){
            newSorting(a,a.length + 1);
        }
        else if(a.length < size){
            quickSort(a);
        }
        else{
            int middle = a.length / 2;
            //creates to arrays when combined equals a.length
            int[] lh = new int[middle];
            int[] rh = new int[a.length - middle];
            //populates array lh
            for(int i = 0; i < middle ;i++){
                lh[i] = a[i];
            }

            //populates array rh
            for(int i = 0; i < a.length - middle ;i++){
                rh[i] = a[middle + i];
            }

            //recursive calls
            newSorting(lh,size);
            newSorting(rh,size);

            //merge the two sorted arrays into the original array
            mergeSortedHalves(a,lh,rh);
        }
    }

    private static void mergeSortedHalves(int[] a, int[] lh, int[] rh){

        //iterator for a
        int i = 0;
        //iterator for lh
        int k = 0;
        //iterator for rh
        int n = 0;

        while(k < lh.length && n < rh.length ){

            if(lh[k] <= rh[n]){
                a[i] = lh[k];
                k++;
            }
            else{
                a[i] = rh[n];
                n++;
            }
            i++;
        }

        for(int l = k; l < lh.length ;l++){
            a[i] = lh[l];
            i++;
        }

        for(int l = n; l < rh.length ;l++){
            a[i] = rh[l];
            i++;
        }

    }

    public static void quickSort(int[] a){
        quickSort(a,0,a.length-1);
    }

    private static void quickSort(int [] a, int lowIndex, int highIndex){

        if(highIndex > lowIndex){

            //sorts the array and return the pivot
            int pivotNum = partition(a, lowIndex, highIndex);

            //recursion call which sorts the other halfs of the array excluding the pivot
            quickSort(a, lowIndex, pivotNum - 1);
            quickSort(a, pivotNum + 1, highIndex);

        }

    }

    private static int partition(int[] a, int lowIndex, int highIndex){

        int pivot = a[lowIndex];
        int less = lowIndex + 1;
        int greater = highIndex;

        while(less <= greater){

            //Continues until we find number that is greater than the pivot(from left to right)
            //or until great and left cross each other
            if( a[less] <= pivot){
                less++;

            }
            else{
                //Continues until we find a number that is less then pivot(from right to left)
                //or until great and left cross each other
                while( a[greater] > pivot  && less <= greater){
                    greater--;
                }
                //we swap the element at less and at great only if less and great haven't cross each other
                if(less <= greater){

                    int temp = a[greater];
                    a[greater] = a[less];
                    a[less] = temp;

                }
            }
        }

        //Greater now holds the future position for the pivot which is the rightest less than or
        //equal position, so we swap them with the current position of the pivot.
        int temp1 = a[greater];
        a[greater] = pivot;
        a[lowIndex] = temp1;

        //we return the current position of the pivot
        return greater;
    }

    public static void print(int[] a){

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
