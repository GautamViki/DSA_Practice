package General_Problem;

import java.util.Arrays;

public class FindEquilibriumIndex {
    public static void main(String[] args) {
        int n=6;
        int []arr={1,2,6,4,0,-1};
        System.out.println(Arrays.toString(arr));

        if (n==1){
            System.out.println("Equilibrium Index : "+0);
            return;
        } else if (n==2) {
            System.out.println("Not Possible");
            return;
        }
        int []leftSumArr=new int[n];
        for (int i=0;i<n;i++){
            if(i==0){
                leftSumArr[i]=arr[i];
            }
            else {
                leftSumArr[i]=leftSumArr[i-1]+arr[i];
            }
        }
        System.out.println(Arrays.toString(leftSumArr));
        for (int i=0;i<n;i++){
            int lSum=leftSumArr[i]-arr[i];
//            leftSumArr[n-1]=sum Of Array
            int rSum=leftSumArr[n-1]-leftSumArr[i];
            System.out.println(lSum+"  "+rSum);
            if(lSum==rSum){
                System.out.println("Equilibrium Index : "+i);
            }
        }
    }
}
