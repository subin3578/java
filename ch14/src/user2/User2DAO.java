package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User2DAO {
	
	// 싱글톤
	private static User2DAO instance = new User2DAO();
	public static User2DAO getInstance(){
		return instance;
	}
	private User2DAO() {} 
	
	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User2VO vo){
		
		String sql = "INSERT INTO user1 VALUES (?,?,?,?,?)";
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());
			psmt.setInt(5, vo.getAge());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public List<User2VO> selectUsers(){		
		String sql = "SELECT * from user1";
		List<User2VO> users = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		
			while(rs.next()) {
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	return null;
	}
	
	
	public User2VO selectUser(String uid){
		return null;
	}
	public int updateUser(User2VO vo){		return 0;}
	public int deleteUser(User2VO vo){		return 0;}
	
}











