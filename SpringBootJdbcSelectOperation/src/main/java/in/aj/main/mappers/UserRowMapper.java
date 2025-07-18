package in.aj.main.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.aj.main.entity.User;




public class UserRowMapper<T> implements RowMapper<T> {

	@Override
	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setName(rs.getString("name"));
		user.setRoll(rs.getInt("roll"));
		user.setCity(rs.getString("city"));
		return (T) user;
	}

	
	

	
	

	

	}

