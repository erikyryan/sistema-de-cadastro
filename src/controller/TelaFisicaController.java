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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.collections.FXCollections;


public class TelaFisicaController implements Initializable{
    
	Sistema sistema = new Sistema();
	App app = new App();
	
	Map<String,PessoaFisica> pessoas = new HashMap<String,PessoaFisica>();
	private ObservableList<PessoaFisica> obsPessoas;
	
    @FXML
    private Button telaPrincipal;

    @FXML
    private Button pessoaJuridica;

    @FXML
    private Label cpf;

    @FXML
    private TextField txtCPF;

    @FXML
    private Label senha;

    @FXML
    private TextField txtSenha;

    @FXML
    private Label cidade;

    @FXML
    private TextField txtCidade;

    @FXML
    private Label cep;

    @FXML
    private TextField txtCEP;

    @FXML
    private Label numero;

    @FXML
    private TextField txtNumero;

    @FXML
    private Button adicionar;

    @FXML
    private Button alterar;

    @FXML
    private Button delete;

    @FXML
    private Label id;

    @FXML
    private TextField txtID;

    @FXML
    private Label nome;

    @FXML
    private TextField txtNome;

    @FXML
    private ListView<PessoaFisica> listar;

    @FXML
    void adicionando(ActionEvent event) {
    	carregarPessoasFisica();
    	try {
	    	if(txtID.getText().isBlank() == false) {
		    	PessoaFisica pessoa = new PessoaFisica();
		    	pessoa.setId((String)txtID.getText());
		    	pessoa.setNome((String) txtNome.getText());
		    	pessoa.setCpf((String) txtCPF.getText());
		    	pessoa.setEndereco((String) txtCidade.getText(),
		    			(String) txtCEP.getText(), (String) txtNumero.getText());
		    	pessoa.setSenha((String) txtSenha.getText());
		    	
		    	sistema.savePessoaFisica(pessoa);
	    	}else
	    		throw new Exception("ID nao informado");
    	}catch(IllegalArgumentException e) {
    		JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"[ERRO]:" + e.toString());
    	}finally {
			carregarPessoasFisica();
		}
    }

    @FXML
    void alterando(ActionEvent event) {
    	carregarPessoasFisica();
    	try {
    		if(txtID.getText().isBlank() == false) {
	    		if(sistema.pessoasFisica.containsKey((String) txtID.getText())){
		    		PessoaFisica pessoa = new PessoaFisica();
		    		pessoa.setId((String) txtID.getText());
		        	pessoa.setNome((String) txtNome.getText());
		        	pessoa.setCpf((String) txtCPF.getText());
		        	pessoa.setEndereco((String) txtCidade.getText(),
		        			(String) txtCEP.getText(), (String) txtNumero.getText());
		        	pessoa.setSenha((String) txtSenha.getText());
		        	sistema.savePessoaFisica(pessoa);
		    	}else 
		    		throw new IllegalArgumentException();
    		}else
    			throw new Exception("ID nao informado");
    	}catch(IllegalArgumentException e) {
    		JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"[ERRO]:" + e.toString());
    	}finally {
			carregarPessoasFisica();
		}
    }

    @FXML
    void deletando(ActionEvent event) {
    	carregarPessoasFisica();
    	try {
    		if(sistema.pessoasFisica.containsKey((String) txtID.getText())){
    			sistema.pessoasFisica.remove((String) txtID.getText());
    		}else
    			throw new IllegalArgumentException();
    		
	    }catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"[ERRO]:" + e.toString());
		}finally {
			carregarPessoasFisica();
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
		carregarPessoasFisica();
	}
	
	public void carregarPessoasFisica() {
		obsPessoas = FXCollections.observableList(sistema.HashFisicaToList(sistema.pessoasFisica));
		listar.setItems(obsPessoas);
	}
	
}
