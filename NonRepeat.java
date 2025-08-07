import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class NonRepeat {
    public static void main(String[]args){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        System.out.println("enter the array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();}
for(i=0;i<n;i++){
count=0;
for(j=0;j<n;j++){
if(arr[i]==arr[j]&&i!=j){
    count=1;
    break;
}}
if(count==0){
    System.out.println("the non repeated elements are"+arr[i]);
}
    }}
}
