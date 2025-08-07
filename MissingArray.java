 import java.util.*;
 import java.util.Scanner;
 import java.util.Arrays;
 public class MissingArray{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the array");
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
    }for(int i=0;i<50;i++){
        boolean found=false;
        for(int j=1;j<n;j++){
            if(arr[j]==i){
                found=true;
                break;
            }
        }if(!found){
            System.out.print(i);
        }System.out.println();
    }
    }
 }