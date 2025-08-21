import java.util.*;
public class duplicatesRemove {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    System.out.println("enter array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }int j=0;
    int temp[]=new int[n];
    for(int i=0;i<n-1;i++){
        if(arr[i]!=arr[i+1]){
            temp[j]=arr[i];
            j++;
        }
    } temp[j]=arr[n-1];
    j++;
    for(int i=0;i<j;i++){
        System.out.print(temp[i]);
    }
}
}
