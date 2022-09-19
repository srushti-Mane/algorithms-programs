package com.bridgelabz;
import java.util.Arrays;
public class MergeSort {

        //create a main method.all program execute in main method
        public static void main(String[] args) {
            //create a string type array
            String[] array = {"Bengluru", "Hyderabad", "Delhi", "Pune", "Ahmadabad", "Mumbai"};
            mergeSort(array, 0, array.length - 1);
            System.out.println("Result " + Arrays.toString(array));
        }
        //creating a method name as mergeSort.
        public static void mergeSort(String[] array, int low, int high) {
            if (low == high) {
                return;
            }
            int mid = (low + high) / 2;
            //sort the first and the second half
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
        // end mergeSort
        //create a method name as merge
        //this is parameterized method

        public static void merge(String[] array, int low, int mid, int high) {
            //size of the range to be merged
            int n = high - low + 1;

            //merge both halves into a temporary array b
            String[] b = new String[n];
            //next element to consider in the first range
            int i1 = low;
            //next element to consider in the second range
            int i2 = mid + 1;
            int j = 0;
            // next open position in b
            //here using while loop
            //as long as neither i1 nor i2 past the end, move the smaller into b
            while (i1 <= mid && i2 <= high) {
                if (array[i1].compareTo(array[i2]) < 0) {
                    b[j] = array[i1];
                    i1++;
                } else {
                    b[j] = array[i2];
                    i2++;
                }
                j++;
            }
            //note that only one of the two while loops below is executed copy any
            //remaining entries of the first half

            while (i1 <= mid) {
                b[j] = array[i1];
                i1++;
                j++;
            }
            //using while loop
            //copy any remaining entries of the second half
            while (i2 <= high) {
                b[j] = array[i2];
                i2++;
                j++;
            }
            //using for loop
            //copy back from the temporary array
            for (j = 0; j < n; j++) {
                array[low + j] = b[j];
            }

        }
    }

