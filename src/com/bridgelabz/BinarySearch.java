package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
        public static void main(String[] args) {
            //create object for BinarySearch class
            BinarySearch binaryObj = new BinarySearch();
            // create scanner class and object
            Scanner scanner = new Scanner(System.in);
            //create array list
            String[] wordList = {"mango", "banana", "peach", "apple", "orange"};
            //array list is ascending order
            Arrays.sort(wordList);
            System.out.println("List of Words :");
            System.out.println(Arrays.toString(wordList));
            System.out.println("Enter the word you want to search");
            String searchName = scanner.nextLine();
            // method calling
            //result is objectname.method name

            int result = binaryObj.binarySearch(wordList, searchName);
            if (result == -1)
                System.out.println("word is found at " + "index " + result);
            else
                System.out.println("word is not present in the list");
        }

        //create a method name as binarySearch
        // this is parameterized method
        public int binarySearch(String[] wordList, String searchName) {

            int start = 0, length = wordList.length - 1;
            /**
             * using while loop
             */
            while (start <= length) {
                int middle = start +  ( length -start ) / 2;
                int result = searchName.compareTo(wordList[middle]);
                /**
                 * if condition is true then return middle
                 */
                if (result == 0)
                    return middle;
                /**
                 * if condition checked
                 * if result is greater than 0 then start is middle +1
                 * if false then length =middle -1
                 */
                if (result > 0)
                    start = middle + 1;
                else
                    length = middle - 1;
            }
            return -1;
        }
    }

