module com.example.soft_media {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soft_media to javafx.fxml;
    exports com.example.soft_media;
}