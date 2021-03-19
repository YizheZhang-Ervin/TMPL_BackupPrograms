import java.util.*;

public class Listtest
{
public static void main(String[] args)
{
List<Integer> L=new ArrayList<>();
L.add(1);
L.add(2);
L.add(5);
L.add(3);
L.add(4);
for(int i=0;i<5;i++)
{
System.out.print(L.get(i));
}
}
}