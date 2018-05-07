package org.launchcode.java.demos.java4python;

public class MaxArray {
    /*add a regular method that
    takes in an array & finds
    the max value. int is the
    return type
     */

    /*
     */
    public static int findMax(int[] array){
        //create a new variable to store the max array, using the first value of the array
        int max = array[0];
        //create a for loop. do not add ; at end
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }
    //add a main as the starting point of the program
    //String is the data type for the args parameter. str array of arguments
    public static void main(String[] args) {
        //create an array of ints. us the below if you know the values that belong in array
        int [] x = {5, 33, 22, 7, 36, 15, 13 ,4 ,2, 19};
        //call the method to pass in the array
        int answer = findMax(x);
        System.out.println(answer);
    }
}
