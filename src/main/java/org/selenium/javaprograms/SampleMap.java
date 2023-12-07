//A Map is an object that maps keys to values.
//        A map cannot contain duplicate keys: Each key can map to at most one value.

package org.selenium.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class SampleMap {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Ron");
        map.put(101,"Shown");
        map.put(102,"Aaron");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
