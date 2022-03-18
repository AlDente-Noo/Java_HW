package com.company.effects;

import com.company.Main;
import com.company.creatures.Creature;

public class Stun extends Effect {
    private static final String STUN_DESCRIPTION = "enemy can't move and attack";
    public Stun(){
        super(STUN_DESCRIPTION);
    }
    @Override
    public void cast(Creature creature){
        creature.setCanAttack(false);
        creature.setCanMove(false);
        Main.battlelog.info(creature.getClass().getSimpleName() + " gets a stun ");
    }
    @Override
    public void uncast(Creature creature){
        creature.setCanAttack(true);
        creature.setCanMove(true);
    }
}
