import java.util.*;
import java.util.Scanner;
public class palindromeNum {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int original=number;
int reversed=0;
int rem;
while(number!=0){
    rem=number%10;
    reversed=reversed*10+rem;
    number=number/10;
}
    if(original==reversed)
        System.out.println("it is palindrome");
    else
        System.out.println("it is not plaindrome");
    
}}
