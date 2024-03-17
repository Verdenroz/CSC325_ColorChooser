module org.farmingdale.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.farmingdale.colorchooser to javafx.fxml;
    exports org.farmingdale.colorchooser;
}