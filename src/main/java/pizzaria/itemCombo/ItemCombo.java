package pizzaria.itemCombo;

import pizzaria.item.Item;

public class ItemCombo implements Item {

    private String nome;
    private double preco;

    public ItemCombo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void exibe() {
        System.out.println("Item do combo: " + nome + " com o preço: "+preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
