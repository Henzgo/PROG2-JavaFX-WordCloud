package ch.zhaw.it.prog2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        openMainWindow(primaryStage);
    }

    private void openMainWindow(Stage stage) {
        try {
            // If MainWindow.fxml is in the package ch.zhaw.it.prog2.wordcloud
            // the path should start with a forward slash and be absolute from the classpath
            // root.
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ch/zhaw/it/prog2/wordcloud/MainWindow.fxml"));

            // Load the root node from the FXML file
            Pane rootNode = loader.load();

            // Optional, get controller to access specific methods
            // MainWindowController mainWindowController = loader.getController();
            // mainWindowController.setModel(...);

            // Create a Scene with the root node and set it on the stage
            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.setMinHeight(200);
            stage.setMinWidth(300);
            stage.setTitle("My Application"); // Optional: Set a title for the window
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace to help diagnose the error
        }
    }
}
