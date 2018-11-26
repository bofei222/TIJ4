package com.typeinfo;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;
import static net.mindview.util.Print.*;
import net.mindview.util.TypeCounter;

public class PetCount4 {
    public static void main2(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
    
    public static void main(String[] args) {
        Class c1 = Integer.class;
        Class c2 = Double.class;
        
        boolean b = (new Object().getClass()).isAssignableFrom(c2);
        
        System.out.println(b);
    }
}
