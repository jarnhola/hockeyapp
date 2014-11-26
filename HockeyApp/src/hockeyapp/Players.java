/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapp;

import java.util.Scanner;

/**
 *
 * @author Järjestelmänvalvoja
 */
public abstract class Players {
    
    private String name;
    private String age;
    private String speed;
    private String shooting;
    private String passing;
    private String puckHandling;
    private String armStrength;
    private String legStrength;

    public Players createPlayer(){
        Scanner s = new Scanner(System.in);
        System.out.println("Player's name:");
        this.setName(s.nextLine());
        System.out.println("Age:");
        this.setAge(s.next());
        System.out.println("Speed:");
        this.setSpeed(s.next());
        System.out.println("Shooting:");
        this.setShooting(s.next());
        System.out.println("Passing:");
        this.setPassing(s.next());
        System.out.println("Puck handling:");
        this.setPuckHandling(s.next());
        System.out.println("Arm Strength");
        this.setArmStrength(s.next());
        System.out.println("Leg Strength");
        this.setLegStrength(s.next());
        return this;
    };

    public void printInformation(){
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Speed: "  + getSpeed() + ", Shooting: " + getShooting() + ", Passing: " + getPassing() + ", Puck handling: " + getPuckHandling() + ", Arm strength: " + getArmStrength() + ", Leg strength: " + getLegStrength());
    };
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getShooting() {
        return shooting;
    }

    public void setShooting(String shooting) {
        this.shooting = shooting;
    }

    public String getPassing() {
        return passing;
    }

    public void setPassing(String passing) {
        this.passing = passing;
    }

    public String getPuckHandling() {
        return puckHandling;
    }

    public void setPuckHandling(String puckHandling) {
        this.puckHandling = puckHandling;
    }

    public String getArmStrength() {
        return armStrength;
    }

    public void setArmStrength(String armStrength) {
        this.armStrength = armStrength;
    }

    public String getLegStrength() {
        return legStrength;
    }

    public void setLegStrength(String legStrength) {
        this.legStrength = legStrength;
    }


}

