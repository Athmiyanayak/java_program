import java.util.Scanner;
import java.util.Scanner;
import java.util.Arrays;
public class repear {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the array");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
if(arr[i]==arr[j]){
    System.out.print (arr[i]+"");
}
    }
}}}