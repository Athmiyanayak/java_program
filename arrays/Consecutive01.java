import java.util.*;
public class Consecutive01 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int current_count=1,max_count=1;
    System.out.println("enter n");
    int n=sc.nextInt();
    System.out.println("enter the array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }for(int i=1;i<n;i++){
    if(arr[i]==arr[i-1]){
        current_count++;
    }else{
        current_count=1;
    }if(current_count>max_count){
        max_count=current_count;
    }}System.out.println(max_count);
    
} 
}
