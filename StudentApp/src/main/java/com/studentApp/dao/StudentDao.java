package com.studentApp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.studentApp.bean.StudentInfo;

@Component
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveStudent(StudentInfo studinfo) {

		String sql = "insert into student values (?,?,?,?,?);";

		Object[] params = { studinfo.getRollnumber(), studinfo.getFirstName(), studinfo.getLsatName(),
				studinfo.getMo_number(), studinfo.getCity() };

		int status = jdbcTemplate.update(sql, params);

		return status;

	}

	public List<StudentInfo> viewStudents() {

		String sql = "select * from student";

		return jdbcTemplate.query(sql, new StudentRowmapper());

	}

	public StudentInfo getByRollnumber(int rollnumber) {

		String sql = "select * from student where rollnumber=" + rollnumber;

		StudentInfo st = jdbcTemplate.queryForObject(sql, new StudentRowmapper());

		// System.out.println(st);

		return st;

	}

	public void updateStudet(StudentInfo st) {

		String sql = "update student set firstname=?,lastname=?,mo_number=?,city=? where rollnumber=?";

		Object[] params = { st.getFirstName(), st.getLsatName(), st.getMo_number(), st.getCity(), st.getRollnumber() };

		jdbcTemplate.update(sql, params);

	}

	public void deleteRecord(int rollnumber) {
		
		String sql="delete from student where rollnumber="+rollnumber;
		
		jdbcTemplate.update(sql);
		
	}
	
	private class StudentRowmapper implements RowMapper<StudentInfo> {

		public StudentInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
			StudentInfo studinfo = new StudentInfo();

			studinfo.setRollnumber(rs.getInt("rollnumber"));
			studinfo.setFirstName(rs.getString("firstname"));
			studinfo.setLsatName(rs.getString("lastname"));
			studinfo.setMo_number(rs.getString("mo_number"));
			studinfo.setCity(rs.getString("city"));

			return studinfo;
		}

	}

}
