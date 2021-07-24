package menu;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.Endereco;
import entity.pessoa.PessoaFisica;
import entity.pessoa.Status;

public class MenuPessoaImpl implements MenuPessoa{

    @Override
    public void remover(Map<String,PessoaFisica> pessoas,Scanner entrada) {
        int opc = 0;
        do{
            System.out.println("Digite a chave do usuario para remover:");
            Integer chave = entrada.nextInt();
            entrada.nextLine();

            String verificarChave = Integer.toString(chave);

            if(pessoas.containsKey(verificarChave)){
                pessoas.remove(verificarChave);
                System.out.println("[SUCESSO]: Usuario removido!");
            }else{
                System.out.println("[AVISO]: Usuario nao encontrado!");
            }

            System.out.println("Deseja continuar removendo? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
       
    }

    @Override
    public void exibir(Map<String, PessoaFisica> pessoas) {
        for(String chave : pessoas.keySet()){
            PessoaFisica pessoa = pessoas.get(chave);
            System.out.println("Chave: " + chave + "| Nome: " + pessoa.getNome() + 
            " | Status: " + pessoa.getStatus() + " | " + pessoa.getEndereco().toString());
        }
        
    }

    @Override
    public void adicionar(Map<String, PessoaFisica> pessoas, Scanner entrada) {
        int opc = 0;
        do{
            System.out.println("Digite a chave do usuario:");
            Integer chave = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Digite o nome do usuario:");
            String nome = entrada.nextLine();

            System.out.println("Digite o cpf:");
            String cpf = entrada.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = entrada.nextLine();

            Endereco endereco = cadastrarEndereco(entrada);

            System.out.println("Gerente ou cliente?(1 - Gerente | 2 - Cliente)");
            Integer tipoUsuario = entrada.nextInt();
            entrada.nextLine();    

            Status status = tipoUsuario == 1 ? Status.GERENTE : Status.CLIENTE;


            String key = Integer.toString(chave);
            PessoaFisica p = new PessoaFisica(chave,nome,cpf,senha,endereco, status);

            pessoas.put(key, p);

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
    public void verificar(Map<String, PessoaFisica> pessoas, Scanner entrada) {
        int opc = 0;
        do{
            System.out.println("Digite a chave do produto para verificar:");
            Integer chave = entrada.nextInt();
            entrada.nextLine();

            String verificarChave = Integer.toString(chave);

            if(pessoas.containsKey(verificarChave)){
                System.out.println("[SUCESSO]: Pessoa cadastrada!");
            }else{
                System.out.println("[AVISO]: Pessoa nao encontrado!");
            }
            System.out.println("Deseja continuar verificando se ha uma pessoa? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
    }
        
}
