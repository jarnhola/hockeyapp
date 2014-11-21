/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapplication;

import java.util.Scanner;

/**
 *
 * @author Järjestelmänvalvoja
 */
public class Defence extends Players{
    
    private String opening;
    private String blocking;
    private String hitting;
    
    @Override
    public Players createPlayer(){
        super.createPlayer();
        Scanner s = new Scanner(System.in);
        System.out.println("Opening:");
        this.setOpening(s.next());
        System.out.println("Blocking:");
        this.setBlocking(s.next());
        System.out.println("Hitting:");
        this.setHitting(s.next());
        return this;
    }
    
    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("Opening: " + getOpening() + ", Blocking: " + getBlocking() + ", Hitting: " + getHitting());
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public String getBlocking() {
        return blocking;
    }

    public void setBlocking(String blocking) {
        this.blocking = blocking;
    }

    public String getHitting() {
        return hitting;
    }

    public void setHitting(String hitting) {
        this.hitting = hitting;
    }
    
}
