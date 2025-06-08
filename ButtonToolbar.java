package mybrowser;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;

public class ButtonToolbar {
    private HBox toolbar;
    private WebEngine webEngine;
    private TextField urlField; // Added urlField as an instance variable

    public ButtonToolbar(WebEngine webEngine, TextField urlField) {
        this.webEngine = webEngine;
        this.urlField = urlField; // Assigning the value

        toolbar = new HBox(5); // Add spacing between buttons for better UI

        Button backButton = new Button("Back");
        Button forwardButton = new Button("Forward");
        Button refreshButton = new Button("Refresh");
        Button loadButton = new Button("Go");

        // Navigation Actions
        backButton.setOnAction(e -> {
            WebHistory history = webEngine.getHistory();
            if (history.getCurrentIndex() > 0) {
                history.go(-1);
            }
        });

        forwardButton.setOnAction(e -> {
            WebHistory history = webEngine.getHistory();
            if (history.getCurrentIndex() < history.getEntries().size() - 1) {
                history.go(1);
            }
        });

        refreshButton.setOnAction(e -> webEngine.reload());
        loadButton.setOnAction(e -> webEngine.load(urlField.getText())); // Use instance variable

        toolbar.getChildren().addAll(backButton, forwardButton, refreshButton, urlField, loadButton);
    }

    public HBox getToolbar() {
        return toolbar;
    }
}
