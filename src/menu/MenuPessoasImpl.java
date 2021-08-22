package menu;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

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
    public void remover(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, int user){
    	try {
	    	if(user == 1){
	    		for(String chave :pessoasFisicas.keySet()){
	    			PessoaFisica pessoaFisica = pessoasFisicas.get(chave);
	    			System.out.println("Chave: " + chave + " | " + pessoaFisica.toString());
	    		}
	        }else if(user == 2){
	        	for(String chave :pessoasJuridicas.keySet()){
	        		PessoaJuridica pessoaJuridica =pessoasJuridicas.get(chave);
	    			System.out.println("Chave: " + chave + " | " + pessoaJuridica.toString());
	    		}
	        }else{
	        	throw new Exception();
	        }
    	}catch(Exception e){
    		System.err.println(e.toString());
    	}
       
    }

    @Override
    public void exibir(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, int user){
    	try {
	    	if(user == 1){
	    		for(String chave :pessoasFisicas.keySet()){
	    			PessoaFisica pessoaFisica = pessoasFisicas.get(chave);
	    			System.out.println("Chave: " + chave + " | " + pessoaFisica.toString());
	    		}
	        }else if(user == 2){
	        	for(String chave :pessoasJuridicas.keySet()){
	        		PessoaJuridica pessoaJuridica =pessoasJuridicas.get(chave);
	    			System.out.println("Chave: " + chave + " | " + pessoaJuridica.toString());
	    		}
	        }else{
	        	throw new Exception();
	        }
    	}catch(Exception e){
    		System.err.println(e.toString());
    	}
        
    }

    @Override
    public void adicionar(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, int user){
    	try {
	    	if(user == 1){
	    		for(String chave :pessoasFisicas.keySet()){
	    			PessoaFisica pessoaFisica = pessoasFisicas.get(chave);
	    			System.out.println("Chave: " + chave + " | " + pessoaFisica.toString());
	    		}
	        }else if(user == 2){
	        	for(String chave :pessoasJuridicas.keySet()){
	        		PessoaJuridica pessoaJuridica =pessoasJuridicas.get(chave);
	    			System.out.println("Chave: " + chave + " | " + pessoaJuridica.toString());
	    		}
	        }else{
	        	throw new Exception();
	        }
    	}catch(Exception e){
    		System.err.println(e.toString());
    	}

    }
	

    public Map<String,PessoaFisica> savePessoaFisica(PessoaFisica pessoaFisica){
    	this.pessoasFisica.put(pessoaFisica.getId(), pessoaFisica);
    	return pessoasFisica;
    }
    
    public Map<String,PessoaJuridica> savePessoasJuridica(PessoaJuridica pessoaJuridica){
    	this.pessoasJuridica.put(pessoaJuridica.getId(), pessoaJuridica);
		return pessoasJuridica;
    	
    }
    
    public Map<String,PessoaFisica> getPessoasFisica(){
    	for(String chave :pessoasFisica.keySet()){
			PessoaFisica pessoaFisica = pessoasFisica.get(chave);
			System.out.println(pessoaFisica.toString());
		}
    	return pessoasFisica;
    }
    
    public Map<String,PessoaJuridica> getPessoasJuridica(){
    	for(String chave :pessoasJuridica.keySet()){
    		PessoaJuridica pessoaJuridica = pessoasJuridica.get(chave);
    		System.out.println(pessoaJuridica.toString());
		}
    	return pessoasJuridica;
    }

}
