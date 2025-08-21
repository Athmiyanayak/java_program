import java.util.*;
public class frequency {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter array");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out.println("enter the value of k");
int k=sc.nextInt();
boolean found=false;
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==k){
            System.out.println("("+arr[i]+","+arr[j]+")");
            found=true;
        }
    }
}if(!found){
System.out.println("no pairs are found");
}
} 
}
