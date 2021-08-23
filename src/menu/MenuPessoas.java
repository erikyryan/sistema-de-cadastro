package menu;

import entity.Sistema;

public interface MenuPessoas {
    public void remover(Sistema sistema, int user);
    public void exibir(Sistema sistema, int user);
    public void adicionar(Sistema sistema, int user);
}
