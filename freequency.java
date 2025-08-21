import java.util.*;
public class freequency {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
System.out.println("enter array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}boolean isVisited[]=new boolean[n];
int count=0;
for(int i=0;i<n;i++){ 

    if(isVisited[i]){
        continue;
    }count=1;
    for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
            isVisited[j]=true;
            count++;
        }
    }System.out.println(arr[i]+"has"+count+"freequency");
}
}
}
