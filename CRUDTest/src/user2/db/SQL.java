package user2.db;

public class SQL {
	
	// SQL 문은 public static final로 선언한다 수정할 일 없으므로 final, 어디서든지 쓸 수 있도록 public static
	
	public static final String INSERT_USER1  = "insert into `user1` set "
												+ "`uid`=?,"
												+ "`name`=?,"
												+ "`birth`=?,"
												+ "`hp`=?,"
												+ "`age`=?";
	
	public static final String SELECT_USER1  = "select * from `user1` where `uid`=?";
	public static final String SELECT_USER1S = "select * from `user1`";
	public static final String UPDATE_USER1  = "update `user1` set "
												+ "`name`=?,"
												+ "`birth`=?,"
												+ "`hp`=?,"
												+ "`age`=? "
												+ "where `uid`=?";
	
	public static final String DELETE_USER1  = "delete from `user1` where `uid`=?";

	
	
	
}
