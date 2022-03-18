package com.company.abilities;

import com.company.Main;
import com.company.creatures.Creature;
import com.company.effects.NoEffect;
import com.company.effects.Stun;
import com.company.interfaces.damaging;

public class Fireball extends Ability implements damaging {
    private static final String FIREBALL_ABILITY_NAME = "Fireball";
    private static final String FIREBALL_ABILITY_USING_PHRASE = "FACE YOUR DEMONS! AHHHGR";
    private static final String FIREBALL_DESCRIPTION = "Is counted as turn. " +
            " Deals 20 damage ";
    private static final int FIREBALL_DAMAGE = 20;
    public Fireball(){
        super(FIREBALL_ABILITY_NAME, FIREBALL_ABILITY_USING_PHRASE,
                FIREBALL_DESCRIPTION, new NoEffect());
    }
    @Override
    public void use(Creature creature){
        getEffect().cast(creature);
        Main.battlelog.info(getAbilityName()  + " was casted. Deals " + FIREBALL_DAMAGE +
                " damage ");
        damage(FIREBALL_DAMAGE, creature);
        Main.battlelog.info(" and now " + creature.getClass().getSimpleName()
                + " has only "
                + creature.getHitPoints() + " HP ");
        System.out.println(getAbilityUsingPhrase());
    }
}
