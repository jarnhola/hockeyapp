/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapp;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Järjestelmänvalvoja
 */
public class ButtonPanePartial extends HBox {
    
    private static final Button saveButton = new Button("Save");
    private final Button closeButton = new Button("Close");
    protected static final ArrayList<Players> players = new ArrayList<>();

    public ButtonPanePartial(){
        this.setSpacing(10.0f);
        this.getChildren().add(saveButton);
        this.getChildren().add(closeButton);
        toggleSaveButton(true);
        
        closeButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                Platform.exit();
            }    
        });
        
         saveButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                if(AddPlayerPartial.isPositionEmpty()){
                    JOptionPane.showMessageDialog(null, "Set player position!");
                }
                else if(AddPlayerPartial.isEmptyFields()){
                    JOptionPane.showMessageDialog(null, "All fields must have value!");
                }
                else{
                    //Cache object in arraylist
                    players.add(AddPlayerPartial.getPlayerInfo());
                    AddPlayerPartial.clearFields();
                }
            }    
        });
    }
    
    public static final void toggleSaveButton(boolean setDisable){
        
        saveButton.setDisable(setDisable);
    }
}
