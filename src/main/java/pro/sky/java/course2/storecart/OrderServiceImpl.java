package pro.sky.java.course2.storecart;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final CartRepository cart;

    public OrderServiceImpl(CartRepository cart) {
        this.cart = cart;
    }

    @Override
    public void add(Integer... items) {
        for (Integer item : items) {
            cart.getCart().add(item);
        }
    }

    @Override
    public List<Integer> get() {
        return Collections.unmodifiableList(cart.getCart());
    }
}
