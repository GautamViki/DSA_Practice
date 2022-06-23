package Recursion_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements : ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter key : ");
        int key = sc.nextInt();

        System.out.println("Array : "+ Arrays.toString(arr));
        int idx=lastOccurrenceIdx(arr,0,key);
        System.out.println("Index : "+idx);
    }
    public static int lastOccurrenceIdx(int []arr,int idx,int key){
        if (idx== arr.length){
            return -1;
        }
        int last=-1;
        if (key==arr[idx]){
            last=idx;
            return lastOccurrenceIdx(arr, idx+1, key);
        }
        return last;
    }
}
