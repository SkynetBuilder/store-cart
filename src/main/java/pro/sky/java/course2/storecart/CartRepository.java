package pro.sky.java.course2.storecart;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class CartRepository {
    private List<Integer> cart;

    public CartRepository(List<Integer> cart) {
        this.cart = new ArrayList<>(cart);
    }

    public List<Integer> getCart() {
        return cart;
    }
}
