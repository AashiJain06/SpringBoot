package in.aj.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.aj.main.entity.User;

@Repository
public class DaoLayer 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public boolean insert(User user)
	{
	 boolean status = false;
	try
	{
		String Insert_query = "insert into user(name,roll,city) values(?,?,?)";
		int count = jdbcTemplate.update(Insert_query,user.getName(),user.getRoll(),user.getCity());
		if(count>0)
			status= true;
		else
			status= false;
	}
	catch(Exception e)
	{
		status = false;
		e.printStackTrace();
		System.out.println("Error Occured :"+e.getMessage());
	}
	return status;
	}

}
