package application;

import java.io.IOException;

import controller.TelaController;
import controller.TelaFisicaController;
import controller.TelaJuridicaController;
import entity.Sistema;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
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
		FXMLLoader resource = new FXMLLoader(getClass().getResource("../view/TelaPrincipal.fxml"));
		resource.setController(new TelaController(sistema));
		Scene scene = new Scene(resource.load());
		return scene;
	}
	
	public Scene TelaPessoaFisica(Sistema sistema) throws IOException {
		FXMLLoader resource = new FXMLLoader(getClass().getResource("../view/TelaPessoaFisica.fxml"));
		resource.setController(new TelaFisicaController(sistema));
		Scene scene = new Scene(resource.load());
		return scene;
	}
	
	public Scene TelaPessoaJuridica(Sistema sistema) throws IOException {
		FXMLLoader resource = new FXMLLoader(getClass().getResource("../view/TelaPessoaJuridica.fxml"));
		resource.setController(new TelaJuridicaController(sistema));
		Scene scene = new Scene(resource.load());
		return scene;
	}
	
}	
