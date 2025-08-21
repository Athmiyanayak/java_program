import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class rightRotation {
public static void main(String[]arhs){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    int n=sc.nextInt();
    System.out.println("enter array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }int last=arr[n-1];
    for(int i=n-1;i>0;i--){
        arr[i]=arr[i-1];
    }arr[0]=last;
for(int i=0;i<n;i++){
    System.out.print(arr[i]+"");

}}
}
