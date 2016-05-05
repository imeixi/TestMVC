package cn.imeixi.java.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.attribute.ResolutionSyntax;

public class StudentDao {
	
	public void deleteStudent(int stuId){

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			String classDriver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://qdm161904473.my3w.com:3306/qdm161904473_db";
			String user = "qdm161904473";
			String password = "12345678";
			
			Class.forName(classDriver);
			connection = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM student WHERE stu_Id = ?";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, stuId);
			preparedStatement.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			
			try {
				if(preparedStatement != null){
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(connection != null){
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Student> getAll(){

		List<Student> students = new ArrayList<Student>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String classDriver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://qdm161904473.my3w.com:3306/qdm161904473_db";
			String user = "qdm161904473";
			String password = "12345678";
			
			Class.forName(classDriver);
			connection = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT stu_id stuId,stu_name stuName,sex,birth,score FROM student";
			preparedStatement = connection.prepareStatement(sql);
			
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				int stuId = resultSet.getInt(1); 
				String stuName = resultSet.getString(2); 
				String sex = resultSet.getString(3); 
				Date birth = resultSet.getDate(4); 
				String score = resultSet.getString(5); 
				Student student = new Student(stuId, stuName, sex, birth, Integer.parseInt(score));
				students.add(student);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(resultSet != null){
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(preparedStatement != null){
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(connection != null){
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return students;
	}
}
