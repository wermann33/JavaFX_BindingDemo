package net.wermann.javafx_bindingdemo.viewmodels;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.StringProperty;
import net.wermann.javafx_bindingdemo.models.Model;

public class ViewModel {
    private Model model;

    public ViewModel(Model model) {
        this.model = model;
    }

    // One-Time Binding
    public String getOneTimeText() {
        return model.getOneTimeText();
    }

    // One-Way Binding
    public ReadOnlyStringProperty readOnlyTextProperty() {
        return model.textProperty();
    }

    // Two-Way Binding
    public StringProperty textProperty() {
        return model.textProperty();
    }

    public void setText(String text) {
        model.setText(text);
    }
}
