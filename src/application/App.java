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
			TelaPrincipal(stage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void TelaPrincipal(Stage stage) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPrincipal.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	public Scene TelaPessoaFisica(Stage stage) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/TelaPessoaFisica.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
		return scene;
		
	}
	
}	
