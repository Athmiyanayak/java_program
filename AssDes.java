import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class AssDes {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    int n=sc.nextInt();
    System.out.println("enter the array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int mid=n/2;
    int temp;
    for(int i=0;i<mid-1;i++){
        for(int j=i+1;j<mid;j++){
        if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
    }for(int i=mid;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }for(int i=0;i<n;i++){
System.out.print(arr[i]);
    }

    }
}
