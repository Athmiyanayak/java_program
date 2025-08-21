import java.util.*;
public class calculator {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a");
    int a=sc.nextInt();
    System.out.println("enter b");
    int b=sc.nextInt();
    int choice=sc.nextInt();
    switch(choice){
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a/b);
break;
case 5:
System.out.println(a%b);
break;
default:System.out.println("invalid answer");
    }
  }  
}
