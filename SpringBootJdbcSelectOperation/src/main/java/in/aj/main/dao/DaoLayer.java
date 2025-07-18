package in.aj.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.aj.main.entity.User;
import in.aj.main.mappers.UserRowMapper;

@Repository
public class DaoLayer 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<User> select()
	{
		List<User> list = new ArrayList<>();
	try
	{
		String select_query = "select * from user";
		list = jdbcTemplate.query(select_query, new UserRowMapper<User>());
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Error Occured :"+e.getMessage());
	}
	return list;

	}

}
