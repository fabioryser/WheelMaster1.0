package View;

import javafx.scene.control.TableView;

public class Client extends TableView implements ViewChanger{

    public Client(){
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
