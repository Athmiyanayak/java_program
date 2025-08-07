import java.util.*;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int number=sc.nextInt();
int original=number;
int digit,sum=0;
while(number!=0){
    digit=number%10;
    sum=sum+(digit*digit*digit);
    number=number/10;
}if(original==sum){
    System.out.println("it is armstrong");
}else{
    System.out.println("it is not armstrong");
}
    }
}
