package controller;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import application.App;
import entity.Sistema;
import entity.pessoa.PessoaJuridica;
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

public class TelaJuridicaController  implements Initializable{

	Sistema sistema = new Sistema();
	App app = new App();
	
	Map<String,PessoaJuridica> pessoas = new HashMap<String,PessoaJuridica>();
	private ObservableList<PessoaJuridica> obsPessoas;
	
	@FXML
    private Button pessoaFisica;

    @FXML
    private Button telaPrincipal;

    @FXML
    private Button limpar;

    @FXML
    private ListView<PessoaJuridica> listar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCNPJ;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtCEP;

    @FXML
    private TextField txtNumero;

    @FXML
    private Label nome;

    @FXML
    private Label CNPJ;

    @FXML
    private Label senha;

    @FXML
    private Label cidade;

    @FXML
    private Label ID;

    @FXML
    private Label cep;

    @FXML
    private Label numero;

    @FXML
    private Button adicionar;

    @FXML
    private Button alterar;

    @FXML
    private Button deletar;

    @FXML
    private ListView<PessoaJuridica> lista;

    @FXML
    void acaoTelaPrincipal(ActionEvent event) throws IOException {
    	Scene scene = app.TelaPrincipal(sistema);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();   	

    }

    @FXML
    void adicionando(ActionEvent event) {
    	carregarPessoasJuridica();
    	try {
	    	if(txtID.getText().isBlank() == false) {
	    		PessoaJuridica pessoa = new PessoaJuridica();
		    	pessoa.setId((String)txtID.getText());
		    	pessoa.setNome((String) txtNome.getText());
		    	pessoa.setCnpj((String) txtCNPJ.getText());
		    	pessoa.setEndereco((String) txtCidade.getText(),
		    			(String) txtCEP.getText(), (String) txtNumero.getText());
		    	pessoa.setSenha((String) txtSenha.getText());
		    	
		    	sistema.savePessoasJuridica(pessoa);
	    	}else
	    		throw new Exception("ID nao informado");
    	}catch(IllegalArgumentException e) {
    		JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"[ERRO]:" + e.toString());
    	}finally {
			carregarPessoasJuridica();
			limpandoCampos();
		}

    }

    @FXML
    void alterando(ActionEvent event) {
    	carregarPessoasJuridica();
    	try {
    		if(txtID.getText().isBlank() == false) {
	    		if(sistema.pessoasJuridica.containsKey((String) txtID.getText())){
		    		PessoaJuridica pessoa = new PessoaJuridica();
		    		pessoa.setId((String) txtID.getText());
		        	pessoa.setNome((String) txtNome.getText());
		        	pessoa.setCnpj((String) txtCNPJ.getText());
		        	pessoa.setEndereco((String) txtCidade.getText(),
		        			(String) txtCEP.getText(), (String) txtNumero.getText());
		        	pessoa.setSenha((String) txtSenha.getText());
		        	sistema.savePessoasJuridica(pessoa);
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
			carregarPessoasJuridica();
			limpandoCampos();
		}

    }

    @FXML
    void deletando(ActionEvent event) {
    	carregarPessoasJuridica();
    	try {
    		if(sistema.pessoasJuridica.containsKey((String) txtID.getText())){
    			sistema.pessoasJuridica.remove((String) txtID.getText());
    		}else
    			throw new IllegalArgumentException();
    		
	    }catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "ID não informado ou invalido (" + e.toString() +")");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"[ERRO]:" + e.toString());
		}finally {
			carregarPessoasJuridica();
			limpandoCampos();
		}

    }

    @FXML
    void limpando(ActionEvent event) {
    	limpandoCampos();
    }

    @FXML
    void acaoPessoaFisica(ActionEvent event) throws IOException {
    	Scene scene = app.TelaPessoaFisica(sistema);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarPessoasJuridica();
	}
	public void carregarPessoasJuridica() {
		obsPessoas = FXCollections.observableList(sistema.HashJuridicaToList(sistema.pessoasJuridica));
		listar.setItems(obsPessoas);
	}
	
	public void limpandoCampos() {
		txtNome.setText("");
    	txtSenha.setText("");
    	txtCNPJ.setText("");
    	txtID.setText("");
    	txtNumero.setText("");
    	txtCEP.setText("");
    	txtCidade.setText("");
	}
	
	public TelaJuridicaController(Sistema sistema) {
		this.sistema = sistema;
	}

}
