module com.example.ap_workshop11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ap_workshop11 to javafx.fxml;
    exports com.example.ap_workshop11;
}