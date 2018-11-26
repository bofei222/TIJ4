package com.typeinfo;

import static net.mindview.util.Print.*;
import java.util.HashMap;
import com.typeinfo.pets.Cat;
import com.typeinfo.pets.Dog;
import com.typeinfo.pets.ForNameCreator;
import com.typeinfo.pets.Hamster;
import com.typeinfo.pets.Manx;
import com.typeinfo.pets.Mouse;
import com.typeinfo.pets.Mutt;
import com.typeinfo.pets.Pet;
import com.typeinfo.pets.PetCreator;
import com.typeinfo.pets.Pug;
import com.typeinfo.pets.Rat;
import com.typeinfo.pets.Rodent;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                counter.count("Pet");
            if (pet instanceof Dog)
                counter.count("Dog");
            if (pet instanceof Mutt)
                counter.count("Mutt");
            if (pet instanceof Pug)
                counter.count("Pug");
            if (pet instanceof Cat)
                counter.count("Cat");
            if (pet instanceof Manx)
                counter.count("EgyptianMau");
            if (pet instanceof Manx)
                counter.count("Manx");
            if (pet instanceof Manx)
                counter.count("Cymric");
            if (pet instanceof Rodent)
                counter.count("Rodent");
            if (pet instanceof Rat)
                counter.count("Rat");
            if (pet instanceof Mouse)
                counter.count("Mouse");
            if (pet instanceof Hamster)
                counter.count("Hamster");
        }
        print();
        print(counter);
    }
    
    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
