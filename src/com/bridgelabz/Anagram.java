package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Getting the input string from the user
            System.out.print("Enter the First String : ");
            String s1 = scanner.nextLine();

            System.out.print("Enter the second String : ");
            String s2 = scanner.nextLine();

            if(checkAnagram(s1, s2))
                System.out.println(s1+" and "+s2+" the two strings are Anagrams");

            else
                System.out.println(s1+" and "+s2+" the two are NOT Anagrams");
            scanner.close();
        }
        //create a method data type used is boolean and method name as checkAnagram and passing parameter
        //boolean method is used for checking condition true or false.
        public static boolean checkAnagram(String s1, String s2)  {
            //Remove all the white space from both the Strings s1 and s2,
            //by passing the string to the replaceAll() method.
            // We are using using regex “\\s” [\\s is regex for whitespace] and replacing it with “”
            s1 = s1.replaceAll("\\s", "");
            s2 = s2.replaceAll("\\s", "");
            // Check if both length matches
            if(s1.length() != s2.length())
                return false;
            else  {
                //Now convert strings s1 and s2 into lowercase by calling toLowerCase() and into a
                char[] arr1 = s1.toLowerCase().toCharArray();
                char[] arr2 = s2.toLowerCase().toCharArray();
                //sort both the arrays arr1 and arr2 in ascending order using Arrays.sort() method
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                //Validate whether both arrays arr1 and arr2 are equal using Arrays.equal() method,
                //this method returns true if both the arrays contains the same elements in the same order.
                return (Arrays.equals(arr1, arr2));
            }
        }
    }

