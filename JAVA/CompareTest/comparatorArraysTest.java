import java.util.Arrays;
import java.util.Comparator;

public class comparatorArraysTest
{
	public static void main(String[] args)
	{
		String[] s={"a","s","d","f","g"};
		Arrays.sort(s, new Comparator<String>(){
			public int compare(String x,String y)
			{
				return x.compareTo(y);
			}
		}  );
		for(String ss: s)
		{
			System.out.print(ss);	
		}
	}
}