package in.aj.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aj.main.entity.User;
import in.aj.main.repository.UserRepository;
@Service

public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;

	@Override
	public boolean insertUser(User user) {
		try
		{
			userRepo.save(user);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error Occured :"+e.getMessage());
			return false;
		}
	}

	@Override
	public User selectUser(String email, String password) {
		User user = userRepo.findByEmail(email);
		if(user !=null && user.getPassword().equals(password))
		{
		 return user;
		}
		
		return null;
	}

}
