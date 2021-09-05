package io.suriya;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/cars")
	public List<String> getCarNames(){
		return Arrays.asList("Ferrari","BMW", "Benz");
	}
}
