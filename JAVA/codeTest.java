class A{
public A(){
System.out.println("A");
}
}
class B extends A{
public B(){
System.out.println("B"+"\'B\'");
}
}
class C extends B{
public C(){
System.out.println("C");
}
}
public class codeTest {
public static void main(String[] args){
System.out.print('5'+3);
new C();
//C[][] c=new C[1][1];
}
}