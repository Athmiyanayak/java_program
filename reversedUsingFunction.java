 import java.util.*;
 import java.util.Scanner;
 import java.util.Arrays;
 public class reversedUsingFunction{
    public static String Reversedstring(String str){
String reversed="";
for(int i=str.length()-1;i>=0;i--){
    reversed=reversed+str.charAt(i);
}return reversed;
    }
 public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String input=sc.nextLine();
String result=Reversedstring(input);
System.out.println(result);
 }}