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
class countQuantityOfEachTimePeriod {
    static Map<Character,Integer> map=new HashMap();
    static Map<Character,Integer> map2=new HashMap();
    public static void initial(){
        map.put('a',0);
        map.put('b',1);      
        map.put('c',2);
        map.put('d', 3); 
        map.put('e', 4);
        map.put('f', 5); 
        map.put('g', 6);
        map.put('h', 7); 
        map.put('i', 8);
        map.put('j' , 9); 
        map.put('k', 10);
        map.put('l', 11); 
        map.put('m', 12);
        map.put('n', 13); 
        map.put('o', 14);
        map.put('p', 15); 
        map.put('q', 16);
        map.put('r', 17); 
        map.put('s', 18);
        map.put('t', 19); 
        map.put('u', 20);
        map.put('v', 21); 
        map.put('w', 22);
        map.put('x', 23); 
        map2.put('a',0);
        map2.put('b',0);      
        map2.put('c',0);
        map2.put('d', 0); 
        map2.put('e', 0);
        map2.put('f', 0); 
        map2.put('g', 0);
        map2.put('h', 0); 
        map2.put('i', 0);
        map2.put('j' , 0); 
        map2.put('k', 0);
        map2.put('l', 0); 
        map2.put('m', 0);
        map2.put('n', 0); 
        map2.put('o', 0);
        map2.put('p', 0); 
        map2.put('q', 0);
        map2.put('r', 0); 
        map2.put('s', 0);
        map2.put('t', 0); 
        map2.put('u', 0);
        map2.put('v', 0); 
        map2.put('w', 0);
        map2.put('x', 0); 
    }
    public static void calculate(int start,int end){
        
        
        for(Map.Entry<Character,Integer> m: map.entrySet()){
            if(Integer.parseInt(m.getValue().toString())>=start && Integer.parseInt(m.getValue().toString())<=end){
                map2.replace((Character)m.getKey(),map2.get(m.getKey())+1);
            }
        }
        
        
    }
    public static void main(String[] args) {
       int start =0;
       int end =0;
       initial();
       calculate(9,20);
       calculate(13,18);
       calculate(11,19);
       calculate(15,20);
       calculate(10,15);
       calculate(8,22);
       calculate(14,18);
       calculate(9,20);
       calculate(11,17);
       calculate(12,21);
       for(Map.Entry<Character,Integer> m:map2.entrySet()){
           System.out.println(m.getKey()+"-"+m.getValue());
       }
    }
}
