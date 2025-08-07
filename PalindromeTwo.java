import java.util.*;
 import java.util.Scanner;
 import java.util.Arrays;
 public class PalindromeTwo{
    public static boolean Palindromeofs(String str){
    String output=str.replaceAll("[^a-zA-Z]","").toLowerCase();
    int len=output.length();
    for(int i=0;i<len/2;i++){
        if(output.charAt(i)!=output.charAt(len-i-1)){
            return false;
        }
    }return true;
    }
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the input");
    String input=sc.nextLine();
    if(Palindromeofs(input)){
        System.out.println("true its palindrome");
    }else{
        System.out.println("not plaindrome");
    }
 }}