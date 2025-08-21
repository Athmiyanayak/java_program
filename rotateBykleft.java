import java.util.*;
public class rotateBykleft {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    System.out.println("enter array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
    }System.out.println("enter k");
    int k=sc.nextInt();
    for(int r=0;r<k;r++){
        int first=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }arr[n-1]=first;
    }for(int i=0;i<n;i++){
        System.out.print(arr[i]);   }}}