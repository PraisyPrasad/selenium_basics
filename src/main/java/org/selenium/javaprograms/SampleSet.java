package org.selenium.javaprograms;
import java.util.*;
public class SampleSet {
    public static void main(String args[])
    {
        // Creating an empty Set
        Set<String> set = new HashSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        // Displaying the Set
       set.forEach(System.out::println);
       //System.out.println("Set: " + set);


        // Creating an iterator
        Iterator value = set.iterator();

        // Displaying the values after iterating through the iterator
        System.out.println("The iterator values are: ");
//        while (value.hasNext()) {//method in java scanner class with returns true if this scanner has another token in its input
//            System.out.println(value.next());//next() is used to obtain next elements from set
        for(String a:set){
            System.out.println(set);
        }
        }
    }

