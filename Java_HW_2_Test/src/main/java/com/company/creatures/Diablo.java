package com.company.creatures;

import com.company.abilities.InfernalBlade;

public class Diablo extends Creature {
    private static final int[] DIABLO_DAMAGE_BOUNDS = new int[] {40, 30}; // max damage need to be placed first
    private static final int DIABLO_ATTACK_RANGE = 3;
    private static final int DIABLO_MOVE_SPEED = 11;
    private static final int DIABLO_BASE_ARMOR = 21;
    private static final int DIABLO_BASE_HIT_POINTS = 160;
    public Diablo(){
        super(DIABLO_ATTACK_RANGE, DIABLO_DAMAGE_BOUNDS, DIABLO_BASE_HIT_POINTS,
                DIABLO_MOVE_SPEED, DIABLO_BASE_ARMOR, new InfernalBlade());
    }
}
