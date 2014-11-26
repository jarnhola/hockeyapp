/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 *
 * @author Järjestelmänvalvoja
 */
public class TabPanePartial extends TabPane implements ChangeListener<Tab>{
        private final Tab tabWelcome = new Tab();
        private final Tab tabAddPlayer = new Tab();
        private final Tab tabRemovePlayer = new Tab();
        private final Tab tabPlayerInfo = new Tab();
        private final Tab tabDefineExercise = new Tab();
        private final Tab tabPlayGame = new Tab();
        //private BrowseAddressesPartial partial = new BrowseAddressesPartial();

        public TabPanePartial(){
            this.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
            this.setStyle("-fx-padding:10px");            
            tabWelcome.setText("Welcome");
            tabWelcome.setContent(new WelcomePartial());
            tabAddPlayer.setText("Add Player");
            tabAddPlayer.setContent(new AddPlayerPartial());
            tabRemovePlayer.setText("Remove Player");
            //tabAddPlayer.setContent(partial);
            tabPlayerInfo.setText("Player Info");
            //tabPlayerInfo.setContent(partial);
            tabDefineExercise.setText("Define Exercise");
            //tabDefineExercise.setContent(partial);
            tabPlayGame.setText("Play Game");
            //tabPlayGame.setContent(partial);
            
            this.getTabs().add(tabWelcome);
            this.getTabs().add(tabAddPlayer);
            this.getTabs().add(tabRemovePlayer);
            this.getTabs().add(tabPlayerInfo);
            this.getTabs().add(tabDefineExercise);
            this.getTabs().add(tabPlayGame);
            this.getSelectionModel().selectedItemProperty().addListener(this);
        }
                
    @Override
    public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
        if(this.getSelectionModel().getSelectedItem().equals(tabAddPlayer)){
            ButtonPanePartial.toggleSaveButton(false);
            //partial.updateList();
        }
        else{
            ButtonPanePartial.toggleSaveButton(true);
        }
    }
}