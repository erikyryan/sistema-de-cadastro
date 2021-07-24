  
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import api.LoginApplication;
import api.MenuApplication;
import entity.pessoa.PessoaFisica;
import entity.pessoa.Status;

public class App {
	public static void main(String[] args) throws Exception {
	    Map<String,PessoaFisica> pessoas = new HashMap<String,PessoaFisica>();
	    Scanner entrada = new Scanner(System.in);
	    MenuApplication menu = new MenuApplication();
	    LoginApplication login = new LoginApplication();
	    PessoaFisica p = new PessoaFisica(2,"ryan","1",Status.GERENTE);
	    menu.MenuUsuario(entrada, pessoas);
	    login.validacao(entrada,pessoas,p);
	    entrada.close();
	}
    
}
