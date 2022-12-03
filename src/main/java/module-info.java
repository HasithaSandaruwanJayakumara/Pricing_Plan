module com.example.pricing_plan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pricing_plan to javafx.fxml;
    exports com.example.pricing_plan;
}