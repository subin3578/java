package user2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	// DB정보 - 수정이 없을 정보이므로 final 그리고 static 으로 선언함
	private final  String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final  String USER ="root";
	private final  String PASS ="1234";
	
	// DB 자원 - private을 자식들이 못쓰므로 protected로 선언 나중에 DAO 들이 상속받을거임
	protected Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement psmt = null;
	protected ResultSet rs = null;

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(HOST,USER,PASS);
	}
	
	public void closeAll() throws SQLException{
		if(rs!=null) {
			 rs.close();
		}
		if(psmt!=null) {
			psmt.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}
	
	
	
}
