package guru.langer.phonebookjavafxv2.controller;

import guru.langer.phonebookjavafxv2.model.Contact;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PhoneBookController {

    @FXML
    public TextField fieldName;
    @FXML
    public TextField fieldNumber;
    @FXML
    public TextField fieldMail;
    @FXML
    public TableColumn<Contact, String> colName;
    @FXML
    public TableColumn<Contact, String> colNumber;
    @FXML
    public TableColumn<Contact, String> colMail;
    @FXML
    public Label labelInfo;
    @FXML
    public TableView<Contact> tableView;
    @FXML
    private Label welcomeText;

    public void onSave(ActionEvent actionEvent) {
    }

    public void initialize() {
        System.out.println("init PhoneBookController");
        initTableView();
        addExampleContacts();
    }

    private void initTableView() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
        colMail.setCellValueFactory(new PropertyValueFactory<>("email"));
    }

    private void addExampleContacts() {
        tableView.getItems().add(new Contact(1, "John Doe", "+49 555 1234567", "john.doe@example.org"));
        tableView.getItems().add(new Contact(1, "Jane Doe", "+49 555 7654321", "jane.doe@example.org"));
    }
}