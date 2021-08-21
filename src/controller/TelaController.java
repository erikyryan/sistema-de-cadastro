package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.App;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import menu.MenuPessoasImpl;

public class TelaController implements Initializable{

	public static MenuPessoasImpl menuPessoas = new MenuPessoasImpl();
	App app = new App();
	
	Stage stage = new Stage();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private Button pessoaFisica;

    @FXML
    private Button pessoaJuridica;

    @FXML
    void acaoPessoaFisica(ActionEvent event) throws IOException {
    	
    	Scene scene = app.TelaPessoaFisica(stage);
		
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
    }

	@FXML
    void acaoPessoaJuridica(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
