package user2.dao;

import java.sql.SQLException;
import java.util.List;

import user2.db.DBHelper;
import user2.db.SQL;
import user2.vo.User2VO;

public class User2DAO extends DBHelper {

	// 싱글톤 객체 -  하나의 객체를 생성하여 모두 공유하여 사용할 것
	//instance 생성 = > getter 생성 => 생성자 private 선언
	private static User2DAO instance = new User2DAO();
	public static User2DAO getInstance() {
		return instance;
	}
	private User2DAO() {}


	// 왜 return 타입이 int? 이 값은 몇개의 행에 적용되었는지를 나타내는 즉 sql 에서 "1 row(s) affected" 에서 1을 받아올 것이기 때문이다
	public int insertUser(User2VO vo) {
		
		int result = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER1);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());			
			psmt.setInt(5, vo.getAge());			
			result = psmt.executeUpdate();
			closeAll();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public User2VO selectUser(String uid) {
		
		User2VO vo = null;
		try {
			conn=getConnection();
			psmt=conn.prepareStatement(SQL.SELECT_USER1);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAge(rs.getInt(5));
			}
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public List<User2DAO> selectUsers() {
		return null;
	}
	public int updateUser(User2VO vo) {
		return 0;
	}
	public int deleteUser(String uid) {
		return 0;
	}
	
}
