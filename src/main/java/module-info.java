module net.wermann.javafx_bindingdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens net.wermann.javafx_bindingdemo to javafx.fxml, javafx.graphics;
    opens net.wermann.javafx_bindingdemo.controller to javafx.fxml;
}