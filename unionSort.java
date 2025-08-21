 import java.util.*;
 public class unionSort{
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n1=sc.nextInt();
System.out.println("enter array");
int arr1[]=new int[n1];
for(int i=0;i<n1;i++){
    arr1[i]=sc.nextInt();
}System.out.println("enter n2");
int n2=sc.nextInt();
int arr2[]=new int[n2];
System.out.println("enter array2");
for(int i=0;i<n2;i++){
    arr2[i]=sc.nextInt();
}int i=0,j=0;
while(i<n1 && j<n2){
    if(arr1[i]<arr2[j]){
        if(i==0||arr1[i]!=arr1[i-1])
        System.out.print(arr1[i]+"");
        i++;
    }else if(arr2[j]<arr1[i]){
        if(j==0||arr2[j]!=arr2[j-1])
        System.out.print(arr2[j]+"");
        j++;
    }else{
        if(i==0||arr1[i]!=arr1[i-1])
        System.out.print(arr1[i]+"");
        i++;
        j++;
    }
}while(i<n1){
            if(i==0||arr1[i]!=arr1[i-1])
        System.out.print(arr1[i]+"");
        i++;
}while(j<n2){
    if(j==0||arr2[j]!=arr2[j-1])
        System.out.print(arr2[j]+"");
        j++;
}
    }
 }