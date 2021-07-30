package menu;



import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import entity.pessoa.Endereco;
import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;
import entity.veiculo.TipoDeVeiculo;
import entity.veiculo.Veiculo;
import exception.ResourceNotFoundException;

public class MenuPessoasImpl implements MenuPessoas{

    @Override
    public void remover(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user) {
        int opc = 0;
        do{

            System.out.println("Digite a chave do usuario para remover:");
            Integer chave = entrada.nextInt();
            entrada.nextLine();

            String verificarChave = Integer.toString(chave);

            if(user == 1 && pessoasFisicas.containsKey(verificarChave)){
            	pessoasFisicas.remove(verificarChave);
                System.out.println("[SUCESSO]: Pessoa fisica removido!");
            }else if(user == 2 && pessoasJuridicas.containsKey(verificarChave)){
            	pessoasJuridicas.remove(verificarChave);
                System.out.println("[SUCESSO]: Pessoa Juridica removido!");
            }else {
                System.out.println("[AVISO]: Usuario nao encontrado!");
            }

            System.out.println("Deseja continuar removendo? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
       
    }

    @Override
    public void exibir(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user) {
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
            System.out.println("[AVISO]: Lista de  usuarios nao encontrada!");
        }
        
        
    }

    @Override
    public void adicionar(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user) {
        int opc = 0;
        do{
            System.out.println("Digite a chave do usuario:");
            Integer chave = entrada.nextInt();
            entrada.nextLine();
            String id = Integer.toString(chave);

            System.out.println("Digite o nome do usuario:");
            String nome = entrada.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = entrada.nextLine();

            Endereco endereco = cadastrarEndereco(entrada);
            
            String identificacao = tipoDeUsuario(entrada,user);
            
            List<Veiculo> veiculos = adicionarVeiculo(entrada);
            if(user == 1) {
	           PessoaFisica pessoaFisica = new PessoaFisica(chave, nome, identificacao, senha, endereco, veiculos);
	           pessoasFisicas.put(id, pessoaFisica);
            }else if (user == 2) {
            	 PessoaJuridica pessoaJuridica = new PessoaJuridica(chave, nome, identificacao, senha, endereco, veiculos);
            	 pessoasJuridicas.put(id, pessoaJuridica);
            }else {
            	
            }

            System.out.println("Deseja continuar armazenando? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
        
    }

    private Endereco cadastrarEndereco(Scanner entrada){
        System.out.println("Digite sua cidade:");
        String cidade = entrada.nextLine();

        System.out.println("Digite o CEP da sua cidade:");
        String cep = entrada.nextLine();

        System.out.println("Digite o numero da sua casa:");
        String numero = entrada.nextLine();

        Endereco endereco = new Endereco(cidade,cep,numero);

        return endereco;
    }

    @Override
    public void verificar(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user) {
        int opc = 0;
        do{
            System.out.println("Digite a chave do pessoa para verificar:");
            Integer chave = entrada.nextInt();
            entrada.nextLine();

            String verificarChave = Integer.toString(chave);
            if(user == 1) {
            	if(pessoasFisicas.containsKey(verificarChave))
            		System.out.println("[SUCESSO]: Pessoa Física cadastrada!");
            }else if(user == 2) {
            	if(pessoasJuridicas.containsKey(verificarChave))
            		System.out.println("[SUCESSO]: Pessoa Juridica cadastrada!");
            }else{
                System.out.println("[AVISO]: Pessoa nao encontrado!");
            }
            System.out.println("Deseja continuar verificando se ha uma pessoa? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
    }
    
    public String tipoDeUsuario( Scanner entrada, int user){       
        try {
	        switch(user){
	            case 1:
	               System.out.println("Digite o cpf:");
	               String cpf = entrada.nextLine();
	               return cpf;
	            case 2:
	               System.out.println("Digite o cnpj:");
	               String cnpj = entrada.nextLine();
	               return cnpj;	
	            default:
	                throw new ResourceNotFoundException();
	        }
        }catch(ResourceNotFoundException e) {
        	System.err.println("[ERROR]: " + e.toString());
        }catch(Exception e) {
        	System.err.println("[ERROR]: " + e.toString());
        }
        
        return null;
    }

    private List<Veiculo> adicionarVeiculo(Scanner entrada) {
        try {
        	List<Veiculo> veiculos = new ArrayList<>();
        	int opc;
        	do {
	        	System.out.println("Voce deseja adicionar um veiculo? (0 - Sim, 1 - Nao)");
	            int escolha = entrada.nextInt();
	            entrada.nextLine();
	        	if(escolha == 0) {
			        System.out.println("Digite o modelo do seu veiculo: ");
			        String modelo = entrada.nextLine();
			
			        System.out.println("Digite o nome da cor do seu veiculo:");
			        String cor = entrada.nextLine();
			
			        System.out.println("Digite o nome do fabricante seu veiculo:");
			        String fabricante = entrada.nextLine();
			
			        System.out.println("Qual o tipo do seu veiculo? ");
			        System.out.println(" 1 - CARRO,2 - MOTO, 3- CAMINHAO,");
			        int op = entrada.nextInt();
			        entrada.nextLine();
		        
			        switch(op){
			            case 1:
			            	veiculos.add(new Veiculo(TipoDeVeiculo.CARRO, modelo, cor, fabricante));
			            case 2:
			            	veiculos.add(new Veiculo(TipoDeVeiculo.MOTO, modelo, cor, fabricante));
			            case 3:
			            	veiculos.add(new Veiculo(TipoDeVeiculo.CAMINHAO, modelo, cor, fabricante));
			        }
	        	}else {
	        		veiculos.add(new Veiculo(TipoDeVeiculo.SEM_VEICULO, null, null, null));
	        	}
	        	
	        	System.out.println("Deseja continuar armazenando? (0 - Sim, 1 - Nao)");
	            opc = entrada.nextInt();
	            entrada.nextLine();
	            opc = opc == 1 ? -1 : 0; 
        	}while(opc == -1);
        }catch(ResourceNotFoundException e) {
        	System.err.println("[ERROR]: " + e.toString());
        }catch(Exception e) {
        	System.err.println("[ERROR]: " + e.toString());
        }
        
        return null;
    }
}
