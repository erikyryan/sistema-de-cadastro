package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application{
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		Pane root = FXMLLoader.load(getClass().getResource("Tela.fxml"));
		
		Scene scene = new Scene(root,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) throws Exception {
		launch(args);
	}

}

//	    Scanner entrada = new Scanner(System.in);

//	    try {
//			Map<String,PessoaFisica> pessoasFisicas = new HashMap<String,PessoaFisica>();
//			Map<String,PessoaJuridica> pessoasJuridicas = new HashMap<String,PessoaJuridica>();
//		    MenuApplication menu = new MenuApplication();
//		    
//		    menu.MenuUsuario( pessoasFisicas,pessoasJuridicas, entrada);
//		    
//		}catch(Exception e) {
//			System.err.println(e.toString());			
//			e.printStackTrace();
//		}finally {
//			entrada.close();
//		}
		