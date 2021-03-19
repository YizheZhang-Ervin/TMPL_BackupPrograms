
import java.util.Scanner;
class Plane
{
private String planeNo;
public void setNo(String planeNo)
{
this.planeNo=planeNo;
System.out.print(planeNo);
}
public String getLocation()
{
int flag=1;
if(planeNo.equals("HU7961")&& 1==flag) 
return "Boston";
else return "unknown";
}
}

public class Instance
{
public static void main(String[] args)
{
Plane plane=new Plane();
Scanner scn=new Scanner(System.in);
String x;
x=scn.next();
plane.setNo(x);
System.out.print(plane.getLocation());
if("Boston"==plane.getLocation())
System.out.print("Arriving confirmed");
}
}