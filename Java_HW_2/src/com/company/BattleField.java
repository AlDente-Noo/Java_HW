package com.company;

import com.company.creatures.Creature;
import com.company.creatures.Diablo;
import com.company.creatures.EfreetSultans;

import java.util.Random;
import java.util.logging.Logger;

public class BattleField {
    public static final Logger log = Logger.getLogger(BattleField.class.getName());
    private Creature creature1 = new Diablo();
    private Creature creature2 = new EfreetSultans();

    public void fight(){
        creature1.setSite("LEFT_SITE");
        creature2.setSite("RIGHT_SITE");
        creature1.setCoord(0,0);
        creature2.setCoord(25,0);
        creature1.setCurntEnemy(creature2);
        creature2.setCurntEnemy(creature1);
        while(creature1.getHitPoints() > 0 && creature2.getHitPoints() > 0){
            System.out.println("Diablo has " + creature1.getHitPoints() + "HP");
            System.out.println("Sultan has " + creature2.getHitPoints() + "HP");
            Random random = new Random();
            boolean flagToAct = random.nextInt(51) > 25;
            int distance = creature2.getCoord().getX() - creature1.getCoord().getX();
            creature1.setCanAttack(distance <= creature1.getAttackRange());
            creature2.setCanAttack(distance <= creature2.getAttackRange());
            if (creature1.isCanAttack() && creature2.isCanAttack()){
                if (flagToAct)
                    creature1.attack();
                else
                    creature2.attack();
            }
            else {
                if (creature1.isCanAttack())
                    creature1.attack();
                if (creature2.isCanAttack())
                    creature2.attack();
            }
            if(flagToAct)
                creature1.move();
            else
                creature2.move();
        }

    }
}
