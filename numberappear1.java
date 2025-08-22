import java.util.*;
public class numberappear1 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
System.out.println("enter array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}for(int i=0;i<n;i++){
     int count=0;
    for(int j=0;j<n;j++){
    if(arr[i]==arr[j]){
count++;
    }}if(count==1){
        System.out.println("the number appear only once is"+arr[i]);
    }if(count==2){
        System.out.println("the number occurs twice"+arr[i]);
    }
}
}
}
