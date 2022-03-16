package com.company.abilities;

import com.company.creatures.Creature;
import com.company.effects.NoEffect;
import com.company.effects.Stun;
import com.company.interfaces.damaging;

public class Fireball extends Ability implements damaging {
    private static final String FIREBALL_ABILITY_NAME = "Infernal Blade";
    private static final String FIREBALL_ABILITY_USING_PHRASE = "FACE YOUR DEMONS! AHHHGR";
    private static final String FIREBALL_DESCRIPTION = "Is counted as turn. " +
            "Diablo impales enemy with his blade: stuns and totally destroys enemy's armor";
    private static final int FIREBALL_DAMAGE = 14;
    public Fireball(){
        super(FIREBALL_ABILITY_NAME, FIREBALL_ABILITY_USING_PHRASE,
                FIREBALL_DESCRIPTION, new NoEffect());
    }
    @Override
    public void use(Creature creature){
        getEffect().cast(creature);
        damage(FIREBALL_DAMAGE, creature);
    }
}
