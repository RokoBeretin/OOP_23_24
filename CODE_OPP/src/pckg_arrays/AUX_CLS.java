package pckg_arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {
    private static final int MINI = 10;
    private static final int MAXI = 450;
    private static Scanner sc = new Scanner(System.in);

    public static int[] populateArrayRand(int arrSize){
        int[] arr = new int[arrSize];
        for(int k=0; k< arrSize; k++){
            int numElement = ThreadLocalRandom.current().nextInt(MINI, MAXI);
            arr[k] = numElement;
        }
        return arr;
    }

    public static void listIntArray(int[] arr){
        for(int k = 0; k<arr.length; k++){
            System.out.println("Element: " + arr[k]);
        }
    }
    public static int[] userPopulatedArray(int size){
        int[] arr = new int[size];
        int idx = 0;
        while(idx < size){
            System.out.println("Enter number: ");
            int num = AUX_CLS.getIntFromStandardInput();
            arr[idx] = num;
            idx++;
        }
        return arr;

    }
    private static int getIntFromStandardInput(){
        int num = 0;
        boolean correctInputRepeat = true;
        while(correctInputRepeat){
            try{
                num = sc.nextInt();
                correctInputRepeat = false;
            }catch(InputMismatchException ime){
                System.out.println("Expected input is integer...");
                System.out.println("Please provide new input - integer: ");
                sc.nextLine();
            }


        }
        return num;

    }
    public static String linkStringUsingJoin(String[] strArr){
        String linked = String.join(" ", strArr);
        return linked;
    }
    public static String linkStringUsingBuilder(String[] strArr){
        StringBuilder sb = new StringBuilder();
        for(String element : strArr){
            sb.append(element);
            sb.append(" ");

        }
        return sb.toString();
    }
    public static String concatenateArrayElements(String[] strArr){
        String con = "";
        for(String el : strArr){
            con = con + " " + el;
        }
        return con;
    }

    public static int[][] gen2DIntArray(int rows, int columns){
        int[][] arr2d = new int[rows][columns];
        for(int k = 0; k<rows; k++){
            for(int p = 0; p<columns; p++){
                int num = ThreadLocalRandom.current().nextInt(MINI,MAXI);
                arr2d[k][p] = num;

            }
        }
        return arr2d;
    }
    public static void list2DArray(int[][] arrd){
        for(int[] rw : arrd){
            System.out.println(Arrays.toString(rw));
        }
    }
}
