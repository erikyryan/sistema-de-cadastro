package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.App;
import entity.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaController implements Initializable{

	App app = new App();
	Sistema sistema = new Sistema();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private Button pessoaFisica;

    @FXML
    private Button pessoaJuridica;

    @FXML
    void acaoPessoaFisica(ActionEvent event) throws IOException {
    	Scene scene = app.TelaPessoaFisica(sistema);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	stage.setScene(scene);
    	stage.show();
    }

	@FXML
    void acaoPessoaJuridica(ActionEvent event) throws IOException {
		Scene scene = app.TelaPessoaJuridica(sistema);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public TelaController(Sistema sistema) {
		this.sistema = sistema;
	}
}
