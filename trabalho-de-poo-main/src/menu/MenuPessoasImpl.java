package menu;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import entity.Sistema;
import entity.pessoa.Endereco;
import entity.pessoa.Pessoa;
import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;
import entity.veiculo.TipoDeVeiculo;
import entity.veiculo.Veiculo;

public class MenuPessoasImpl implements MenuPessoas {

	Map<String, PessoaFisica> pessoasFisica = new HashMap<String,PessoaFisica>();
	Map<String, PessoaJuridica> pessoasJuridica = new HashMap<String,PessoaJuridica>();
	
    @Override
    public void remover(Sistema sistema, int user){
//    	try {
//	    	if(user == 1 && sistema.pessoasFisica.containsKey(verificarChave)){
//	    		for(String chave : sistema.pessoasFisica.keySet()){
//	    			PessoaFisica pessoaFisica = sistema.pessoasFisica.get(chave);
//	    			sistema.pessoasFisica.remove(id)
//	    		}
//	        }else if(user == 2){
//	        	for(String chave :pessoasJuridicas.keySet()){
//	        		PessoaJuridica pessoaJuridica =pessoasJuridicas.get(chave);
//	    			System.out.println("Chave: " + chave + " | " + pessoaJuridica.toString());
//	    		}
//	        }else{
//	        	throw new Exception();
//	        }
//    	}catch(Exception e){
//    		System.err.println(e.toString());
//    	}
//       
    }

    @Override
    public void exibir(Sistema sistema, int user){
//    	try {
//	    	if(user == 1){
//	    		for(String chave :pessoasFisicas.keySet()){
//	    			PessoaFisica pessoaFisica = pessoasFisicas.get(chave);
//	    			System.out.println("Chave: " + chave + " | " + pessoaFisica.toString());
//	    		}
//	        }else if(user == 2){
//	        	for(String chave :pessoasJuridicas.keySet()){
//	        		PessoaJuridica pessoaJuridica =pessoasJuridicas.get(chave);
//	    			System.out.println("Chave: " + chave + " | " + pessoaJuridica.toString());
//	    		}
//	        }else{
//	        	throw new Exception();
//	        }
//    	}catch(Exception e){
//    		System.err.println(e.toString());
//    	}
        
    }

    @Override
    public void adicionar(Sistema sistema, int user){
    	try {
	    	if(user == 1)
	    		sistema.pessoasFisica.put(null, null);
	    	else if(user == 2)
	        	sistema.pessoasJuridica.put(null, null);
	        else
	        	throw new Exception();
	        
    	}catch(Exception e){
    		System.err.println(e.toString());
    	}

    }

}
