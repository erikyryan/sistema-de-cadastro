package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class App extends Application{
	
	@Override
	public void start(Stage stage) {
		try {
			stage.setScene(TelaPrincipal(stage));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public Scene TelaPrincipal(Stage stage) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPrincipal.fxml"));
		Scene scene = new Scene(root);
		return scene;
	}
	
	public Scene TelaPessoaFisica(Stage stage) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPessoaFisica.fxml"));
		Scene scene = new Scene(root);
		return scene;
		
	}
	
	public Scene TelaPessoaJuridica(Stage stage) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPessoaJuridica.fxml"));
		Scene scene = new Scene(root);
		return scene;
	}
	
}	
