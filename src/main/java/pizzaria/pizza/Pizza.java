package pizzaria.pizza;

import pizzaria.ingrediente.Ingrediente;
import pizzaria.item.Item;

import java.util.ArrayList;

public class Pizza  implements Item {

    String nome;
    private ArrayList<Ingrediente> ingredientes;

    public Pizza(String nome) {
        this.nome = nome;
        ingredientes = new ArrayList<>();
    }

    @Override
    public void exibe() {
        System.out.println("Pizza: "+nome);
        ingredientes.forEach(Ingrediente::exibe);
        System.out.println("Preço Total: "+getPreco());
    }

    @Override
    public double getPreco() {
        return ingredientes.stream()
                .mapToDouble(Ingrediente::getPreco)
                .reduce(0.0, (a, b) -> a + b);

    }

    public void addIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

}
