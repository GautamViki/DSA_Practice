package Recursion_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements : ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Using recursion : ");
        printArrayUsingRecursion(arr,0);
    }
    public static void printArrayUsingRecursion(int []arr,int idx){
        if (idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printArrayUsingRecursion(arr,idx+1);
    }
}
