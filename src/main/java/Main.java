import pizzaria.combo.Combo;
import pizzaria.ingrediente.Ingrediente;
import pizzaria.itemCombo.ItemCombo;
import pizzaria.pizza.Pizza;

public class Main {
    public static void main(String[] args) {

        Combo combo = new Combo();

        combo.addPizza(new Pizza("Mode do chef"));
        combo.pizzas.get(0).addIngrediente(new Ingrediente("Frango",5.00));
        combo.pizzas.get(0).addIngrediente(new Ingrediente("Queijo",5.00));
        combo.pizzas.get(0).addIngrediente(new Ingrediente("Cheddar",5.00));

        combo.addItem(new ItemCombo("Coca grande",10.00));

        combo.exibe();


    }

}
