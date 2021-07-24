package menu;


import java.util.Scanner;

import entity.pessoa.PessoaFisica;

public interface MenuVeiculo {
    public void remover(PessoaFisica pessoa, Scanner entrada);
    public void adicionar(PessoaFisica pessoa, Scanner entrada);
	public void exibir(PessoaFisica pessoa);
}
