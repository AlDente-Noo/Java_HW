package com.company;

import com.company.creatures.Creature;
import com.company.creatures.Diablo;
import com.company.creatures.EfreetSultans;
import java.util.Random;

public class BattleField {

    private Creature creature1 = new Diablo();
    private Creature creature2 = new EfreetSultans();
    public static final String LEFT_SIZE_FLAG = "LEFT_SIZE";
    public static final String RIGHT_SIZE_FLAG = "RIGHT_SIZE";
    public void fight(){
        creature1.setSite(LEFT_SIZE_FLAG);
        creature2.setSite(RIGHT_SIZE_FLAG);
        creature1.setCoord(0,0);
        creature2.setCoord(25,0);
        creature1.setCurntEnemy(creature2);
        creature2.setCurntEnemy(creature1);
        int i = 0 ;
        while(creature1.getHitPoints() > 0 && creature2.getHitPoints() > 0){
            i = i+1;
            Main.battlelog.info("");
            Main.battlelog.info("TURN " + i);
            Main.battlelog.info("");
            boolean flagToAct = new Random().nextInt(51) > 25;
            Main.battlelog.info(" flag to act is " + flagToAct);
            int distance = creature2.getCoord().getX() - creature1.getCoord().getX();
            creature1.setCanAttack(distance <= creature1.getAttackRange());
            creature2.setCanAttack(distance <= creature2.getAttackRange());
            if (creature1.isCanAttack() || creature2.isCanAttack()) {
                if (i == 2){
                    System.out.println(creature1.getClass().getSimpleName() + " is using an ability ");
                    creature1.useAbility();
                    System.out.println(creature2.getClass().getSimpleName() + " is using an ability ");
                    creature2.useAbility();
                    continue;
                }
                if (creature1.isCanAttack() && creature2.isCanAttack()) {
                    if (flagToAct) {
                        creature1.attack();
                        creature2.attack();
                        continue;
                    } else {
                        creature1.attack();
                        creature2.attack();
                        continue;
                    }
                }
                else {
                    if (creature1.isCanAttack() && !creature2.isCanAttack()) {
                        creature1.attack();
                        continue;
                    }

                    if (creature2.isCanAttack() && !creature1.isCanAttack()) {
                        creature2.attack();
                        continue;
                    }
                }
            }
            else {
                if(flagToAct) {
                    creature1.move();
                    creature2.move();
                    continue;
                }
                else {
                    creature2.move();
                    creature1.move();
                    continue;
                }
            }

        }
    }
}
