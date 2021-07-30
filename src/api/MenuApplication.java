package api;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;
import menu.MenuPessoasImpl;



public class MenuApplication {
	public static MenuPessoasImpl menuPessoas = new MenuPessoasImpl();
	
	public void MenuUsuario(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada) throws Exception{
	    int opc;
	    do{
	    	Integer chave,user;
	    	System.out.println("Deseja realizar a operacao como pessoa fisica ou juridica?(1 - Pessoa fisica, 2 - Pessoa juridica)");
	        user = entrada.nextInt();
	        entrada.nextLine();
	    	
	        if(user == 1 && pessoasFisicas.isEmpty()) {
	    		System.out.println("[ALERTA]: Nao ha usuarios cadastrados! Primeiro cadastre um usuario!");
	    		menuPessoas.adicionar(pessoasFisicas,pessoasJuridicas, entrada,user);
	    	}else if(user == 2 && pessoasJuridicas.isEmpty()){
	    		System.out.println("[ALERTA]: Nao ha usuarios cadastrados! Primeiro cadastre um usuario!");
	    		menuPessoas.adicionar(pessoasFisicas,pessoasJuridicas, entrada,user);
	    	}else {
	            System.out.println("Digite uma opcao (1 - Sair | 2 - Adicionar | 3 - Exibir | 4 - Verificar | 5 - Remover) ");
	            chave = entrada.nextInt();
	            entrada.nextLine();
	            
	            switch (chave) {
	            case 1:
	            	System.out.println("Encerrando o programa!");
	                break;
	            case 2: 
	            	menuPessoas.adicionar(pessoasFisicas,pessoasJuridicas, entrada,user);
	                break;
	            case 3:
	            	menuPessoas.exibir(pessoasFisicas,pessoasJuridicas, entrada,user);
	                break;
	            case 4:
	            	menuPessoas.verificar(pessoasFisicas,pessoasJuridicas, entrada,user);
	                break;
	            case 5:
	            	menuPessoas.remover(pessoasFisicas,pessoasJuridicas, entrada,user);
	                break;
	            default:
	                System.out.println("[ALERTA]: Opcao invalida");
	            }
	    	}
	
	        System.out.println("Deseja realizar alguma operacao? (0 - Sim, 1 - Nao)");
	        opc = entrada.nextInt();
	        entrada.nextLine();
			entrada.close();
	        opc = opc == 1 ? -1 : 0; 
	    }while(opc != -1);
	    
	}
	
}
