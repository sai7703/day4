class Rectangle{
int length;
int width;
void ins(int a,int b){
length=a;
width=b;
}
void dis(){
System.out.println("area of rectangle="+(length*width));
}}
class A4{
public static void main(String args[]){
Rectangle r1=new Rectangle(),r2=new Rectangle();
r1.ins(11,5);
r2.ins(3,15);
r1.dis();
r2.dis();
}}