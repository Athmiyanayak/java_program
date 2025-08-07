import java.util.*;
import java.util.Scanner;
public class GCD {
 public static int GFGOFNUM(int num1,int num2){
while(num2!=0){
    int temp=num2;
    num2=num1%num2;
    num1=temp;

}return num1;
 }   

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter num1");
int num1=sc.nextInt();
System.out.println("enter num2");
int num2=sc.nextInt();
int output=GFGOFNUM(num1,num2);
System.out.println(+output);
}
}