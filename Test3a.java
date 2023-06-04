import java.util.*;
class Test3a{
public static void main(String args[]){
int num1,num2;
Scanner s=new Scanner(System.in);
num1=s.nextInt();
num2=s.nextInt();
for(int i=0;i<=num1;i++){
if(i%num2==0){
System.out.printf("%d",i);
if(i<=(num1-num2))
System.out.printf(",");
}}}}
