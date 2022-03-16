package com.company.effects;

import com.company.creatures.Creature;

public abstract class Effect{

    private final String description;
    public Effect(String description) {
        this.description = description;
    }
    abstract public void cast(Creature creature);
    abstract public void uncast(Creature creature);
    public String getDescription() {
        return description;
    }

}
