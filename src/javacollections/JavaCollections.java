/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Vector;
import java.util.TreeSet;


/**
 *
 * @author NehaA
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n~~~~~~~*********************~~~~~~~ JAVA COLLECTIONS ~~~~~~~*********************~~~~~~~"); 
        
        System.out.println("\n********************* ARRAYLIST VS VECTOR *********************");
        
        System.out.println("\n____________________ ARRAYLIST ____________________");

        ArrayList<String> al = new ArrayList<String>(); 
        al.add("item 1"); 
        al.add("item 2"); 
        al.add("item 3"); 
        al.add("item 4");
        al.add("item 2");
        System.out.println("\nArrayList elements are:"); 
        Iterator it = al.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next()); 
  
        System.out.println("\n____________________ VECTOR ____________________");
        Vector<String> v = new Vector<String>(); 
        v.addElement("item 1"); 
        v.addElement("item 2"); 
        v.addElement("item 3"); 
        v.addElement("item 4");
        v.addElement("item 2");
        System.out.println("\nVector elements are:"); 
        Enumeration e = v.elements(); 
        while (e.hasMoreElements()) 
            System.out.println(e.nextElement());
        
        System.out.println("\n********************* HASHSET VS SORTED TEST VS TREE SET *********************");
        
        System.out.println("\n____________________ HASHSET ____________________");
        HashSet<String> hset = new HashSet<String>(); 
        hset.add("item 1"); 
        hset.add("item 2"); 
        hset.add("item 3"); 
        hset.add("item 4"); 
        hset.add("item 2"); 
        System.out.println("\nHashSet contains: "); 
        for (String temp : hset) { 
            System.out.println(temp); 
        } 
        
        System.out.println("\n____________________ SORTED SET ____________________");
        SortedSet<String> sset = new TreeSet<>(); 
        sset.add("item 1");
        sset.add("item 2");
        sset.add("item 3");
        sset.add("item 4");
        sset.add("item 2");
  
        System.out.println("\nSorted Set contains: " + sset); 
        
        System.out.println("\n____________________ TREE SET ____________________");
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("item 1");
        tset.add("item 2");
        tset.add("item 3");
        tset.add("item 4");
        tset.add("item 2");
        System.out.println("\nTreeSet contains: ");
        for (String temp : tset) {
            System.out.println(temp);
        }
        
        System.out.println("\n********************* ARRAY VS LIST *********************");
        
        System.out.println("\n____________________ NORMAL ARRAY SET ____________________");
        int[] arr = new int[2]; 
        arr[0] = 1; 
        arr[1] = 2; 
        System.out.println("\nArray contains: ");
        System.out.println(Arrays.toString(arr));
  
        System.out.println("\n____________________ ARRAY LIST ____________________");
        ArrayList arrL = new ArrayList(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add("three"); 
        arrL.add(4); 
        arrL.add(4);
        System.out.println("\nList contains: ");
        System.out.println(arrL);
        
        System.out.println("\n********************* NAVIGABLE SET VS NAVIGABLE MAP *********************");
        
        System.out.println("\n____________________ NAVIGABLE SET ____________________");
        NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(0); 
        ns.add(1); 
        ns.add(2); 
        ns.add(3); 
        ns.add(4); 
        ns.add(5); 
        ns.add(6); 
        NavigableSet<Integer> reverseNs = ns.descendingSet(); 
        System.out.println("\nNavigable Set Normal order:\n " + ns); 
        System.out.println("\nNavigable Set Reverse order:\n " + reverseNs); 

        System.out.println("\n____________________ NAVIGABLE MAP ____________________");
        NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();
        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);
        System.out.printf("\nNavigable Map Original Map:\n %s%n", nm);
        System.out.printf("\nNavigable Map Reverse Map:\n %s%n",nm.descendingMap());
    }
    
}
