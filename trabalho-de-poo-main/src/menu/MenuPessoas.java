package menu;

import java.util.Map;
import java.util.Scanner;

import entity.Sistema;
import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;

public interface MenuPessoas {
    public void remover(Sistema sistema, int user);
    public void exibir(Sistema sistema, int user);
    public void adicionar(Sistema sistema, int user);
}
