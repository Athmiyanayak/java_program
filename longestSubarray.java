import java.util.*;
public class longestSubarray {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the n");
int n=sc.nextInt();
System.out.println("enter array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out.println("Enter k");
int k=sc.nextInt();
int max_length=0;
for(int i=0;i<n;i++){
    int sum=0;
    for(int j=i;j<n;j++){
        sum=sum+arr[j];
    if(sum==k){
max_length=Math.max(max_length,j-i+1);
    }}
}System.out.println(max_length);
}}

