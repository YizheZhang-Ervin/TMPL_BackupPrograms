import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A implements Comparable<A>
{
	public int No;
	public A(int no)
	{
		No=no;	
	}
	public int compareTo(A aa)
	{
		if(this.No>aa.No)            return 1;
		else if (this.No==aa.No)   return 0;
		else                                 return -1;		
	}
}


public class comparableCollectionsTest{
	public static void main(String[] args)
	{
		List<A> list=new ArrayList<A>();
		list.add(new A(5));
		list.add(new A(1));
		list.add(new A(7));
		System.out.println("before");
		for(A aa:list)
		{ 
			System.out.print(aa.No);
		}
		Collections.sort(list);
		System.out.println('\n'+"after");
		for(A aa:list)
		{
			System.out.print(aa.No);
		}
	}
}
