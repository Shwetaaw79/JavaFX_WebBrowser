package mybrowser;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        new BrowserWindow(primaryStage); // FIX: Passing primaryStage as an argument
    }

    public static void main(String[] args) {
        launch(args);
    }
}
