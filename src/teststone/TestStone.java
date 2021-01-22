package teststone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Diego Batista
 */
public class TestStone {

    public static void main(String[] args) {

        List<Item> itens = new ArrayList<>();
        List<String> emails = new ArrayList<>();
        
        itens.add(new Item("Laranja", 3, 300));
        itens.add(new Item("Morango", 5, 700));
        itens.add(new Item("Maçã", 6, 1000));
        itens.add(new Item("Batata", 2, 250));
        itens.add(new Item("Cebola", 3, 200));

        emails.add("diego@gmail.com");
        emails.add("fernando@gmail.com");
        emails.add("batista@gmail.com");

        Map<String, Integer> resultado = Desafio.calcula(itens, emails);
        System.out.println(resultado);
    }
}
