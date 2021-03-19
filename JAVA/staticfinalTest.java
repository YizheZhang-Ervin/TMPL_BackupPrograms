/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knowledgetest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yizhe
 */
class NewClass {
    String string0;
    int int0;
    static String string1;
    static int int1;
    final String string2;
    final int int2;
    final static String string3;
    static final int int3;
    static{
        string3="string3";
        int3=3;
    }
    public NewClass(){
        string2="string2";
        int2=2;
        
    }
    public void useVariable(){
        System.out.println(string0+","+int0+","+string1+","+int1+","+string2+","+int2+","+string3+","+int3);
    }
}
public class staticfinalTest{
    public static void main(String[] args) {
        NewClass c=new NewClass();   
        c.useVariable();


        }
    
}