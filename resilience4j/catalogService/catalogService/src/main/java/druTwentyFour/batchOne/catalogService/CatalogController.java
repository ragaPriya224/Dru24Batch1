package druTwentyFour.batchOne.catalogService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class CatalogController {
    @Autowired
    private OrderRepository orderRepository;


	@GetMapping
	public List<Order> getOrders(){
		return orderRepository.findAll();
	}
}