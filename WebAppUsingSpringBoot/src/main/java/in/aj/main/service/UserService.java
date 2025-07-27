package in.aj.main.service;

import in.aj.main.entity.User;

public interface UserService {
	public boolean insertUser(User user);
	public User selectUser(String email,String password);

}
