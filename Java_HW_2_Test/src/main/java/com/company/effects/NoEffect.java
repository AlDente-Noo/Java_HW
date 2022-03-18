package com.company.effects;

import com.company.creatures.Creature;

public class NoEffect extends Effect{
    private static final String NO_EFFECT_DESCRIPTION = "no effect";
    public NoEffect(){
        super(NO_EFFECT_DESCRIPTION);
    }
    @Override
    public void cast(Creature creature){

    }
    @Override
    public void uncast(Creature creature){

    }
}
