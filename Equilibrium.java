import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class Equilibrium {
   public static int leftright(int[] arr,int n){
int[] L=new int[n];
int[] R=new int[n];
int sum1=0,sum2=0;
for(int i=1;i<n;i++){
    sum1=sum1+arr[i-1];
    L[i]=sum1;
}for(int j=n-2;j>=0;j--){
    sum2=sum2+arr[j+1];
    R[j]=sum2;
}for(int i=0;i<n;i++){
    if(L[i]==R[i]){
        return i;
 } }return -1;

    
}
public static void main(String[]args){
int arr[]={1,2,4,3};
int n=arr.length;
int result=leftright(arr,n);
System.out.println(result);
}}