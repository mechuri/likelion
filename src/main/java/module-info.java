module com.likelion.til {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.til to javafx.fxml;
    exports com.likelion.til;
}