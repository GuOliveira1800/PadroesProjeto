package pizzaria.combo;

import pizzaria.item.Item;
import pizzaria.itemCombo.ItemCombo;
import pizzaria.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Item {

    String nome;
    public List<Pizza> pizzas;
    public List<ItemCombo> itens;

    public Combo() {
        pizzas = new ArrayList();
        itens = new ArrayList();
    }

    @Override
    public void exibe() {
        pizzas.forEach(Pizza::exibe);
        itens.forEach(ItemCombo::exibe);
        System.out.println("Preço Total: "+getPreco());
    }

    @Override
    public double getPreco() {
        return pizzas.stream()
                .mapToDouble(Pizza::getPreco)
                .reduce(0.0, (a, b) -> a + b) +
                itens.stream()
                        .mapToDouble(ItemCombo::getPreco)
                        .reduce(0.0, (a, b) -> a + b);
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    public void addItem(ItemCombo itemCombo){
        itens.add(itemCombo);
    }

}
