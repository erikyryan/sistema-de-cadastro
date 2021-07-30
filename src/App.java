  
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import api.MenuApplication;
import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;

public class App {
	public static void main(String[] args) throws Exception {
	    Scanner entrada = new Scanner(System.in);
		
	    try {
			Map<String,PessoaFisica> pessoasFisicas = new HashMap<String,PessoaFisica>();
			Map<String,PessoaJuridica> pessoasJuridicas = new HashMap<String,PessoaJuridica>();
		    MenuApplication menu = new MenuApplication();
		    
		    menu.MenuUsuario( pessoasFisicas,pessoasJuridicas, entrada);
		    
		}catch(Exception e) {
			System.err.println(e.toString());			
			e.printStackTrace();
		}finally {
			entrada.close();
		}
		
	}
    
}
