package packCart;

/**
 * Created by Gudilin on 18.09.2020.
 */
public class Cart {
    private String name;
    private int Quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getName() {

        return name;
    }

    public int getQuantity() {
        return Quantity;
    }
}
