import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class SortedOrNot {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=sc.nextInt();
    int i;
    int flag=1;
    int arr[]=new int[n];
    System.out.println("enter the arrray");
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
System.out.println("checking the result");
for(i=0;i<n-1;i++){
    if(arr[i]>arr[i+1]){
        flag=0;
        break;
    }
}if(flag==1){
    System.out.println("it is sorted");
}else{
    System.out.println("not sorted");
}
    }
}
