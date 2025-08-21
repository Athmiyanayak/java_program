import java.util.*;
public class insertaAtspecific {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
int arr[]=new int[n];
int brr[]=new int[n+1];
System.out.println("enter array");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}System.out.print("enter the index");
int m=sc.nextInt();
System.out.print("enter element");
int p=sc.nextInt();
for(int i=0;i<n+1;i++){
    if(i<m){
        brr[i]=arr[i];}
        else if(i==m){
            brr[i]=p;
        }else{
            brr[i]=arr[i-1];
        }
}

System.out.println("the final array is");
for(int i=0;i<n+1;i++){
    System.out.print((brr[i]+" "));
}
}}
