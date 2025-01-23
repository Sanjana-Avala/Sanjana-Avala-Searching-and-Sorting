/**
 * Demonstrates usage of SearchSort class
 * @author J. Cihlar
 * @version 1.0
 * @since 2025-01
 */


import java.util.Arrays;

class SearchSortRunner {

    public static void main(String [] args) {
        int [] valuesUnsorted = new int [] {2, 3, 4, -1, 25, 6, 10};
        int [] valuesSortedAsc = new int [] {-1, 2, 3, 4, 6, 10, 25};
        int [] valuesSortedDesc = new int [] {25, 10, 6, 2, -1, 4, 3};

        System.out.printf("Output mystery1(valuesUnsorted, 2): %d\n", SearchSort.mystery1(valuesUnsorted, 2));
        System.out.printf("Output mystery1(valuesUnsorted, 0): %d\n", SearchSort.mystery1(valuesUnsorted, 0));

        System.out.printf("Output mystery1(valuesSortedAsc, 2): %d\n", SearchSort.mystery1(valuesSortedAsc, 2));
        System.out.printf("Output mystery1(valuesSortedAsc, 0): %d\n", SearchSort.mystery1(valuesSortedAsc,0));

        System.out.printf("Output mystery1(valuesSortedDesc, 2): %d\n", SearchSort.mystery1(valuesSortedDesc, 2));
        System.out.printf("Output mystery1(valuesSortedDesc, 0): %d\n", SearchSort.mystery1(valuesSortedDesc,0));

        // MODIFY - add code to test mystery2


        System.out.println(Arrays.toString(valuesUnsorted));
        SearchSort.mystery3(valuesUnsorted);
        System.out.println(Arrays.toString(valuesUnsorted));

       // MODIFY - add code to test mystery4 and mystery5. How can you give each method a scrambled array?

    }
}