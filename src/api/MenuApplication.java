package api;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;
import menu.MenuPessoaImpl;

public class MenuApplication {
	
	public void MenuUsuario(Scanner entrada, Map<String,PessoaFisica> pessoas) {
		MenuPessoaImpl menuPessoa = new MenuPessoaImpl();
	
	    int opc;
	    do{
	    	Integer chave;
	    	if(pessoas.isEmpty()) {
	    		System.out.println("[ALERTA]: Não há usuários cadastrados! Primeiro cadastre um usuário!");
	    		menuPessoa.adicionar(pessoas, entrada);
	    	}else {
	    	
	            System.out.println("Digite uma opção (1 - Sair | 2 - Adicionar | 3 - Exibir | 4 - Verificar | 5 - Remover) ");
	            chave = entrada.nextInt();
	            entrada.nextLine();
	            
	            switch (chave) {
	            case 1:
	                break;
	            case 2: 
	            	menuPessoa.adicionar(pessoas, entrada);
	                break;
	            case 3:
	            	menuPessoa.exibir(pessoas);
	                break;
	            case 4:
	            	menuPessoa.verificar(pessoas, entrada);
	                break;
	            case 5:
	            	menuPessoa.remover(pessoas, entrada);
	                break;
	            default:
	                System.out.println("[ALERTA]: Opção inválida");
	                break;
	            }
	            
	    	}
	
	        System.out.println("Deseja realizar alguma operação? (0 - Sim, 1 - Não)");
	        opc = entrada.nextInt();
	        entrada.nextLine();
	        opc = opc == 1 ? -1 : 0; 
	    }while(opc != -1);
	    entrada.close();
	}

	public void MenuVeiculo(Scanner entrada, Map<String,PessoaFisica> pessoas) {
		
	}
}
