package api;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;

public class LoginApplication {
	public void validacao(Scanner entrada, Map<String,PessoaFisica> pessoas, PessoaFisica usuario) {
        String chave = Integer.toString(usuario.getId());
        
        if(pessoas.get(chave) == null) {
        	System.out.println("[AVISO]: Pessoa nao encontrado!");
        }else {
        	Boolean isCadastrado = pessoas.containsValue(usuario);
        	System.out.println(isCadastrado);
        }
	}
}
