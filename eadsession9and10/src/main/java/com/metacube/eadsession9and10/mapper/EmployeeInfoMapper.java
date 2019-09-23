/**
 * 
 */
package com.metacube.eadsession9and10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;

import com.metacube.eadsession9and10.mode.commands.EmployeeInfo;

/**
 * This is mapper class with jdbc Template of EmployeeInfo class *
 */
public class EmployeeInfoMapper implements RowMapper<EmployeeInfo> {

	@Override
	public EmployeeInfo mapRow(ResultSet result, int i) throws SQLException,
			EmptyResultDataAccessException {

		EmployeeInfo info = new EmployeeInfo();
		while(result.next()){
			info.setEmail(result.getString("email"));
			info.setEmpId(result.getString("empId"));
			info.setPassword(result.getString("password"));
			info.setVehicleNumber(result.getString("vehicleNumber"));
			info.setImage(result.getString("name"));
			System.out.println(result.getString("email"));
			
		}
		return info;
		
	}

}
