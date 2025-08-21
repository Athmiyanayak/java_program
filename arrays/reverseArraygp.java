import java.util.*;
public class reverseArraygp {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
    }int length=arr.length;
    System.out.println("enter k");
    int k=sc.nextInt();
    for(int i=0;i<n;i=i+k){
    int start=i,end=Math.min(i+k-1,length-1);
    while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    }for(int i=0;i<n;i++){
        System.out.print (arr[i]+" ");
    }
}
}
