 import java.util.*;
 import java.util.Arrays;
 import java.util.Scanner;
 public class minSubarray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }System.out.println("enter k");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum==k){
                    int len=j-i+1;
                    min=Math.min(min,len);
                }
            }
        }if(min==Integer.MIN_VALUE){
            System.out.println("-1");
        }else{
            System.out.println("the final answer is"+min);
        }
    }
 }