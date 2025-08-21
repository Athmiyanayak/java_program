import java.util.*;
import java.util.Scanner;
public class reversee {
    public static boolean ReversedString(String str){
String output=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
int len=output.length();
for(int i=0;i<len/2;i++){
    if(output.charAt(i)!=output.charAt(len-i-1)){
        return false;
    }
}return true;
    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
if(ReversedString(input)){
    System.out.println("The string is a palindrome");
} else {
    System.out.println("The string is not a palindrome");
}

}
}