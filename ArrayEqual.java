import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayEqual {
   public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
System.out.println("enter the array1");
int arr[]=new int[n];
int brr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}System.out.println("enter the array2");
for(int i=0;i<n;i++){
    brr[i]=sc.nextInt();
}int flag=1;
for(int i=0;i<n;i++){
if(arr[i]!=brr[i]){
    flag=0;
    break;}
}if(flag==1){
System.out.println("equal");
}else{
    System.out.println("not");
}
   } }
