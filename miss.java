/*import java.util.Scanner;
import java.util.Scanner;
import java.util.Arrays;
public class miss {
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
boolean found=false;
for(int j=0;j<n;j++){
    if(arr[j]==i){
        found=true;
        break;
    }}if(!found){
        System.out.print(i+" ");
    
}
}
}
}
*/
import java.util.*;
public class miss{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
           int sum=0,total;
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
        arr[i]=sc.nextInt();
        sum=sum+arr[i];
        }
       
         
             total=n*(n+1)/2;
            
        System.out.println(total-sum);
    
} 
}