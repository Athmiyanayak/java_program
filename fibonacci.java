import java.util.*;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of n");
   int n=sc.nextInt();
   int s1=0,s2=1,s3;
System.out.println(s1);
System.out.println(s2);
s3=s1+s2;
while(s3<=n){
    System.out.println(s3);

s1=s2;
s2=s3;
s3=s1+s2;

}
    }}