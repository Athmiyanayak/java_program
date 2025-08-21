import java.util.*;
public class missing{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++){
             boolean found=false;
           for(int j=0;j<n;j++){
            if(arr[j]==i){
            found=true;
            break;}
           } if(!found){
            System.out.print(i+"");
           
        }
    }}
}