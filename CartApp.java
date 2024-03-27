import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        Product product1 = new Product("우유", 1000);
        Product product2 = new Product("사과", 2000);
        productSet.add(product1);
        productSet.add(product2);

        System.out.println("고유한 상품 목록:");
        for(Product product : productSet){
            System.out.println(product.getName() + " : " + product.getPrice());
        }


        Cart myCart = new Cart();

        //Todo : 상품을 장바구니에 추가
        myCart.addProduct("우유", 1);
        myCart.addProduct("사과", 2);
        myCart.addProduct("우유", 2);

        //Todo : 상품을 장바구니에서 제거
        myCart.removeProduct("우유", 1);

        //Todo : 장바구니에 현재 담긴 상품들을 출력(상품이름, 각 상품의 갯수)
        myCart.showitems();
    }
}
