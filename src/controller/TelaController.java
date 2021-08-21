package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botao;

    @FXML
    private Label labelNome;

    @FXML
    private TextField TextFieldNome;

    @FXML
    void botaoApertado(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert botao != null : "fx:id=\"botao\" was not injected: check your FXML file 'Tela.fxml'.";
        assert labelNome != null : "fx:id=\"labelNome\" was not injected: check your FXML file 'Tela.fxml'.";
        assert TextFieldNome != null : "fx:id=\"TextFieldNome\" was not injected: check your FXML file 'Tela.fxml'.";

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
