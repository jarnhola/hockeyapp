/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapp;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Järjestelmänvalvoja
 */
public class AddPlayerPartial extends BorderPane{
    private static final TextField nameField = new TextField();
    private static final TextField ageField = new TextField();
    private static final TextField speedField = new TextField();
    private static final TextField shootingField = new TextField();
    private static final TextField passingField = new TextField();
    private static final TextField puckHandlingField = new TextField();
    private static final TextField strengthField = new TextField();
    private static final TextField playmakingField = new TextField();
    private static final TextField hittingField = new TextField();
    private static final TextField forecheckingField = new TextField();
    private static final TextField openingField = new TextField();
    private static final TextField blockingField = new TextField();
    private static final TextField gloveSavingField = new TextField();
    private static final TextField shieldSavingField = new TextField();
    private static final TextField padSavingField = new TextField();
    private static final Label nameLabel = new Label("Name");
    private static final Label ageLabel = new Label("Age");
    private static final Label speedLabel = new Label("Speed");
    private static final Label shootingLabel = new Label("Shooting");
    private static final Label passingLabel = new Label("Passing");
    private static final Label puckHandlingLabel = new Label("Puck Handling");
    private static final Label strengthLabel = new Label("Strength");
    private static final Label playmakingLabel = new Label("Playmaking");
    private static final Label hittingLabel = new Label("Hitting");
    private static final Label forecheckingLabel = new Label("Forechecking");
    private static final Label openingLabel = new Label("Opening");
    private static final Label blockingLabel = new Label("Blocking");
    private static final Label gloveSavingLabel = new Label("Glove Saving");
    private static final Label shieldSavingLabel = new Label("Shield Saving");
    private static final Label padSavingLabel = new Label("Pad Saving");
    private static final RadioButton buttonC = new RadioButton("C");
    private static final RadioButton buttonLW = new RadioButton("LW");
    private static final RadioButton buttonRW = new RadioButton("RW");
    private static final RadioButton buttonD = new RadioButton("D");
    private static final RadioButton buttonG = new RadioButton("G");
    
    private final ToggleGroup group = new ToggleGroup();
    
    public AddPlayerPartial() {
        
        VBox nameAndButtons = new VBox();
        this.setTop(nameAndButtons);
        
        HBox buttons = new HBox();
        nameAndButtons.getChildren().add(buttons);
        
        //set spacing and padding to the radio buttons
        buttons.setSpacing(10.0f);
        buttons.setPadding(new Insets(10,0,0,10));
        
        //Add buttons to the layout
        buttons.getChildren().add(buttonC);
        buttons.getChildren().add(buttonLW);
        buttons.getChildren().add(buttonRW);
        buttons.getChildren().add(buttonD);
        buttons.getChildren().add(buttonG);
        
        //Only one button can be selected at the same time
        ToggleButtons();
        
        nameAndButtons.getChildren().add(nameLabel);
        nameAndButtons.getChildren().add(nameField);
        
        VBox info1 = new VBox();
        this.setLeft(info1);
        info1.setPrefWidth(270);
        info1.getChildren().add(ageLabel);
        info1.getChildren().add(ageField);
        info1.getChildren().add(speedLabel);
        info1.getChildren().add(speedField);
        info1.getChildren().add(shootingLabel);
        info1.getChildren().add(shootingField);
        info1.getChildren().add(passingLabel);
        info1.getChildren().add(passingField);
        info1.getChildren().add(puckHandlingLabel);
        info1.getChildren().add(puckHandlingField);
        info1.getChildren().add(strengthLabel);
        info1.getChildren().add(strengthField);
        info1.getChildren().add(playmakingLabel);
        info1.getChildren().add(playmakingField);
        
        VBox info2 = new VBox();
        this.setRight(info2);
        info2.setPrefWidth(290);
        info2.getChildren().add(hittingLabel);
        info2.getChildren().add(hittingField);
        info2.getChildren().add(forecheckingLabel);
        info2.getChildren().add(forecheckingField);
        info2.getChildren().add(openingLabel);
        info2.getChildren().add(openingField);
        info2.getChildren().add(blockingLabel);
        info2.getChildren().add(blockingField);
        info2.getChildren().add(gloveSavingLabel);
        info2.getChildren().add(gloveSavingField);
        info2.getChildren().add(shieldSavingLabel);
        info2.getChildren().add(shieldSavingField);
        info2.getChildren().add(padSavingLabel);
        info2.getChildren().add(padSavingField);
    }
    
    public static final Players getPlayerInfo(){

        Players player = new Players() {};

        player.setName(nameField.getText());
        player.setName(ageField.getText());
        player.setName(speedField.getText());
        player.setName(shootingField.getText());
        player.setName(passingField.getText());
        player.setName(puckHandlingField.getText());
        player.setName(strengthField.getText());
        player.setName(playmakingField.getText());
        player.setName(hittingField.getText());
        player.setName(forecheckingField.getText());
        player.setName(openingField.getText());
        player.setName(blockingField.getText());
        player.setName(gloveSavingField.getText());
        player.setName(shieldSavingField.getText());
        player.setName(padSavingField.getText());
        return player;
    }
    
    private void ToggleButtons(){
        buttonC.setToggleGroup(group);
        buttonLW.setToggleGroup(group);
        buttonRW.setToggleGroup(group);
        buttonD.setToggleGroup(group);
        buttonG.setToggleGroup(group);
    }
    
    public static final void clearFields(){
        nameField.clear();
        ageField.clear();
        speedField.clear();
        shootingField.clear();
        passingField.clear();
        puckHandlingField.clear();
        strengthField.clear();
        playmakingField.clear();
        hittingField.clear();
        forecheckingField.clear();
        openingField.clear();
        blockingField.clear();
        gloveSavingField.clear();
        shieldSavingField.clear();
        padSavingField.clear();
    }
    
    public static final boolean isPositionEmpty(){
        if(buttonC.isSelected() || buttonLW.isSelected() || buttonRW.isSelected() ||
           buttonD.isSelected() || buttonG.isSelected())
        {
            return false;
        }
        return true;
    }
    
    public static final boolean isEmptyFields(){

        if(nameField.getText().isEmpty() || ageField.getText().isEmpty() ||
           speedField.getText().isEmpty() || shootingField.getText().isEmpty() || 
           puckHandlingField.getText().isEmpty() || strengthField.getText().isEmpty() ||
           playmakingField.getText().isEmpty() || hittingField.getText().isEmpty() ||
           forecheckingField.getText().isEmpty() || openingField.getText().isEmpty() ||
           blockingField.getText().isEmpty() || gloveSavingField.getText().isEmpty() ||
           shieldSavingField.getText().isEmpty() || padSavingField.getText().isEmpty())
        {
            return true;
        }
        return false;
    }
}
