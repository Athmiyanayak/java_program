import java.util.*;
public class cons0and1{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int current_count=1,max_count=1,max_num,i;
      System.out.println("enter n");
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(i=0;i<n;i++){
         arr[i]=sc.nextInt();
       if(arr[i]!=0&&arr[i]!=1){
          System.out.println("it should be 1 or 0");
          return;
      }}
      max_num=0;
      for(i=1;i<n;i++){
          if(arr[i]==arr[i-1]){
              current_count++;
          }else{
              current_count=1;
          }if(current_count>max_count){
              max_count=current_count;
              max_num=arr[i];
          }}System.out.println("max count of number"+max_num +"is"+max_count);
          
    }
    
}