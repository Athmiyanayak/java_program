import java.util.*;
public class movetoend0 {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
//int inserted[]=new int[n];
System.out.println("enter array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
} int inserted=0;
for(int i=0;i<n;i++){
    if(arr[i]!=0){

        arr[inserted]=arr[i];
        inserted++;
    }}while(inserted<n){
        arr[inserted]=0;
        inserted++;
    }for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }


}
}
