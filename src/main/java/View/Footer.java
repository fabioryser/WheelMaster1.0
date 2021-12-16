package View;

import View.ViewChanger;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class Footer extends HBox implements ViewChanger {

    private Label name;
    private Label slogan;
    private Label date;

    public Footer(){
        init();
    }

    @Override
    public void initializeSelf() {
        ViewChanger.super.initializeSelf();
    }

    @Override
    public void initializeControls() {
        name = new Label("Garage Ryser AG");
        slogan = new Label("Beste Garage Weltweit");
        date = new Label ("13.11.2022");
    }

    @Override
    public void layoutControls() {
        setPadding(new Insets(0,0,0,0));
        Pane spacer1 = new Pane();
        Pane spacer2 = new Pane();
        HBox.setHgrow(spacer1, Priority.ALWAYS);
        HBox.setHgrow(spacer2, Priority.ALWAYS);
        spacer1.setMinSize(1,1);
        spacer2.setMinSize(1,1);
        getChildren().addAll(name,spacer1,slogan,spacer2,date);
    }

    @Override
    public void setupEventHandlers() {
        ViewChanger.super.setupEventHandlers();
    }

    @Override
    public void setupValueChangeListeners() {
        ViewChanger.super.setupValueChangeListeners();
    }

    @Override
    public void setupBindings() {
        ViewChanger.super.setupBindings();
    }
}
