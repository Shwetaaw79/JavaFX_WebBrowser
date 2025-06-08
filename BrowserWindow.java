package mybrowser;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class BrowserWindow {
    private Stage stage;
    private TabPane tabPane;

    // ✅ Constructor accepting Stage
    public BrowserWindow(Stage stage) {
        this.stage = stage;
        this.tabPane = new TabPane();
        
        // Add an initial tab
        addNewTab("https://www.google.com");

        BorderPane root = new BorderPane();
        root.setCenter(tabPane);

        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("JavaFX Multi-Tab Secure Web Browser");
        stage.show();
    }

    // ✅ Sample method to add a new tab (you should implement this)
    private void addNewTab(String url) {
        // Code to create and add a new browser tab
    }
}
