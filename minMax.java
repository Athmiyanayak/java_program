import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class minMax {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
System.out.println("enter the array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}int min=arr[0];
int max=arr[0];
for(int i=0;i<n;i++){


if(arr[i]<min){
    min=arr[i];
}


if(arr[i]>max){
    max=arr[i];
}}System.out.println("min is"+min);
System.out.println("max is"+max);}
}
