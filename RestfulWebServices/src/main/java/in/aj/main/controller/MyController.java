package in.aj.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.aj.main.entity.User;
import in.aj.main.service.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/user")
	public User getUser(@RequestBody User user)
	{
		
		return userService.insertUser(user);
	}
	@GetMapping("/user")
	public List<User> getUser()
	{
		return userService.getUser();
	}

}
