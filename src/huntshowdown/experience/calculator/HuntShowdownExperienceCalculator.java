/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huntshowdown.experience.calculator;

/**
 *
 * @author Jonathan Chea
 * Built in semester 1 Java
 */
import java.util.*;
public class HuntShowdownExperienceCalculator {
    public static void main (String [] args){
    // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
        // Write your code here!!!!

        int grunt = 10;
        int hive = 20;
        int leech = 10;
        int hellHound = 20;
        int immolator = 50;
        int armored = 60;
        int waterDevil = 20;
        int meatHead = 200;
        int exp = 0;
        int monsterKill = 0;
        int count;
        //1b/25, 2b/50, 3b/100

        for (count = 0; count < 8; count++){
            if (count == 0){
                System.out.print("How many grunt's did you kill: ");
                int gruntKill = in.nextInt();
                System.out.print("You have earned " + grunt * gruntKill + " exp!");
                monsterKill += gruntKill;
                exp += (grunt * gruntKill);
            }
            else if (count == 1){ 
                System.out.print("\nHow many hive's did you kill: ");    
                int hiveKill = in.nextInt();
                System.out.print("You have earned " + hive * hiveKill + " exp!");
                monsterKill += hiveKill;
                exp += (hive * hiveKill);
            }
            else if (count == 2){
                System.out.print("\nHow many leeches did you kill: ");
                int leechKill = in.nextInt();
                System.out.print("You have earned " + leech * leechKill + " exp!");
                monsterKill += leechKill;
                exp += (leech * leechKill);
            }
            else if (count == 3){
                System.out.print("\nHow many Hell hound's did you kill: ");
                int hellKill = in.nextInt();
                System.out.print("You have earned " + hellHound * hellKill + " exp!");
                monsterKill += hellKill;
                exp += (hellHound * hellKill);
            }
             else if (count == 4){
                System.out.print("\nHow many immolator's did you kill: ");
                int immKill = in.nextInt();
                System.out.print("You have earned " + immolator * immKill + " exp!");
                monsterKill += immKill;
                exp += (immolator * immKill);
        }
            else if (count == 5){
                System.out.print("\nHow many armored's did you kill: ");
                int armKill = in.nextInt();
                System.out.print("You have earned " + armored * armKill + " exp!");
                monsterKill += armKill;
                exp += (armored * armKill);
            }
            else if (count == 6){
                System.out.print("\nHow many water devil's did you kill: ");
                int wdKill = in.nextInt();
                System.out.print("You have earned " + waterDevil * wdKill + " exp!");
                monsterKill += wdKill;
                exp += (waterDevil * wdKill);
            }
            else if (count == 7){
                System.out.print("\nHow many Meat head's did you kill: ");
                int mhKill = in.nextInt();
                System.out.print("You have earned " + meatHead * mhKill + " exp!");
                monsterKill += mhKill;
                exp += (meatHead * mhKill);
            }
        }
        
        System.out.print("\n=========================================");
        System.out.println("\nYou have killed " + monsterKill + " monster's this game.");
        System.out.println("You have earned " + exp + " exp this game.");
        System.out.println("\n\n=========================================");
        System.out.println("Did you successfully leave? 1 for yes, 2 for no");
        int ex = in.nextInt();
        if (ex == 1 ){
            System.out.println("=========================================");
            System.out.print("You live to die another day");
            
        }
        else {
        System.out.println("=========================================");
        System.out.print("The hunt giveth and the hunt taketh. Better luck next time");
    }
    }
    }
    
    
    
    
    
    
    
    
