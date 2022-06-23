package Recursion_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Reverse array : ");
        reversArray(arr,0);
    }
    public static void reversArray(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        reversArray(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
}
