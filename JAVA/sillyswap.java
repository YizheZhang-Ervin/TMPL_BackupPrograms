class A
{
public int i=0;
public A(int i)
{ this.i=i;
}
}

public class sillyswap
{
public static void main(String[] args)
{ A a1=new A(1);
   A a2=new A(2);
   System.out.println(a1.i+"  "+a2.i);
   A temp=a1;
   a1=a2;
   a2=temp;
   System.out.println(a1.i+"  "+a2.i);
}
}