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
    	sistema.scene = app.TelaPessoaFisica(sistema);
    	sistema.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	sistema.stage.setScene(sistema.scene);
    	sistema.stage.show();
    }

	@FXML
    void acaoPessoaJuridica(ActionEvent event) throws IOException {
		sistema.scene = app.TelaPessoaJuridica(sistema);
		sistema.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		sistema.stage.setScene(sistema.scene);
		sistema.stage.show();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
