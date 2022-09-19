package com.bridgelabz;
import java.util.Arrays;
public class BubbleSort {
        static void bubbleSort(int array[]) {
            int size = array.length;
            //here using for loop
            //loop to access each array element
            for (int i = 0; i < size - 1; i++)
                //loop to compare array elements
                for (int j = 0; j < size - i - 1; j++)
                    // compare two adjacent elements
                    //  change > to < to sort in descending order
                    if (array[j] > array[j + 1]) {
                        //swapping occurs if elements
                        // are not in the intended orde/
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
        }
        //Here create a main method
        //all program execute in main method

        public static void main(String args[]) {

            int[] data = { 20,30,-2,-4,50,80,2 };
            BubbleSort.bubbleSort(data);

            System.out.println("Sorted Array in Ascending Order:");
            System.out.println(Arrays.toString(data));
        }
    }

