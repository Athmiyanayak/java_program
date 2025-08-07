import java.util.*;
import java.util.Scanner;
public class palindromSttring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String strr=sc.nextLine();
int length=strr.length();
int ispalindrome=1;
for(int i=0;i<length/2;i++){
    if(strr.charAt(i)!=strr.charAt(length-i-1)){
        ispalindrome=0;
        break;
    }
}



if(ispalindrome==1)
    System.out.println("it is palindrome");
else
System.out.println("Not palindrome");}}