package com.example.basicprogofjava;

import java.util.ArrayList;

/**
 * Created by PC on 25/03/2018.
 */

public class CollectionListJava {
 public static void main(String []args)
 {
     ArrayList<String> a =new ArrayList<String>();

     a.add("File");
     a.add("New Kotlin");
     a.add("File name");
     a.add("SaveFile");


     System.out.println("Currently the array list has following elements:"+a);

	  /*Add element at the given index*/
     a.add(0, "Java");
     a.add(1, "Android");

	  /*Remove elements from array list like this*/
     a.remove("File");
     a.remove("File name");

     System.out.println("Current array list is:"+a);

	  /*Remove element from the given index*/
     a.remove(1);

     System.out.println("Current array list is:"+a);
 }

 }
