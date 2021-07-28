package api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;

public class LoginApplication {
	
	private Map<String, PessoaFisica> pessoasTest = new HashMap<>();
	
	public void validacao(Scanner entrada, Map<String,PessoaFisica> pessoas, PessoaFisica usuario) {
        String chave = Integer.toString(usuario.getId());
        
        for(Map.Entry<String, PessoaFisica> entry : pessoas.entrySet()) {
            Integer id = entry.getValue().getId();
            String nome = entry.getValue().getNome();
            String senha = entry.getValue().getSenha();
            PessoaFisica pessoa = new PessoaFisica(id,nome,senha);
            
            pessoasTest.put(id.toString(), pessoa);
        }
        
        if(pessoas.get(chave) == null) {
        	System.out.println("[AVISO]: Pessoa nao encontrado!");
        }else {
 
        	for(String key : pessoas.keySet()) {
        		if(pessoasTest.get(key).equals(usuario) == true) {
       				System.out.println("Usuário logado com sucesso!");
       				break;
       			}
       		}
        }
	}
	
	public void telaDeLogin(Map<String, PessoaFisica> pessoas, Scanner entrada) {
        int opc = 0;
        do{
            System.out.println("Digite a chave do usuario:");
            Integer chave = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Digite o nome do usuario:");
            String nome = entrada.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = entrada.nextLine();

//            System.out.println("Gerente ou cliente?(1 - Gerente | 2 - Cliente)");
//            Integer tipoUsuario = entrada.nextInt();
//            entrada.nextLine();    
//
//            Status status = tipoUsuario == 1 ? Status.GERENTE : Status.CLIENTE;

            PessoaFisica p = new PessoaFisica(chave,nome,senha);

            validacao(entrada, pessoas,p);

            System.out.println("Deseja continuar logando? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
        
    }
	
}
