package application;

import java.io.IOException;

import entity.Sistema;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class App extends Application{
	
	Sistema sistema = new Sistema();
	
	@Override
	public void start(Stage stage) {
		try {
			stage.setScene(TelaPrincipal(sistema));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public Scene TelaPrincipal(Sistema sistema) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPrincipal.fxml"));
		this.sistema = sistema;
		sistema.scene = new Scene(root);
		
		return sistema.scene;
	}
	
	public Scene TelaPessoaFisica(Sistema sistema) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPessoaFisica.fxml"));
		this.sistema = sistema;
		Scene scene = new Scene(root);
		return scene;
		
	}
	
	public Scene TelaPessoaJuridica(Sistema sistema) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPessoaJuridica.fxml"));
		this.sistema = sistema;
		Scene scene = new Scene(root);
		return scene;
	}
	
}	
