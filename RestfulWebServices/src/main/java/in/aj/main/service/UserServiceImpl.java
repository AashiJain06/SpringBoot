package in.aj.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aj.main.entity.User;
import in.aj.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;

	@Override
	public User insertUser(User user) {
		userRepo.save(user);
		return user;		
	}

	@Override
	public List<User> getUser() {
		return userRepo.findAll();
	}

}
