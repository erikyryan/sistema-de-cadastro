package api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;

public class LoginApplication {
	
	public void validacao(Scanner entrada, Map<String,PessoaFisica> pessoas, PessoaFisica usuario) {
        
		for(String key: pessoas.keySet()) {
			String name = pessoas.get(key).getNome();
			String senha = pessoas.get(key).getSenha();
			PessoaFisica p = new PessoaFisica(name,senha);
			
			if(p.equals(usuario) == false) {
				System.out.println("Usuário logado com sucesso!");
			}
		}
	}
	
	public void telaDeLogin(Map<String, PessoaFisica> pessoas, Scanner entrada) {
        int opc = 0;
        do{

            System.out.println("Digite o nome do usuario:");
            String nome = entrada.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = entrada.nextLine();

//            System.out.println("Gerente ou cliente?(1 - Gerente | 2 - Cliente)");
//            Integer tipoUsuario = entrada.nextInt();
//            entrada.nextLine();    
//
//            Status status = tipoUsuario == 1 ? Status.GERENTE : Status.CLIENTE;

           PessoaFisica p = new PessoaFisica(nome,senha);

           validacao(entrada, pessoas,p);

           System.out.println("Deseja continuar logando? (0 - Sim, 1 - Nao)");
           opc = entrada.nextInt();
           entrada.nextLine();
           opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
        
    }
	
}
