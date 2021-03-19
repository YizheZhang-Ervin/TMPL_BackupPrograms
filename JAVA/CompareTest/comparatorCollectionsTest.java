import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class A
{
	public int No;
	public A(int no)
	{
		No=no;	
	}
	

}


public class comparatorCollectionsTest implements Comparator<A>
{
	public int compare(A a1,A a2)
	{
		int a=a1.No;
		int b=a2.No;
		return b-a;		
	}
	
	public static void main(String[] args)
	{
		List<A> list=new ArrayList<A>();
		list.add(new A(5));
		list.add(new A(1));
		list.add(new A(7));
		System.out.println("before");
		for(A a:list)
		{ 
			System.out.print(a.No);
		}
		Collections.sort(list,new comparatorCollectionsTest());
		System.out.println('\n'+"after");
		for(A a:list)
		{
			System.out.print(a.No);
		}
	}
}
