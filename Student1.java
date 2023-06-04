class Student1{
int rollno;
String name;
Student1(){rollno=0;name=null;}
Student1(int t,String n){
rollno=t;
name=n;
}
void inf()
{System.out.println(+rollno+" "+name);}
}
class A2{
public static void main(String args[]){
Student1 s1=new Student1(21,"sai");
Student1 s2;
s2=new Student1();
s1.inf();
s2.inf();
}}