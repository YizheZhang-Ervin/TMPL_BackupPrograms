/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yizhe
 */
class A {
 A() {
 System.out.println("class A constructor");
 }
}
class B extends A{
 B() {
 System.out.println("class B constructor");
 }
}
 class classTest {
 public static void main(String[] args) {
 //A a = new B();
 B b=new B();
 }
}
