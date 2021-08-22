package entity;

import java.util.HashMap;
import java.util.Map;

import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sistema {
	public Stage stage = new Stage();
	public Scene scene = new Scene(null);
	public Map<String, PessoaFisica> pessoasFisica = new HashMap<String,PessoaFisica>();
	public Map<String, PessoaJuridica> pessoasJuridica = new HashMap<String,PessoaJuridica>();
	
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public Scene getScene() {
		return scene;
	}
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	public Map<String, PessoaFisica> getPessoasFisica() {
		return pessoasFisica;
	}
	public void setPessoasFisica(Map<String, PessoaFisica> pessoasFisica) {
		this.pessoasFisica = pessoasFisica;
	}
	public Map<String, PessoaJuridica> getPessoasJuridica() {
		return pessoasJuridica;
	}
	public void setPessoasJuridica(Map<String, PessoaJuridica> pessoasJuridica) {
		this.pessoasJuridica = pessoasJuridica;
	}
	
	public Sistema(Stage stage, Scene scene, Map<String, PessoaFisica> pessoasFisica,
			Map<String, PessoaJuridica> pessoasJuridica) {
		super();
		this.stage = stage;
		this.scene = scene;
		this.pessoasFisica = pessoasFisica;
		this.pessoasJuridica = pessoasJuridica;
	}
	
	public Sistema(Map<String, PessoaFisica> pessoasFisica, Map<String, PessoaJuridica> pessoasJuridica) {
		super();
		this.pessoasFisica = pessoasFisica;
		this.pessoasJuridica = pessoasJuridica;
	}
	
	public Sistema(Stage stage, Scene scene) {
		super();
		this.stage = stage;
		this.scene = scene;
	}
	
	public Sistema() {
		super();
	}

	
}
