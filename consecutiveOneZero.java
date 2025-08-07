import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class consecutiveOneZero {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int maxone=0,currentone=0,maxzero=0,currentzero=0;
System.out.println("enter the value of n");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the array");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
if(arr[i]!=0 &&arr[i]!=1){
    System.out.println("it must be 1 or zero");
return;
}}
for(int i=0;i<n;i++){
    if(arr[i]==0){
        currentzero++;
         currentone=0;
        
    }else{
        
        currentone++;
        currentzero=0;
       
    }
    maxone=Math.max( maxone,currentone);
    maxzero=Math.max(maxzero,currentzero);
}
System.out.println("ones"+maxone);
System.out.println( maxzero);
    
}
}