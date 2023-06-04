import java.util.*;
class Test3c{
public static void main(String args[]){
int num1,num2;
Scanner s=new Scanner(System.in);
num1=s.nextInt();
num2=s.nextInt();
String str="";
for(int i=0;i<=num1;i=i+num2){
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
System.out.println(str.charAt(i));
}}
