package net.wermann.javafx_bindingdemo.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
    private StringProperty textProperty = new SimpleStringProperty();

    public StringProperty textProperty() {
        return textProperty;
    }

    public String getOneTimeText() { return "One-Time Text"; };

    public void setText(String text) {
        textProperty.set(text);
    }
}
