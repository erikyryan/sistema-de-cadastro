package menu;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;

public interface MenuPessoa {
    public void remover(Map<String,PessoaFisica> pessoas,Scanner entrada);
    public void exibir(Map<String,PessoaFisica> pessoas);
    public void adicionar(Map<String,PessoaFisica> pessoas,Scanner entrada);
    public void verificar(Map<String,PessoaFisica> pessoas,Scanner entrada);
}
