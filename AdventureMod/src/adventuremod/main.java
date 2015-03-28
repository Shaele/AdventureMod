/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuremod;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Imre
 */
public class main {

    public static void main(String[] args) {
        
        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        //Game variables
        String[] enemies =  {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDmg = 25;
        
        //Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPots = 3;
        
        
    }
    
}
