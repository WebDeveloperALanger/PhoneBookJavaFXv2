module guru.langer.phonebookjavafxv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens guru.langer.phonebookjavafxv2 to javafx.fxml;
    exports guru.langer.phonebookjavafxv2;
}