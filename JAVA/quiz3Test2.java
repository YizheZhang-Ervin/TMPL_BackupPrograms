abstract class A
{
 abstract int firstMethod(int i);
 abstract int secondMethod(int i);
 int thirdMethod(int i)
 {
System.out.println(i); 
return secondMethod(i++);

 }
}
abstract class B extends A
{
 @Override
 int secondMethod(int i)
 {
System.out.println(i); 
 return firstMethod(++i);
 }
}
class C extends B
{
 @Override
 int firstMethod(int i)
 {
System.out.println(i); 
 return ++i;
 }
}
class quiz3Test2{
 public static void main(String []args){
 C c = new C();
System.out.println(c.thirdMethod(121121));
 }
}