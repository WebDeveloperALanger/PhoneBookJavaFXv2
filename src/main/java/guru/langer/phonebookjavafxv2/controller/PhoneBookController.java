package guru.langer.phonebookjavafxv2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PhoneBookController {

    @FXML
    public TextField fieldName;
    @FXML
    public TextField fieldNumber;
    @FXML
    public TextField fieldMail;
    @FXML
    public TableColumn colName;
    @FXML
    public TableColumn colNumber;
    @FXML
    public TableColumn colMail;
    @FXML
    public Label labelInfo;
    @FXML
    public TableView tableMain;
    @FXML
    private Label welcomeText;

    public void onSave(ActionEvent actionEvent) {
    }

    void initialize() {
        System.out.println("init PhoneBookController");
    }
}