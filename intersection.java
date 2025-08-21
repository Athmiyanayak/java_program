import java.util.*;
public class intersection {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("enter arrayy");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }int n2=sc.nextInt();
        //System.out.println("enter n2");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else{
                if(i==0||arr1[i]!=arr1[i-1])
                System.out.print(arr1[i]+"");
                i++;
                j++;
            }
        }
    }
}
