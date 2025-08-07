import java.util.*;
import java.util.Scanner;
public class reverse {
    public static void main(String[]args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }System.out.println(" the final  array");
        for(i=n-1;i>=0;i--){
System.out.println(arr[i]);
        }
        
    }
}
