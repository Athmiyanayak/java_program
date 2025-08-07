/*import java.util.*;
import java.util.Scanner;
public class Binary {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=sc.nextInt();
    String binary=Integer.toBinaryString(n);
System.out.println(binary);
}
}*/

import java.util.*;
import java.util.Scanner;
public class Binary{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=sc.nextInt();
    String binary="";
    if(n==0){
        binary="0";
    }else{
        while(n>0){
           int  rem=n%2;
binary=rem+binary;
n=n/2;
      }  }System.out.println(binary);
    

    }
}