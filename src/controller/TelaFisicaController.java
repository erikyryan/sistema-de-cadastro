package controller;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import application.App;
import entity.Sistema;
import entity.pessoa.PessoaFisica;
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
    
	Sistema sistema = new Sistema();
	App app = new App();
	
	Map<String,PessoaFisica> pessoas = new HashMap<String,PessoaFisica>();
	
	
	@FXML
    private Button telaPrincipal;

	@FXML
    private Button pessoaJuridica;
	
	@FXML
    private Label labelID;

	@FXML
	private TextField TextFieldID;

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
    private Label labelCPF;

    @FXML
    private TextField TextFieldCPF;
    
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
    void Adicionando(ActionEvent event) {
    	try {
	    	if(TextFieldID.getText().isBlank() == false) {
		    	PessoaFisica pessoa = new PessoaFisica();
		    	pessoa.setId((String)TextFieldID.getText());
		    	pessoa.setNome((String) TextFieldName.getText());
		    	pessoa.setCpf((String) TextFieldCPF.getText());
		    	pessoa.setEndereco((String) TextFieldCidade.getText(),
		    			(String) TextFieldCEP.getText(), (String) TextFieldNumero.getText());
		    	pessoa.setSenha((String) TextFieldSenha.getText());
		    	
		    	sistema.savePessoaFisica(pessoa);
	    	}else
	    		throw new Exception("ID nao informado");
    	}catch(IllegalArgumentException e) {
    		JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.toString());
    	}
    }

    @FXML
    void Alterando(ActionEvent event) {
    	try {
    		if(TextFieldID.getText().isBlank() == false) {
	    		if(sistema.pessoasFisica.containsKey((String) TextFieldID.getText())){
		    		PessoaFisica pessoa = new PessoaFisica();
		        	pessoa.setNome((String) TextFieldName.getText());
		        	pessoa.setCpf((String) TextFieldCPF.getText());
		        	pessoa.setEndereco((String) TextFieldCidade.getText(),
		        			(String) TextFieldCEP.getText(), (String) TextFieldNumero.getText());
		        	pessoa.setSenha((String) TextFieldSenha.getText());
		        	
		        	sistema.savePessoaFisica(pessoa);
		    	}else 
		    		throw new IllegalArgumentException();
    		}else
    			throw new Exception("ID nao informado");
    	}catch(IllegalArgumentException e) {
    		JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.toString());
    	}
    }

    @FXML
    void Deletando(ActionEvent event) {
    	try {
    		if(sistema.pessoasFisica.containsKey((String) TextFieldID.getText())){
    			sistema.pessoasFisica.remove((String) TextFieldID.getText());
    		}else
    			throw new IllegalArgumentException();
    		
	    }catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"[ERROR]:" + e.toString());
		}

    }
    
    @FXML
    void acaoTelaPrincipal(ActionEvent event) throws IOException {
    	Scene scene = app.TelaPrincipal(sistema);
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
		// TODO Auto-generated method stub
		
	}
	
}
