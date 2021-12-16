package View;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class Header extends HBox implements ViewChanger {

    private Button add;
    private Button delete;
    private Button save;
    private Button print;
    private TextField search;


    public Header(){
        init();
    }

    @Override
    public void initializeSelf() {
        ViewChanger.super.initializeSelf();
    }

    @Override
    public void initializeControls() {

        add = new Button("Neuer Radwechsel");
        delete = new Button("Löschen");
        save = new Button("Speichern");
        print = new Button("Drucken");
        search = new TextField("Suche");
    }

    @Override
    public void layoutControls() {
        setPadding(new Insets(0,0,0,0));
        Pane spacer = new Pane();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        spacer.setMinSize(10,1);
        getChildren().addAll(add,delete,save,print,spacer,search);
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
