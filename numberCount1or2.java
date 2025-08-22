import java.util.*;
public class numberCount1or2 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    int n=sc.nextInt();
    System.out.println("enter array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }boolean alreadyprintend=false;
        for(int k=0;k<i;k++){
            if(arr[i]==arr[k]){
                alreadyprintend=true;
                break;
            }
        }if(!alreadyprintend){
            if(count==1){
                System.out.println("the oneoccures 1  is"+arr[i]);
            }else if(count==2){
                System.out.println("the occurence of 2 is"+arr[i]);
            }
        }
    }
    }
}
