package menu;

import java.util.Scanner;

import entity.pessoa.PessoaFisica;
import entity.veiculo.Carro;
import entity.veiculo.Especificacao;
import entity.veiculo.Status;

public class MenuVeiculoImpl implements MenuVeiculo{

	@Override
	public void remover(PessoaFisica pessoa, Scanner entrada) {
		int opc = 0;
        do {
        	exibir(pessoa);
            System.out.println("Digite a posição do seu carro: ");
            int id = entrada.nextInt();
            entrada.nextLine();
            
            pessoa.getCarros().remove(id);
           
            System.out.println("Deseja continuar removendo? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
        
	}

	@Override
	public void exibir(PessoaFisica pessoa) {
		pessoa.getCarros().forEach(carro -> {
			System.out.println(pessoa.getCarros().indexOf(pessoa) + 
					" | " + carro.toString());
		});
	}

	@Override
	public void adicionar(PessoaFisica pessoa, Scanner entrada) {
		int opc = 0;
        do {
            System.out.println("Digite o id do seu carro: ");
            int id = entrada.nextInt();
            entrada.nextLine();
            
            System.out.println("Digite o nome do fabricante: ");
            String fabricante = entrada.nextLine();

            System.out.println("Digite o modelo do seu carro: ");
            String modelo = entrada.nextLine();
            
            System.out.println("Digite a cor do seu carro:");
            String cor = entrada.nextLine();
            
            System.out.println("Em que condição se encontra seu carro? (1 - novo, 2 - seminovo, 3 - velho");
            int condicao = entrada.nextInt();
            entrada.nextLine();
            
            if(condicao > 0 && condicao < 4) {
	            Status status = null;
	            switch(condicao) {
	           	case 1:
	            	status = Status.NOVO;
	            	break;
	           	case 2:
	           		status = Status.SEMINOVO;
	           		break;
	           	case 3:
	           		status = Status.VELHO;
	           		break;
	           	default:
	           		System.out.println("[ALERTA]: Opcao invalida!");
	            }
	            
	            Especificacao especificacao = new Especificacao(modelo,cor,fabricante);
	            Carro carro = new Carro(id,status,especificacao);
	            pessoa.setCarro(carro);
	                 
            }else
            	System.out.println("Status inválido!");
            
            System.out.println("Deseja continuar armazenando? (0 - Sim, 1 - Nao)");
            opc = entrada.nextInt();
            entrada.nextLine();
            opc = opc == 1 ? -1 : 0; 
        }while(opc != -1);
		
	}



}
