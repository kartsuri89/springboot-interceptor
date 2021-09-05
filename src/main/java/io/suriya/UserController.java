package io.suriya;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<String> getUsers(){
		return Arrays.asList("Rathan Tata","Elon","Gates");
	}
}
