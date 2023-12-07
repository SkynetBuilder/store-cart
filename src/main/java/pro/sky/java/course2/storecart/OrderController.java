package pro.sky.java.course2.storecart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("items") Integer... items) {
        orderService.add(items);
        return "Items added!";
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return orderService.get();
    }
}