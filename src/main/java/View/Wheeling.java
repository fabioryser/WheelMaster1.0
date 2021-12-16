package View;

import javafx.scene.layout.GridPane;

public class Wheeling extends GridPane implements ViewChanger {

    public Wheeling(){
        init();
    }


    @Override
    public void initializeSelf() {
        ViewChanger.super.initializeSelf();
    }

    @Override
    public void initializeControls() {

    }

    @Override
    public void layoutControls() {

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
