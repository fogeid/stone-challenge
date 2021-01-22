package teststone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Diego Batista
 */
public class Desafio {
    public static Map<String, Integer> calcula(List<Item> itens, List<String> emails) {
        Map<String, Integer> resultado = new HashMap<String, Integer>();
        
        int quantityEmails = emails.size();
        int valueTotal = 0;     
  
        // Soma dos preços pela quantidade de itens        
        for (Item i : itens) { 
            valueTotal += i.getQuantity() * i.getPrice();
        }
        
        int valuePerson = valueTotal / quantityEmails;       
        for (int i = 0; i < quantityEmails; i++) { 
            resultado.put(emails.get(i), valuePerson);
        }
        
        // Distribui o centavos que sobrar        
        int centsDist = valueTotal - (valuePerson * quantityEmails);
        int contEmails = 0;
        while (centsDist > 0) {
            if (contEmails >= quantityEmails) {
                contEmails = 0;
            }
            resultado.put(emails.get(contEmails), valuePerson + 1);
            centsDist--;
            contEmails++;
        }
        
        return resultado;
    }
}

