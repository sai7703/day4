class Student1{
int id;
String name;
float salary;
void dis(int t,String n,float r){
id=t;
name=n;
salary=r;
}
void inf()
{System.out.println(+id+" "+name+" "+salary);}
}
class A3{
public static void main(String args[]){
Student1 s1=new Student1();
Student1 s2=new Student1();
Student1 s3=new Student1();
s1.dis(21,"sai",45000);
s2.dis(22,"kirito",60000);
s3.dis(23,"bharath",99990);
s1.inf();
s2.inf();
s3.inf();
}}

