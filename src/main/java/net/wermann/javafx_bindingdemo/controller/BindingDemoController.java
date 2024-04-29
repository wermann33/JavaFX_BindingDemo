package net.wermann.javafx_bindingdemo.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import net.wermann.javafx_bindingdemo.models.Model;
import net.wermann.javafx_bindingdemo.viewmodels.ViewModel;

import java.net.URL;
import java.util.ResourceBundle;

public class BindingDemoController implements Initializable {
    @FXML
    private Label oneTimeLabel;
    @FXML
    private Label oneWayLabel;
    @FXML
    private TextField twoWayTextField;
    @FXML
    private TextField twoWayBindingTextField;

    private ViewModel viewModel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model model = new Model();
        viewModel = new ViewModel(model);

        // One-Time Binding
        oneTimeLabel.setText(viewModel.getOneTimeText());

        // One-Way Binding
        oneWayLabel.textProperty().bind(viewModel.readOnlyTextProperty());

        // Two-Way Binding
        twoWayTextField.textProperty().bindBidirectional(viewModel.textProperty());
        twoWayBindingTextField.textProperty().bindBidirectional(viewModel.textProperty());
    }
}
