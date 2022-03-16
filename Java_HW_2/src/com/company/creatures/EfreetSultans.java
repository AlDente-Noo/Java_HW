package com.company.creatures;

import com.company.abilities.Fireball;
import com.company.abilities.InfernalBlade;

public class EfreetSultans extends Creature {
    private static final int[] EFREET_SULTANS_DAMAGE_BOUNDS = new int[] {16, 24}; // max damage need to be placed first
    private static final int EFREET_SULTANS_ATTACK_RANGE = 10;
    private static final int EFREET_SULTANS_MOVE_SPEED = 13;
    private static final int EFREET_SULTANS_BASE_ARMOR = 14;
    private static final int EFREET_SULTANS_BASE_HIT_POINTS = 90;
    public EfreetSultans(){
        super(EFREET_SULTANS_ATTACK_RANGE, EFREET_SULTANS_DAMAGE_BOUNDS,
                EFREET_SULTANS_BASE_HIT_POINTS,
                EFREET_SULTANS_MOVE_SPEED,
                EFREET_SULTANS_BASE_ARMOR,  new Fireball());
    }
}
