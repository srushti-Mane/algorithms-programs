package com.bridgelabz;
public class InsertionSort {

    //create a main method all program execute in main method
    public static void main(String[] args) {
        //create object for InsertionSort class

        InsertionSort insertionSort = new InsertionSort();
        //create array list
        String[] array = { "Strawberry", "Orange", "Mango", "Apple","Bannana" };
        //using for loop here
        //print befor insertion array list

        System.out.println("Before Insertion Sort");
        //here initialize i =0 then for loop execute at then end of then array length
        for (int i = 0; i < array.length; i++) {
            System.out.print("   "+array[i]);
        }
        System.out.println();

        //using for loop for here
        //print after insertion array list
        System.out.println("After Insertion Sort");
        //sortedArray =object name.public String[] sort(@NotNull String[] array
        String[] sortedArray = insertionSort.sort(array);

        //initialize i=0,condition is i < sortedArray then print the increment by 1
        // same procedure till the end of length of array.
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print("   "+sortedArray[i]);
        }
    }

    //create a method name as sort this is String array type method and parameterized method
    public String[] sort(String array[]) {
        //Variable 'temp' initializer '" "' is redundant
        String temp = " ";
        int arrayLength = array.length;
        //using for loop
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
