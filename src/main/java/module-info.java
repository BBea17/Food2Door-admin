module com.prl.food2door.admin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.prl.food2door.admin to javafx.fxml;
    exports com.prl.food2door.admin;
}
