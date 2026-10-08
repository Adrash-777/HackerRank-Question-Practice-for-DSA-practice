/* Given a 6*6 2D array, arr, an hourglass is a subset of values with indices falling in the following pattern: There are 16 hourglasses in a 6*6 array. The hourglasssum is the sum of the values in an hourglass. Calculate the hourglass sum for every hourglass in , arr then print the maximum  hourglass sum.*/

import java.util.Scanner;

public class Array_2D{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int arr [][] = new int [size][size];
        int value = sc.nextInt();
        
        // inserting an element into an 2D array
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = value;
                value++;
            }
        }

        // printing an 2D array
        for(int i = 0; i < arr.length; i++){
            int j;
            for (j = 0; j < arr.length; j++){
                System.out.println(arr[i][j]);
            }
        }
        // hourglassSum calculation
        int max = Integer.MIN_VALUE;
        // int hourGlassSum;
        for (int i = 0; i < arr.length - 2; i++){
            for (int j = 0; j < arr.length - 2; j++){
               int hourGlassSum  = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                System.out.println("sum of 2D array in a hourglasssum is : " + hourGlassSum);
            }
        }
        


 


        //sc.close();
    }
}