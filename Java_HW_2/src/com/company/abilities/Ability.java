package com.company.abilities;

import com.company.creatures.Creature;
import com.company.effects.Effect;
import com.company.interfaces.damaging;

public abstract class Ability {
    private final String description;
    private final String abilityName;
    private final String abilityUsingPhrase;
    private final Effect effect;

    public Ability(String abilityName, String abilityUsingPhrase,
                   String description, Effect effect) {
        this.abilityName = abilityName;
        this.abilityUsingPhrase = abilityUsingPhrase;
        this.description = description;
        this.effect = effect;
    }
    abstract public void use(Creature creature);
    public String getAbilityUsingPhrase() {
        return abilityUsingPhrase;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public Effect getEffect() {
        return effect;
    }

    public String getDescription() {
        return description;
    }
}
