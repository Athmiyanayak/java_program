import java.util.*;
import java.util.Arrays;
public class secondLargest {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6};
        int i;
    int first=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;
    for(i=0;i<arr.length;i++){
    if(arr[i]>first){
        second=first;
        first=arr[i];
    }else if(arr[i]>second && arr[i]!=first){
    second=arr[i];
    }}
    if(second==Integer.MIN_VALUE){
    System.out.println("not found");
    }
    else {
    System.out.println("found"+second);
}
}}