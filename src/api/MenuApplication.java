package api;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;
import menu.MenuPessoaFisicaImpl;


public class MenuApplication {
	public static MenuPessoaFisicaImpl menuPessoaFisica = new MenuPessoaFisicaImpl();
	
	public void MenuUsuario(Scanner entrada, Map<String,PessoaFisica> pessoas) throws Exception{
	    int opc;
	    do{
	    	Integer chave;
	    	if(pessoas.isEmpty()) {
	    		System.out.println("[ALERTA]: Nao ha usuarios cadastrados! Primeiro cadastre um usuario!");
	    		menuPessoaFisica.adicionar(pessoas, entrada);
	    	}else {
	            System.out.println("Digite uma opção (1 - Sair | 2 - Adicionar | 3 - Exibir | 4 - Verificar | 5 - Remover) ");
	            chave = entrada.nextInt();
	            entrada.nextLine();
	            
	            switch (chave) {
	            case 1:
	                break;
	            case 2: 
	            	menuPessoaFisica.adicionar(pessoas, entrada);
	                break;
	            case 3:
	            	menuPessoaFisica.exibir(pessoas);
	                break;
	            case 4:
	            	menuPessoaFisica.verificar(pessoas, entrada);
	                break;
	            case 5:
	            	menuPessoaFisica.remover(pessoas, entrada);
	                break;
	            default:
	                System.out.println("[ALERTA]: Opção invalida");
	                break;
	            }
	    	}
	
	        System.out.println("Deseja realizar alguma operação? (0 - Sim, 1 - Nao)");
	        opc = entrada.nextInt();
	        entrada.nextLine();
	        opc = opc == 1 ? -1 : 0; 
	    }while(opc != -1);
	    
	}
	
	public void MenuEmpresa() {
		
	}
	
}
