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
public class RightWing extends Players{
    
    private String acceleration;
    private String forechecking;
    private String hitting;
    
    @Override
    public Players createPlayer(){
        super.createPlayer();
        Scanner s = new Scanner(System.in);
        System.out.println("Acceleration:");
        this.setAcceleration(s.next());
        System.out.println("forechecking:");
        this.setForechecking(s.next());
        System.out.println("Hitting:");
        this.setHitting(s.next());
        return this;
    }
    
    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("Acceleration: " + getAcceleration() + ", Forechecking: " + getForechecking() + ", Hitting: " + getHitting());
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public String getForechecking() {
        return forechecking;
    }

    public void setForechecking(String forechecking) {
        this.forechecking = forechecking;
    }

    public String getHitting() {
        return hitting;
    }

    public void setHitting(String hitting) {
        this.hitting = hitting;
    }
    
}
