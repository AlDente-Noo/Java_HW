package com.company.creatures;

import com.company.Coordinate;
import com.company.abilities.Ability;
import com.company.interfaces.attackable;
import com.company.interfaces.damagable;
import com.company.interfaces.damaging;
import com.company.interfaces.movable;

abstract public class Creature implements movable, attackable, damagable, damaging {
    private int attackRange;
    private int[] damageBounds;
    private int hitPoints;
    private int moveSpeed;
    private Coordinate coord = new Coordinate();
    private int armor;
    private Creature curntEnemy;
    private Ability ability;
    private boolean canAttack;
    private boolean canMove;
    private boolean hasAbility = true;


    private String site;
    public Creature(int attackRange, int[] damageBounds,
                    int hitPoints, int moveSpeed,
                    int armor, Ability ability) {
        this.attackRange = attackRange;
        this.damageBounds = damageBounds;
        this.hitPoints = hitPoints;
        this.moveSpeed = moveSpeed;
        this.armor = armor;
        this.ability = ability;

    }
    @Override
    public void move() {
        if (site.equals("RIGHT_SITE"))
            this.setCoord(coord.getX()-moveSpeed, coord.getY());
        else
            this.setCoord(coord.getX()+moveSpeed, coord.getY());
    }
    @Override
    public void attack (){
        int resultDamage = (int)(Math.random() *
                ((damageBounds[1] - damageBounds[0]) +1)) + damageBounds[0];
        damage(resultDamage,curntEnemy);
        curntEnemy.getDamage(resultDamage);
    }

    @Override
    public void getDamage(int damage) {
        if (armor <= damage) {
            setHitPoints(hitPoints + armor - damage);
            setArmor(0);
        }
        else {
            setArmor(damage - armor);
        }
    }

    public void useAbility(){
        ability.use(curntEnemy);
        setHasAbility(false);
    }

    //SETTERS
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public void setCoord(int x, int y) {
        this.coord.setX(x);
        this.coord.setY(y);
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setCurntEnemy(Creature curntEnemy) {
        this.curntEnemy = curntEnemy;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public void setHasAbility(boolean hasAbility) {
        this.hasAbility = hasAbility;
    }
    public void setSite(String site) {
        this.site = site;
    }

    //SETTERS END

    //GETTERS

    public boolean isCanAttack() {
        return canAttack;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public int getArmor() {
        return armor;
    }

    public Ability getAbility() {
        return ability;
    }


    public boolean isCanMove() {
        return canMove;
    }
    public boolean isHasAbility() {
        return hasAbility;
    }

    public int getAttackRange() {
        return attackRange;
    }

    //GETTERS END
}
