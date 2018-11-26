package com.containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static net.mindview.util.Print.*;
import net.mindview.util.Countries;

public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.addAll(Countries.names(6));
		c.add("ten");
		c.add("eleven");
		print(c);
		//Make an array from the List:
		Object[] array =c.toArray();
		//Make a String array from the List:
		String[] str=c.toArray(new String[0]);
	    // Find max and min elements; this means
	    // different things depending on the way
	    // the Comparable interface is implemented:
		print("Collections.max(c)= "+Collections.max(c));
		print("Collections.min(c)= "+Collections.min(c));
		// Add a Colletion to another Collction
		Collection<String> c2=new ArrayList<String>();
		c2.addAll(Countries.names(6));
		c.addAll(c2);
		print(c);
		c.remove(Countries.DATA[0][0]);
		print(c);
		c.remove(Countries.DATA[1][0]);
		print(c);
		
	}
}
