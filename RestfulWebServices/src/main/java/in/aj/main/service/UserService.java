package in.aj.main.service;

import java.util.List;

import in.aj.main.entity.User;

public interface UserService {
	public User insertUser(User user);
	public List<User> getUser();

}
