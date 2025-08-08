import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class mergearr2 {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n1");
int n1=sc.nextInt();
int arr1[]=new int[n1];
System.out.println("enter array1");
for(int i=0;i<n1;i++){
    arr1[i]=sc.nextInt();
}System.out.println("enter n2");
int n2=sc.nextInt();
System.out.println("enter array2");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }int i=0,j=0,k=0;
        int arr3[]=new int[n1+n2];
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
            arr3[k++]=arr1[i++];
                }else{
                    arr3[k++]=arr2[j++];
                }}while(i<n1){
                    arr3[k++]=arr1[i++];
                }while(j<n2){
                    arr3[k++]=arr2[j++];
                }for(int m=0;m<k;m++){
                    System.out.println(arr3[m]);
                  }  }
    
}
