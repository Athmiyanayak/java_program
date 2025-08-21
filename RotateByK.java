import java.util.*;

public class RotateByK {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
System.out.println("enter the array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}System.out.println("enter k");
int k=sc.nextInt();
k=k%n;
for(int r=0;r<k;r++){
    int last=arr[n-1];
    for(int i=n-1;i>0;i--){
        arr[i]=arr[i-1];
    }arr[0]=last;}
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

}  
}
