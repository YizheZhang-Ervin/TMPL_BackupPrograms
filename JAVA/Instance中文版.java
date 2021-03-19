package com.ez;
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
//接飞机数据库,到达就flag设为1;   //如何使用preparedstatement语句
if(planeNo.equals("HU7961")&& 1==flag)        //用equals非等号，&&表示第一个条件不满足则结束不用再看第二个
return "Boston";
else return "unknown";
}
}

public class test
{
public static void main(String[] args)
{
Plane plane=new Plane();
Scanner scn=new Scanner(System.in);
String x;
x=scn.next();
plane.setNo(x);      //不要双引号
System.out.print(plane.getLocation());
if("Boston"==plane.getLocation())         //要双引号
System.out.print("到达打卡确认");
}
}