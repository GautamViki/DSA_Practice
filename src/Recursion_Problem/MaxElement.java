package Recursion_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements : ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array : "+ Arrays.toString(arr));
        int max=findMax(arr,0);
        System.out.println("Max element : "+max);
    }
    public static int findMax(int[] arr,int idx){
        if (idx== arr.length){
            return 0;
        }
       int max= findMax(arr,idx+1);
        if (max<arr[idx]){
            return arr[idx];
        }
        else {
            return max;
        }
    }
}
