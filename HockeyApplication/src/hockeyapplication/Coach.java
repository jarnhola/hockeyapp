/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapplication;

//import static hockeyapplication.HockeyApplication.clearScreen;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Järjestelmänvalvoja
 */
public class Coach {
    
    Team ownTeam = new Team();
    
    public Coach() throws FileNotFoundException{
        
        startCoaching();
    }
    
    public void startCoaching() throws FileNotFoundException{
        
        Scanner s = new Scanner(System.in);
        int selection = -1;
        System.out.println("Welcome, Coach! What would you like to do?\n");
        
        while(selection != 5){
            //if(selection != -1) clearScreen();
            System.out.println("1. Add new player");
            System.out.println("2. Remove player");
            System.out.println("3. List all players");
            System.out.println("4. Define exercise");
            System.out.println("5. Stop coaching, go home!");
            
            selection = s.nextInt();
            
            switch(selection){
                case 1:
                    ownTeam.addPlayer();
                    break;
                case 2:
                    ownTeam.removePlayer();
                    break;
                case 3:
                    ownTeam.listAllPlayers();
                    break;
                case 5:
                    System.out.println("Ok, bye! See you later!");
                    System.exit(0);
                default:
                    System.out.println("Incorrect selection! Try again.\n");
                    break;
            }
        }
    }
}
