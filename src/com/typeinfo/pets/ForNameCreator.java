package com.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

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
    public static void loader() {
        for (String name : typeNames)
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }

}
