import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class Subarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int Current_sum=0,MAximum_sum=0;
        for(int i=1;i<n;i++){
            Current_sum=Math.max(arr[i],Current_sum+arr[i]);
            MAximum_sum=Math.max(MAximum_sum,Current_sum);
            System.out.println("the current index is"+MAximum_sum);
        }System.out.println("the subarray is"+MAximum_sum);

    }
}
