package pro.sky.java.course2.storecart;

import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

public interface OrderService {
    void add(Integer... items);

    List<Integer> get();
}