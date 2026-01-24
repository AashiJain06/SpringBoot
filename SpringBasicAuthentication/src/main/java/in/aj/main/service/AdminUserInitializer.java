package in.aj.main.service;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import in.aj.main.entity.User;
import in.aj.main.repository.UserRepository;

@Component
public class AdminUserInitializer {
	@Bean
	public CommandLineRunner createAdminUser(UserRepository userRepository,PasswordEncoder passwordEncoder)
	{
		return args->
		{
			if(userRepository.findByUsername("admin").isEmpty())
			{
				User admin = new User();
				admin.setUsername("admin");
				admin.setPassword(passwordEncoder.encode("admin123"));
				admin.setRole("Admin");
				
				userRepository.save(admin);
				System.out.println("Default admin is created");
			}
		};
	}

}

