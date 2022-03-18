package com.company.interfaces;

import com.company.creatures.Creature;

public interface damaging {
    default public void damage(int damage, Creature creature){
        creature.getDamage(damage);
    }
}
