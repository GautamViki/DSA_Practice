package Recursion_Problem;

import java.util.Scanner;

public class towerOFHanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disk : ");
        int n=sc.nextInt();
        System.out.println("Enter source : ");
        String src=sc.next();
        System.out.println("Enter Helper : ");
        String help=sc.next();
        System.out.println("Enter Destination : ");
        String dst=sc.next();

        towerOFHanoi main=new towerOFHanoi();
        main.ToH(n,src,dst,help);

    }
    public void ToH(int n,String src,String dst,String help){
        if (n==0){
            return;
        }
        ToH(n-1,src,help,dst);
        System.out.println(n+" "+src+" => "+dst);
        ToH(n-1,help,dst,src);
    }
}