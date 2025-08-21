import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class sort012 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter ther array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }int low=0,mid=0,high=n-1;
    while(mid<=high){
        switch(arr[mid]){
            case 0:
            int temp0=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp0;
            low++;
            mid++;
            break;
            case 1:
            mid++;
            break;
           /*  case 2:
            int temp1=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp1;
            high--;
             break;*/
             

        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
}
}
}