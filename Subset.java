import java.util.*;
public class Subset {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1");
        int n1=sc.nextInt();
    int arr1[]=new int[n1];
    System.out.println("enter arr1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }System.out.println("enter n2");
        int n2=sc.nextInt();
        System.out.println("enter arr2");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        boolean isfound=true;
        for(int i=0;i<n2;i++){
            boolean valid=false;
for(int j=0;j<n1;j++){
    if(arr2[i]==arr1[j]){
        valid=true;
        break;
    }}if(!valid){
        isfound=false;
        break;
    }
}if(isfound){
    System.out.print("true valid ");
}else{
    System.out.println("not subset");
}
        }
    }

