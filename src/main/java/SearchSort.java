/**
 * Implements classic search/sort algorithms as static methods to educate students about searching/sorting.
 * One of these is broken!
 * @author J. Cihlar
 * @version 1.0
 * @since 2025-01
 */


 class SearchSort {

    /**
     * Describe the method and approach
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

    /**
     * Describe the method and approach
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
     * Describe the method and approach
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
    * Describe the method and approach
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
    * Describe the method and approach
    * @param arr
    */
    public static void mystery5(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length-1; j++) {
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