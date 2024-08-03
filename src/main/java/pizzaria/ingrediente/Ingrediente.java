package pizzaria.ingrediente;

import pizzaria.item.Item;

public class Ingrediente  implements Item {

    private String nome;
    private double preco;

    public Ingrediente(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void exibe() {
        System.out.println("Ingrediente: " + nome + " com o preço: "+getPreco());
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
