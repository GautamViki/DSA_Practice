package Recursion_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n= sc.nextInt();

        int []arr=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key : ");
        int key= sc.nextInt();
        System.out.println("Array : "+ Arrays.toString(arr));
        int firstIdx=firstOccurrenceIdx(arr,0,key);
        System.out.println("Index : "+firstIdx);
    }
    public  static int firstOccurrenceIdx(int[] arr,int idx,int key){
        if(idx== arr.length){
            return -1;
        }
        if (key==arr[idx]){
            return idx;
        }
        return firstOccurrenceIdx(arr, idx+1, key);
    }
}
