package View;

import PresentationModels.PresentationModel;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppStarter extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        PresentationModel model = new PresentationModel();

        Parent rootPane = new AppUI(model);

        Scene myScene = new Scene(rootPane);

        primaryStage.setTitle("WheelMaster1.0");
        primaryStage.setScene(myScene);
        primaryStage.setHeight(1000);
        primaryStage.setWidth(1500);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
