/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author yizhe
 */
public class nonrepeatwordClass {
    public static void main(String[] args){
        String string1="Ambassdor";
//function1
        Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>(string1.length());
        for (char c : string1.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }else{
                throw new RuntimeException("didn't find any non repeated Character");
            }
        }
//function2
        String str="assassin";
        Map<String,Integer> x=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(x.containsKey(str.charAt(i)+"")){
                x.put(str.charAt(i)+"",x.get(str.charAt(i)+"")+1);
            }else{
                x.put(str.charAt(i)+"",1);
            }
        }
        for(String s:x.keySet()){
            if(x.get(s)==1){
                System.out.println(s);
                break;
            }
        }


    }
}
