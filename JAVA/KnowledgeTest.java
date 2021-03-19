/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author yizhe
 */
public class KnowledgeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> x=new HashMap<>();
            x.put(1,"A");
            x.put(2,"B");
            x.put(3,"Z");
            x.remove(1);
            x.remove("B");
            x.replace(3,"C");
            x.toString();
            System.out.println(x);
            
        List<Map.Entry<Integer,String>> x2=new ArrayList<>(x.entrySet());
            x2.toString();
            System.out.println(x2);
        
        List<String> y=new ArrayList<>();
            y.add("a");
            y.add("b");
            y.add("c");
            y.remove(0);
            //y.remove(9);//IndexOutOfBoundsException
            y.remove("c");
            y.toString();
            System.out.println(y);
            y.clear();
        
        int[] z=new int[5];
            z[0]=1;
            Arrays.toString(z);
            System.out.println(z);
            int zsum=Arrays.stream(Arrays.copyOfRange(z,0,1)).sum();
        System.out.println("sum="+zsum);
        int[] z2={1,2,3,4,5};
            z2.toString();
            System.out.println(z2);
            boolean a=Arrays.equals(z,z2);
            System.out.println(a);
        
        int[] z3={2};
            Arrays.fill(z3, 0);
            System.out.println(z3[0]);
  
        String c="  111  ";
        String d=c.trim();
        String f="123";
        String g=c.concat(d).concat(f);
            System.out.println(c+d+f);
            System.out.println(g);
        for(ee b:ee.values()){
            System.out.println(b);
        }
        StringBuffer sb=new StringBuffer(f);
        StringBuilder sb2=new StringBuilder(f);
        System.out.println( sb.reverse());
        System.out.println(sb2.reverse());
        
        Pattern p =Pattern.compile("(\\w)+?.*$");
        Matcher m = p.matcher("Do you like this quiz?");
        boolean b = m.matches();
        System.out.println(b);
        
        int h=9;
        String i=String.valueOf(h);
        System.out.println(i);
        
        System.out.println("zebra".compareTo("emu")); 
        System.out.println((new Integer(5)).compareTo(new Integer(8)));
        System.out.println("ZURICH".compareTo("cairo")); 
        System.out.println("pit viper".compareTo("pit"));
    
        try {
            int aa[] = {1, 2, 3, 4};
            for (int ii = 1; ii <= 4; ii++) {
                System.out.print("a[" + ii + "]="+ aa[ii] + " ");
            }
            } catch (Exception e) {
            System.out.println("Exception occur");
//            } catch (ArrayIndexOutOfBoundsException e) {
//           System.out.println("ArrayIndexOutOfBoundsException occur");
            }
    }
    enum ee{
        red,blue,yellow;
    }
    
}
