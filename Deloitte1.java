import java.util.*;
import java.util.Scanner;
public class Deloitte1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0,m=Integer.MAX_VALUE,i;
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            int p=sc.nextInt();
            if(p<m){
                m=p;
                count++;
            }
        }System.out.println(count-1);

    }
}
