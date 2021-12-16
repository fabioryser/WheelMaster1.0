package View;

import PresentationModels.PresentationModel;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;

public class AppUI extends BorderPane implements ViewChanger {

    private final PresentationModel model;

    private SplitPane content;
    private Header header;
    private Client client;
    private Wheeling wheeling;
    private Footer footer;


    public AppUI(PresentationModel model){
        this.model = model;
        init();
    }

    public void initializeSelf(){
     String stylesheet = getClass().getResource("/style.css").toExternalForm();
     getStylesheets().add(stylesheet);
    }

    public void initializeControls(){
        header = new Header();
        content = new SplitPane();
        client = new Client();
        wheeling = new Wheeling();
        footer = new Footer();



    }

    public void layoutControls(){

        setTop(header);
        setCenter(content);
        setBottom(footer);
        content.getItems().addAll(client,wheeling);

    }

}
