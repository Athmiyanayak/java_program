 import java.util.*;
 import java.util.Scanner;
 import java.util.Arrays;
 public class kLarge{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }System.out.println("enter k");
        int k=sc.nextInt();
         
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the output is");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]);
        }
    }
 }