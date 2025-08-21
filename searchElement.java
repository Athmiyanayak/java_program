import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class searchElement {
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
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println("found at index"+i);
            }/*else{
                System.out.println("not found");
            }*/
        }
    }
}
