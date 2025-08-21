/*import java.util.*;
public class sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        /*int arr[]=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }System.out.println(sum);

    }
}*///Averages//
/*import java.util.*;
public class sum{
    public static int averages(int a,int b,int c){
        int averages=(a+b+c)/3;
        
        return averages;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=averages(a, b, c);
        System.out.println("The average is:"+ans);
    }
}*/
import java.util.*;
public class sum{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    System.out.println("enter the value of n");
    int n=sc.nextInt();
for(int i=1;i<=n;i=i+2){

sum=sum+i;
}System.out.println(sum);
}


}
