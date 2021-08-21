package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.App;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class TelaFisicaController implements Initializable{
    
	Stage stage = new Stage();
	App app = new App();
	
	@FXML
    private Button telaPrincipal;

	@FXML
    private Button pessoaJuridica;

	@FXML
    private Label labelName;

	@FXML
	private TextField TextFieldName;

    @FXML
    private Label labelSenha;

    @FXML
    private TextField TextFieldSenha;

	@FXML
    private Label labelCidade;

	@FXML
    private TextField TextFieldCidade;

	@FXML
	private Label labelCEP;

    @FXML
	private TextField TextFieldCEP;

    @FXML
    private Label labelNumero;

    @FXML
    private TextField TextFieldNumero;

    @FXML
    private Button adicionar;

    @FXML
    private Button alterar;

    @FXML
    private Button delete;

    @FXML
    void acaoTelaPrincipal(ActionEvent event) throws IOException {
    	Scene scene = app.TelaPrincipal(stage);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void acaoPessoaJuridica(ActionEvent event) throws IOException {
    	Scene scene = app.TelaPessoaJuridica(stage);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
   
}
