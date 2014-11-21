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
public class Goalie extends Players{
    
    private String gloveSaving;
    private String shieldSaving;
    private String padSaving;
    
    @Override
    public Players createPlayer(){
        super.createPlayer();
        Scanner s = new Scanner(System.in);
        System.out.println("Glove saving:");
        this.setGloveSaving(s.next());
        System.out.println("Shield Saving:");
        this.setShieldSaving(s.next());
        System.out.println("Pad Saving:");
        this.setPadSaving(s.next());
        return this;
    }
    
    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("Glove saving: " + getGloveSaving() + ", Shield Saving: " + getShieldSaving() + ", Pad Saving: " + getPadSaving());
    }

    public String getGloveSaving() {
        return gloveSaving;
    }

    public void setGloveSaving(String gloveSaving) {
        this.gloveSaving = gloveSaving;
    }

    public String getShieldSaving() {
        return shieldSaving;
    }

    public void setShieldSaving(String shieldSaving) {
        this.shieldSaving = shieldSaving;
    }

    public String getPadSaving() {
        return padSaving;
    }

    public void setPadSaving(String padSaving) {
        this.padSaving = padSaving;
    }
    
}
