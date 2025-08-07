import java.util.*;
import java.util.Scanner;
public class StringgChara {
   public static void main(String[]args){
    System.out.println("enter the string");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char ch=sc.next().charAt(0);
    int i,count=0;
    for(i=0;i<str.length();i++){
        if(str.charAt(i)==ch){
            count++;
        }
    }
   System.out.println("the occurences are"+count);
}} 
