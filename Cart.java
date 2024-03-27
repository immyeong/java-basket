import java.util.HashMap;
import java.util.Map;

public class Cart implements CartService{

    private Map<String, Integer> items;

    // Constructor
    public Cart() {
        items = new HashMap<>();
    }

    // Method to display items in the cart
    @Override
    public void showitems() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
        } else {
            System.out.println("\n- - - - - - - - - - -\n");
            System.out.println("장바구니 목록 :");
            for(String key : items.keySet()){
                System.out.println(key + items.get(key)+" 개");
            }
        }
    }

    // Method to add a product to the cart
    @Override
    public void addProduct(String name,int quantity) {


        if(items.containsKey(name)){
            items.put(name, items.get(name) + quantity);
        }else{
            items.put(name, items.getOrDefault(name,0) +quantity);
        }


        System.out.printf("추가한 상품  : %s %d개%n",name,quantity);
    }

    // Method to remove a product from the cart
    @Override
    public void removeProduct(String name,int quantity) {
        if (items.get(name) - quantity == 0) {
            items.remove(name);
            System.out.printf("제거한 상품  : %s %d개%n",name,quantity);
        }else if(items.get(name) - quantity > 0){
            items.put(name, items.get(name)-quantity);
            System.out.printf("제거한 상품  : %s %d개%n",name,quantity);
        }
        else {
            System.out.println("선택한 상품이 없습니다. " + name);
        }
    }
}
