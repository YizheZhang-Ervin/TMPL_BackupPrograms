import java.util.ArrayList;

class ArrayListTest{
public static void main(String[] args){
ArrayList[] a=new ArrayList[4];
a[1]=new ArrayList();
a[1].add(1);
a[1].add(2);
a[2]=new ArrayList();
a[2].add(3);
a[3]=new ArrayList();
a[3].add(4);
System.out.println(a[1].get(1));

}
}