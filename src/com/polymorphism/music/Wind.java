package com.polymorphism.music;

//Wind objects are instruments
//because they have the same interface:

import com.generics.HasF;

public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play: " +note);
    }
}