import java.util.*;
public class thirdLarge{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>first ){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first &&arr[i]!=third){
                third=second;
                second=arr[i];
            }
        else{
            if(arr[i]>third && arr[i]!=first &&arr[i]!=second){
                third=arr[i];
            }
        }}
            if(third==Integer.MIN_VALUE)
                System.out.println("not found");
            else
                System.out.println("second largest element is: " + third);
            
        
    }
}
