import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> produto = new HashMap<>();

        produto.put("Notebook",4500.00);
        produto.put("Mouse",80.00);
        produto.put("Monitor",1200.00);
        produto.put("Teclado",120.00);

        for (Double preco : produto.values()){
            System.out.println("Desconto de 10%: " + (preco - (preco*0.1)) + ".");
        }
    }
}