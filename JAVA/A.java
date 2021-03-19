import java.util.Arrays;
class B implements Runnable //线程
{
public String threadName;
public B(String xx)
{
threadName=xx;
}
public void run()
{int i=0;
while(i<20)
{
System.out.print("t-"+ threadName);
i++;
}
}
}


class A 
{
 public static void main(String[] args) throws Exception //抛出异常
{
 int[] a=new int[]{1,2,3,4,5};
 int[] b=new int[5];
 b=Arrays.copyOf(a,a.length);   //Arrays类

//for(int i=0;i<5;i++)
//{System.out.print(b[i]);
//}

for(int element:b)             //foreach循环
{System.out.print(element+" ");
}

Runnable x1=new B("x1");
Thread t1=new Thread(x1);
t1.start();
t1.setPriority(10);
Thread.yield();
Runnable x2=new B("x2");
Thread t2=new Thread(x2);
t2.start();
t1.join();
Thread.sleep(1000);
}
}