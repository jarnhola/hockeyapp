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
public class Center extends Players{
    
    private String playmaking;
    private String acceleration;
    private String hitting;

    @Override
    public Players createPlayer(){
        super.createPlayer();
        Scanner s = new Scanner(System.in);
        System.out.println("Playmaking:");
        this.setPlaymaking(s.next());
        System.out.println("Acceleration:");
        this.setAcceleration(s.next());
        System.out.println("Hitting:");
        return this;
    }
    
    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("Playmaking: " + getPlaymaking() + ", Acceleration: " + getAcceleration());
    }

    public String getPlaymaking() {
        return playmaking;
    }

    public void setPlaymaking(String playmaking) {
        this.playmaking = playmaking;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }
    
}
