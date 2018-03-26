package com.example.pc.basicprogofkotlin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by PC on 25/03/2018.
 */

public class CollectionMapJava {
    static void map() {
        Map<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(1, "A");
        mp.put(2, "B");
        mp.put(3, "C");
        mp.put(4, "D");
        mp.put(5, "E");

        System.out.println("Display Map Element Using of For loop");
        for (Map.Entry m : mp.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        mp.put(3,"X");

        mp.remove(4);

        System.out.println("Display map element using iterator");
        Set s=mp.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry ent=(Map.Entry)itr.next();
            System.out.println(ent.getKey()+""+ent.getValue());

        }
        mp.clear();
        if (mp.isEmpty()){
            System.out.println("Map is Empty");

        }
        else{
                while(itr.hasNext()){
                    Map.Entry ent=(Map.Entry)itr.next();
                    System.out.println(ent.getKey()+""+ent.getValue());
                }
        }
    }
    public static void main(String [] args)
    {
        map();
    }
}
