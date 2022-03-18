package com.company;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    public static final Logger battlelog = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
	// write your code here
        BattleField battleField = new BattleField();
        battleField.fight();
    }
}
