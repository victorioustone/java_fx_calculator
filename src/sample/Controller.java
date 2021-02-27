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
    private TextField field;

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
        field.appendText("1");

    }

    public void setBtnTwo() {
        field.appendText("2");
    }

    public void setBtnThree() {
        field.appendText("3");
    }

    public void setBtnFour() {
        field.appendText("4");
    }

    public void setBtnFive() {
        field.appendText("5");
    }

    public void setBtnSix() {
        field.appendText("6");
    }

    public void setBtnSeven() {
        field.appendText("7");
    }

    public void setBtnEight() {
        field.appendText("8");
    }

    public void setBtnNine() { field.appendText("9"); }

    public void setBtnPlus() {
        field.appendText("+");
    }

    public void setBtnMinus() {
        field.appendText("-");
    }

    public void setBtnClear() {
        field.clear();
    }

    public void setBtnEquals() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval(field.getText());
        field.clear();
        field.appendText(result.toString());

    }



}

