package com.carinventory.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.carinventory.model.Car;

public class CarDao {
	@Autowired
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveCarDetails(Car car) {
		String insertCar="insert into car values("+car.getId()+",'"+car.getMake()+"','"+car.getModel()+"',"+car.getYear()+","+car.getSalesPrice()+")";
		return template.update(insertCar);
		}
	
	public List<Car> getAllCarDetails(){  
		 return template.query("select * from car",new RowMapper<Car>(){  
		  
		    public Car mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Car c=new Car();  
		        c.setId(rs.getInt(1));  
		        c.setMake(rs.getString(2));  
		        c.setModel(rs.getString(3)); 
		        c.setYear(rs.getInt(4));
		        c.setSalesPrice(rs.getFloat(5));
		        return c;  
		    }  
		    });  
	}
}



