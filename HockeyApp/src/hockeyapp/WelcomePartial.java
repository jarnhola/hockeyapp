/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapp;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author Järjestelmänvalvoja
 */
public class WelcomePartial extends VBox{
    private final static Label label1 = new Label();

    public WelcomePartial() {
        label1.setText("Welcome Coach! What would you like to do?");
        this.setSpacing(5.0f);
        this.setAlignment(Pos.CENTER);
        this.getChildren().add(label1);
    }

}
