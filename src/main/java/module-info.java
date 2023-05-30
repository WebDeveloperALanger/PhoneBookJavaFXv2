module guru.langer.phonebookjavafxv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens guru.langer.phonebookjavafxv2 to javafx.fxml;
    exports guru.langer.phonebookjavafxv2;
    exports guru.langer.phonebookjavafxv2.controller;
    opens guru.langer.phonebookjavafxv2.controller to javafx.fxml;
}