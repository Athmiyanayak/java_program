import java.util.*;
public class negEndPosStart {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
System.out.println("entera array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}int i=0,j=n-1;
while(true){
while(arr[i]<0 && i<j){
    i++;
}while(arr[j]>0 && i<j){
    j--;
}
if(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}
else{
    break;}}

for(int k=0;k<n;k++){

System.out.print(arr[k]+" ");
}    }}

