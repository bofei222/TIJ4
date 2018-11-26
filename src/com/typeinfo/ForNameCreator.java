package com.typeinfo;

import java.util.ArrayList;
import java.util.List;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.PetCreator;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
        new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "com.typeinfo.pets.Mutt",
            "com.typeinfo.pets.Pug",
            "com.typeinfo.pets.EgyptianMau",
            "com.typeinfo.pets.Manx",
            "com.typeinfo.pets.Cymric",
            "com.typeinfo.pets.Rat",
            "com.typeinfo.pets.Mouse",
            "com.typeinfo.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                    (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    public List<Class<? extends Pet>> types() { return types; }
}
