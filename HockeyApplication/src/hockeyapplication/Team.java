/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Järjestelmänvalvoja
 */
public class Team {
    
    ArrayList<Players> players = new ArrayList<>();


    public Team(){
            
    }
    
    public void addPlayer() throws FileNotFoundException{
        System.out.println("1. Add C");
        System.out.println("2. Add RW");
        System.out.println("3. Add LW");
        System.out.println("4. Add D");
        System.out.println("5. Add G");
        
        Scanner s = new Scanner(System.in);
        int selection = s.nextInt();
        PrintWriter talteen = new PrintWriter("tallessa.txt");
        
        switch(selection){
            case 1:{
                Center c = new Center();
                players.add(c.createPlayer());
                talteen.println(players);
                talteen.close();
                System.out.println("Työt tehty!\n");
                break;
            }
            case 2:{
                RightWing rw = new RightWing();
                players.add(rw.createPlayer());
                break;
            }
            case 3:{
                LeftWing lw = new LeftWing();
                players.add(lw.createPlayer());
                break;
            }
            case 4:{
                Defence d = new Defence();
                players.add(d.createPlayer());
                break;
            }
            case 5:{
                Goalie g = new Goalie();
                players.add(g.createPlayer());
                break;
            }
        }
    }
    
    public void removePlayer(){
        Scanner s = new Scanner(System.in);
        System.out.println("Give player's name:");
        String temp = s.next();
        Iterator<Players> i = players.iterator();
        for(; i.hasNext();){
            Players p = i.next();
            if(temp.equals(p.getName())){
                System.out.println("Removing Player:");
                p.printInformation();
                System.out.println("Still want to remove? (Yes/No)");
                String ans = s.next();
                if(ans.equals("Yes"))
                   players.remove(p);
            }
        }
    }
    
    public void listAllPlayers(){
    Iterator<Players> i = players.iterator();
        for(; i.hasNext();){
            Players player = i.next();
            player.printInformation();
        }
    }
}

