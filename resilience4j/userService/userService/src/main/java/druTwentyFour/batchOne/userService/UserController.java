package druTwentyFour.batchOne.userService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/user-service")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	//any name of your choice
	public static final String USER_SERVICE="userService";

	private static final String BASEURL = "http://localhost:9191/orders";

	@GetMapping("/displayOrders")
	public List<OrderDTO> displayOrders() {
		return restTemplate.getForObject(BASEURL, ArrayList.class);
	}
	
	
	
//	@CircuitBreaker(name =USER_SERVICE,fallbackMethod = "getAllAvailableProducts")

//	//note return type should be same as the original method
//	public List<OrderDTO> getAllAvailableProducts(Exception e){
//		return Stream.of(
//				new OrderDTO(111,"pen","stationary","green",9999),
//				new OrderDTO(345, "Headset", "electronics", "black", 7000),
//				new OrderDTO(475, "Sound bar", "electronics", "black", 13000),
//				new OrderDTO(574, "Puma Shoes", "foot wear", "black & white", 4600),
//				new OrderDTO(678, "Vegetable chopper", "kitchen", "blue", 999),
//				new OrderDTO(532, "Oven Gloves", "kitchen", "gray", 745)
//				).collect(Collectors.toList());
//	}
}
