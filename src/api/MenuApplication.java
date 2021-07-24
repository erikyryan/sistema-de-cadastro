package api;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;
import menu.MenuPessoaImpl;
import menu.MenuVeiculoImpl;

public class MenuApplication {
	public static MenuPessoaImpl menuPessoa = new MenuPessoaImpl();
	public static MenuVeiculoImpl menuVeiculo = new MenuVeiculoImpl();
	
	public void MenuUsuario(Scanner entrada, Map<String,PessoaFisica> pessoas) throws Exception{
		
	
	    int opc;
	    do{
	    	Integer chave;
	    	if(pessoas.isEmpty()) {
	    		System.out.println("[ALERTA]: Nao ha usuarios cadastrados! Primeiro cadastre um usuario!");
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
	                System.out.println("[ALERTA]: Opção invalida");
	                break;
	            }
	    	}
	
	        System.out.println("Deseja realizar alguma operação? (0 - Sim, 1 - Nao)");
	        opc = entrada.nextInt();
	        entrada.nextLine();
	        opc = opc == 1 ? -1 : 0; 
	    }while(opc != -1);
	    entrada.close();
	}

	public void MenuVeiculo(Scanner entrada, Map<String,PessoaFisica> pessoas) {
	    int opc;
	    do{
	    	
	    	System.out.println("Digite o seu id: ");
	        Integer chave = entrada.nextInt();
	        entrada.nextLine();
	        
	        String key = Integer.toString(chave);
	        
	        if(autenticacao(chave,pessoas) == true) {
	        	System.out.println("Digite uma opção (1 - Sair | 2 - Adicionar | 3 - Exibir | 4 - Remover) ");
		        opc = entrada.nextInt();
		        entrada.nextLine();
	        	
		        switch (opc) {
		        case 1:
		            break;
		        case 2: 
		        	menuVeiculo.adicionar(pessoas.get(key),entrada);
		         	break;
		        case 3:
		        	menuVeiculo.exibir(pessoas.get(key));
		            break;
		        case 4:
		        	menuVeiculo.remover(pessoas.get(key),entrada);
		           break;
		        default:
		            System.out.println("[ALERTA]: Opcao invalida");
		            break;
		        }
		        
	        }else {
	        	System.out.println("[ALERTA]: usuario nao existe!");
	        }
	
	        System.out.println("Deseja realizar alguma operação? (0 - Sim, 1 - Nao)");
	        opc = entrada.nextInt();
	        entrada.nextLine();
	        opc = opc == 1 ? -1 : 0; 
	    }while(opc != -1);
	    entrada.close();
	}
	
	private Boolean autenticacao(Integer chave, Map<String,PessoaFisica> pessoas) {
		String verificarChave = Integer.toString(chave);

        if(pessoas.containsKey(verificarChave))
            return true;
        else
        	return false;
	}
}
