import com.workintech.abstraction.Bread;
import com.workintech.abstraction.Chocolate;
import com.workintech.abstraction.Coke;
import com.workintech.abstraction.ProductForSale;

public class Store {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Dark", 50,"Chocolate", "Milka");
        Coke coke = new Coke("Light", 25,"Cola", "Coca-Cola");
        Bread bread = new Bread("Pita", 7,"Bread", "Ramazan's Pita");

        ProductForSale[] products = {chocolate, coke, bread};

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("-------------------------");
        }
    }
}