package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button nine;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button one;

    @FXML
    private TextField fieldInput;

    @FXML
    private TextField fieldOutput;

    @FXML
    private Button plus;

    @FXML
    private Button minux;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    private Integer container;


    @FXML
    public void setBtnOne() {
        fieldInput.appendText("1");

    }

    public void setBtnTwo() {
        fieldInput.appendText("2");
    }

    public void setBtnThree() {
        fieldInput.appendText("3");
    }

    public void setBtnFour() {
        fieldInput.appendText("4");
    }

    public void setBtnFive() {
        fieldInput.appendText("5");
    }

    public void setBtnSix() {
        fieldInput.appendText("6");
    }

    public void setBtnSeven() {
        fieldInput.appendText("7");
    }

    public void setBtnEight() {
        fieldInput.appendText("8");
    }

    public void setBtnNine() { fieldInput.appendText("9"); }

    public void setBtnPlus() {
        fieldInput.appendText(" + ");
    }

    public void setBtnMinus() {
        fieldInput.appendText(" - ");
    }

    public void setBtnClear() {
        fieldInput.clear();
        fieldOutput.clear();
    }

    public void setBtnEquals() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval(fieldInput.getText());
        fieldOutput.appendText(result.toString());

    }



}

