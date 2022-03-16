package com.company.abilities;

import com.company.creatures.Creature;
import com.company.effects.Effect;
import com.company.effects.Stun;

public class InfernalBlade extends Ability {
    private static final String INFERNAL_BLADE_ABILITY_NAME = "Infernal Blade";
    private static final String INFERNAL_BLADE_ABILITY_USING_PHRASE = "FACE YOUR DEMONS! AHHHGR";
    private static final String INFERNAL_BLADE_DESCRIPTION = "Is counted as turn. " +
            "Diablo impales enemy with his blade: stuns and totally destroys enemy's armor";
    public InfernalBlade(){
        super(INFERNAL_BLADE_ABILITY_NAME, INFERNAL_BLADE_ABILITY_USING_PHRASE,
                INFERNAL_BLADE_DESCRIPTION, new Stun());
    }
    @Override
    public void use(Creature creature){
        getEffect().cast(creature);
    }
}
