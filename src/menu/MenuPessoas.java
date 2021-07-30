package menu;

import java.util.Map;
import java.util.Scanner;

import entity.pessoa.PessoaFisica;
import entity.pessoa.PessoaJuridica;

public interface MenuPessoas {
    public void remover(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user);
    public void exibir(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user);
    public void adicionar(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user);
    public void verificar(Map<String,PessoaFisica> pessoasFisicas, Map<String,PessoaJuridica> pessoasJuridicas, Scanner entrada, int user);
}
