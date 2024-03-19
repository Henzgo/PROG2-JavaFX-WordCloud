package ch.zhaw.it.prog2.wordcloud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {
    private WordModelDecorator wordModelDecorator;

    @FXML
    private Label labelTitle;

    @FXML
    private TextField textEntry;

    @FXML
    private TextArea textHistory;

    public void initialize() {
        labelTitle.textProperty().bind(textEntry.textProperty());
    }

    public void setWordModel(WordModel wordModel) {
        wordModelDecorator = new WordModelDecorator(wordModel);
        wordModelDecorator.addListener(new IsObserver() {
            @Override
            public void update() {
                textHistory.setText(wordModel.toString());
            }
        });
    }

    @FXML
    void addText(ActionEvent event) {
        for (String word : textEntry.getText().split(" ")) {
            wordModelDecorator.addWord(word.toLowerCase());
        }
    }

    @FXML
    void clearTextEntry(ActionEvent event) {
        textEntry.clear();
    }

}
