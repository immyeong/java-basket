public interface CartService {

    public void showitems();

    void addProduct(String name,int quantity);

    // Method to remove a product from the cart
    void removeProduct(String name,int quantity);
}
