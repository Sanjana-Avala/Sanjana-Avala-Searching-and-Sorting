/**
 * Implements classic search/sort algorithms as static methods to educate students about searching/sorting.
 * One of these is broken!
 * @author J. Cihlar
 * @version 1.0
 * @since 2025-01
 */

 import java.util.ArrayList;
 class SearchSort {

    /**
     * The loop runs through every value in the array to see if the value is equal to the target. 
     * It is a linear search
     * @param arr
     * @param target
     * @return 
     */
    public static int mystery1(int [] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int mystery1(ArrayList<Integer> lst, int target) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == target)
                return i;
        }
        return -1;
    }


    public static int mystery2(ArrayList<Integer> lst, int target) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == target)
                return i;
        }
        return -1;
    }

    
    /**
     * It divides the array in half and then checks if the midpoint is smaller or bigger than the target. 
     * If the midpoint is bigger than the target, it checks in the other half of the array to look for 
     * the target, and vice versa. 
     * It is a binary search
     * @param arr
     * @param target
     * @return 
     */
    public static int mystery2(int [] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left+right) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Bubble Sort
     * @param arr
     */
    public static void mystery3(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

   /*
    * Insertion Sort
    * @param arr
    */
    public static void mystery4(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int elem = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > elem) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = elem;
        }
    }    

   /*
    * Selection Sort
    * 
    * @param arr
    */
    public static void mystery5(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }  
 }