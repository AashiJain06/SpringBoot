package in.aj.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.aj.main.entity.User;
import in.aj.main.service.UserService;

@Controller

public class MyController {
	
	@Autowired	
	private UserService userService;
	
	
	@GetMapping("/regform")
	public String registerForm(Model model)
	{
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regSubmit")
	public String submitRegister(@ModelAttribute("user") User user,Model model)
	{
		boolean status = userService.insertUser(user);
		if(status)
		{
			model.addAttribute("sucessMsg","User registered Sucessfully" );
		}
		else
		{
			model.addAttribute("errorMsg","User is not registered ");
		}
		return "register";
	}
}
