  
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import api.MenuApplication;
import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;

public class App {
	public static void main(String[] args) throws Exception {
	    Scanner entrada = new Scanner(System.in);
		
	    try {
			Map<String,PessoaFisica> pessoas = new HashMap<String,PessoaFisica>();
		    MenuApplication menu = new MenuApplication();
		    
		    //menu.MenuUsuario( pessoas, entrada);
		    
		}catch(InputMismatchException e) {
			System.err.println("[ERROR]: Falha ao passar os dados para o scanner");			
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace(); // imprime o erro da excecao em formato de pilha
		}finally {
			entrada.close();
		}
		
	}
    
}
