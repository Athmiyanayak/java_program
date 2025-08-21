import java.util.*;
public class LinearSearch {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}System.out.println("enter number");
int number=sc.nextInt();
for(int i=0;i<n;i++){
    if(arr[i]==number){
System.out.println("found at index"+i);
return;
    }
}
}    
}
